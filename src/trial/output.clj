(ns trial.output
 (:import [org.elasticsearch.hadoop.cascading ESTap]
          [cascading.pipe Pipe]
          [cascading.tap.local StdOutTap]
          [cascading.flow.local LocalFlowConnector]
          [cascading.scheme.local TextLine]))

;; lein run -m trial.output
(defn -main []
  (let [in (ESTap. "radio/artists")
        out (StdOutTap. (TextLine.))]
    (.. (LocalFlowConnector.) (connect in out (Pipe. "read-from-ES")) complete)))

