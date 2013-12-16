(defproject elasticsearch-hadoop-trial "0.1.0-SNAPSHOT"
  :description "Example of using Cascalog with Elasticsearch"
  :url "http://example.com/FIXME"

  :jvm-opts ["-Xmx768m"]
  :repositories {"sonatype-oss" "http://oss.sonatype.org/content/repositories/snapshots"
                 "conjars.org" "http://conjars.org/repo" }

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [
                 [org.clojure/clojure "1.5.1" :exclusions [[org.slf4j/slf4j-log4j12] [log4j]]]
                 [org.elasticsearch/elasticsearch-hadoop "1.3.0.BUILD-SNAPSHOT"]
				 [org.apache.hadoop/hadoop-core "1.1.2"]
                ]
  :profiles { 
              :provided  { :dependencies [[org.apache.hadoop/hadoop-core "1.1.2"]] }
              :cascalog  { :dependencies [[cascalog "1.10.2"]] }
			})

