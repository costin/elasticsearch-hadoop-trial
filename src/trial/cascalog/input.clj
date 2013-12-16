(ns trial.cascalog.input
 (:import [org.elasticsearch.hadoop.cascading ESTap]
          [cascading.tuple Fields])
 (:require [cascalog.api :refer :all]
           [cascalog.workflow :as w]
 
           [cascalog.more-taps :as more]))

;; lein with-profile cascalog run -m trial.cascalog.input
(defn -main []
  (?- (ESTap. "radio/cascalog" (w/fields ["?name" "?url" "?picture"]))
      (<- [?name ?url ?picture] ([["jeroen" "http://github.com/jeroenvandijk" "https://secure.gravatar.com/avatar/3e626f6013805e96a95e999fc691b21f?s=420"]]
                                 ?name ?url ?picture))))

;; lein with-profile cascalog run -m trial.cascalog.input/delimited
(defn delimited []
  (?- (ESTap. "radio/cascalog" (w/fields ["?name" "?url" "?picture"]))
      (<- [?name ?url ?picture]
          ((more/lfs-delimited "resources/artists.dat" :outfields ["?id" "?name" "?url" "?picture"]) _ ?name ?url ?picture))))
		  