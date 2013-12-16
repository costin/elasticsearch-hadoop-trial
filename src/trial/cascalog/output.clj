(ns trial.cascalog.output
 (:import [org.elasticsearch.hadoop.cascading ESTap])
 (:require [cascalog.api :refer :all]))

;; lein with-profile cascalog run -m trial.cascalog.output  
(defn -main []
  (?- (stdout) (ESTap. "radio/cascalog")))

