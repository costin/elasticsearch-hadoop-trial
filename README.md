# elasticsearch-hadoop-trial

Experiment/Example of using Elasticsearch Hadoop with Cascading and Cascalog
Forked from [here](http://github.com/jeroenvandijk/elasticsearch-hadoop-trial)

## Usage

Install ElasticSearch (e.g via brew)

    brew install elasticsearch

Install Leiningen

    brew install leiningen
    
## Run scripts

### Cascading versions
Feeding data to ES
    
    lein run -m [trial.input](src/trial/input.clj)

[Result](http://gist.github.com/costin/7984824#file-1-trial-input)
Reading data from ES

    lein run -m [trial.output](src/trial/output.clj)

[Result](http://gist.github.com/costin/7984824#file-2-trial-output)	
### Cascalog versions
Feeding data to ES
    
    lein with-profile cascalog run -m [trial.cascalog.input](src/trial/cascalog/input.clj)

[Result](http://gist.github.com/costin/7984824#file-3-trial-cascalog-input)
Reading data from ES
    
    lein with-profile cascalog run -m [trial.cascalog.output](src/trial/cascalog/output.clj)

[Result](http://gist.github.com/costin/7984824#file-5-trial-cascalog-output)	
## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
