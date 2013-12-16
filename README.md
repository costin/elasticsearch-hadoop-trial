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
Feeding data to ES - [source](src/trial/input.clj)

    lein run -m trial.input


[Result](http://gist.github.com/costin/7984824#file-1-trial-input)

Reading data from ES - [source](src/trial/output.clj)

    lein run -m trial.output

[Result](http://gist.github.com/costin/7984824#file-2-trial-output)	
### Cascalog versions
Feeding data to ES - [source](src/trial/cascalog/input.clj)
    
    lein with-profile cascalog run -m trial.cascalog.input

[Result](http://gist.github.com/costin/7984824#file-3-trial-cascalog-input)
Reading data from ES - [source](src/trial/cascalog/output.clj)
    
    lein with-profile cascalog run -m trial.cascalog.output

[Result](http://gist.github.com/costin/7984824#file-5-trial-cascalog-output)	
## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
