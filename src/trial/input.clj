(ns trial.input
 (:import [org.elasticsearch.hadoop.cascading ESTap]
          [cascading.tuple Fields]
          [cascading.pipe Pipe]
          [cascading.tap.hadoop Lfs]
          [cascading.scheme.hadoop TextDelimited]
          [cascading.flow.hadoop HadoopFlowConnector]))

;; lein run -m trial.input
(defn -main []
  (let [in (Lfs. (TextDelimited.
                   (Fields. (into-array String ["?id" "?name", "?url", "?picture"]))) "resources/artists.dat")
        out (ESTap. "radio/artists" (Fields. (into-array String ["?name", "?url", "?picture"])))]
    (.. (HadoopFlowConnector.)
        (connect in out (Pipe. "write-to-ES"))
        complete)))

