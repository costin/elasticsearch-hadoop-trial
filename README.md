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
Feeding data to ES - [source](src/trial/input.clj)/[output](http://gist.github.com/costin/7984824#file-1-trial-input)

    lein run -m trial.input

Reading data from ES - [source](src/trial/output.clj)/[output](http://gist.github.com/costin/7984824#file-2-trial-output)	

    lein run -m trial.output

### Cascalog versions
Feeding data to ES - [source](src/trial/cascalog/input.clj)/[output](http://gist.github.com/costin/7984824#file-3-trial-cascalog-input)

    
    lein with-profile cascalog run -m trial.cascalog.input

Reading data from ES - [source](src/trial/cascalog/output.clj)/[output](http://gist.github.com/costin/7984824#file-5-trial-cascalog-output)	
    
    lein with-profile cascalog run -m trial.cascalog.output

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
