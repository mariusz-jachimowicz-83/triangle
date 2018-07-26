(defproject com.mjachimowicz/triangle "0.1.0"
  :description "The triangle task solution"
  :url         "https://github.com/mariusz-jachimowicz-83/triangle"
  :license     {:name "Eclipse Public License"
                :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.cli "0.3.7"]]
  :main ^:skip-aot triangle.solution
  :uberjar-name "triangle.jar"
  ;; java -jar target/application.jar
  :uberjar {:aot :all}
  :profiles {:uberjar {:aot :all}})
