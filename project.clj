(defproject cld "0.2.0"
  :description "Clojure Language Detection"
  :url "https://github.com/dakrone/cld"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [io.github.emidln/langdetect "1.3"]]
  :profiles {:dev {:dependencies [[criterium "0.3.0"]]}}
  :resource-paths ["resources"]
  :warn-on-reflection false)
