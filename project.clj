(defproject cld "0.1.2-SNAPSHOT"
  :description "Clojure Language Detection"
  :url "https://github.com/dakrone/cld"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.cybozu.labs/langdetect "1.2-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[criterium "0.3.0"]]}}
  :resource-paths ["resources"]
  :warn-on-reflection false)
