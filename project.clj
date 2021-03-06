(defproject alumbra "0.2.7-SNAPSHOT"
  :description "Simple and Elegant GraphQL for Clojure"
  :url "https://github.com/alumbra/alumbra"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"
            :year 2016
            :key "mit"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14" :scope "provided"]
                 [alumbra/claro "0.1.14"]
                 [alumbra/errors "0.1.1"]
                 [alumbra/pipeline "0.2.1"]
                 [alumbra/analyzer "0.1.17"]
                 [alumbra/validator "0.2.1"]
                 [alumbra/parser "0.1.7"]]
  :profiles {:dev
             {:dependencies [[aleph "0.4.3"]
                             [riddley "0.1.14"]
                             [clj-http "3.5.0"]]}
             :codox
             {:plugins [[lein-codox "0.10.3"]]
              :dependencies [[codox-theme-rdash "0.1.2"]]
              :codox {:project {:name "alumbra"}
                      :metadata {:doc/format :markdown}
                      :themes [:rdash]
                      :source-uri "https://github.com/alumbra/alumbra/blob/v{version}/{filepath}#L{line}"
                      :namespaces [alumbra.core]}}}
  :aliases {"codox" ["with-profile" "+codox" "codox"]}
  :pedantic? :abort)
