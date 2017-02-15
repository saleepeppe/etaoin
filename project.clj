(defproject etaoin "0.1.0-SNAPSHOT"
  :description "Pure Clojure Etaoin protocol implementation."
  :url "https://github.com/igrishaev/etaoin"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :profiles {:dev {:dependencies [[org.clojure/clojure "1.8.0"]
                                  [org.clojure/tools.nrepl "0.2.5"]]}}

  :dependencies [[clj-http "2.3.0"]
                 [cheshire "5.6.3"]
                 [org.clojure/data.codec "0.1.0"]])
