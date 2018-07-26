(ns triangle.solution
  (:require
   [clojure.string    :as string]
   [clojure.tools.cli :as cli])
  (:gen-class))

(defn- length-param-option
  "Returns client parameter specification used for parsing
   application invocation parameters from command line"
  [param-name]
  [(format "-%s" param-name)
   (format "--%s LENGTH" param-name)
   (format "Triangle %s side length" param-name)
   :parse-fn #(-> % read-string bigdec)
   :validate [#(and (number? %) (pos? %)) "length must value greater than 0"]])

(def cli-options
  [(length-param-option "a")
   (length-param-option "b")
   (length-param-option "c")
   ["-h" "--help"]])

(defn show-help-and-exit!
  [errors help exit-code]
  (when errors (->> errors (string/join \newline ) println))
  (println "Run me as \njava -jar triangle.jar \nwith parameters:")
  (println help)
  (System/exit exit-code))

(defn triangle-type
  [a b c]
  (let [x (bigdec a)
        y (bigdec b)
        z (bigdec c)]
    (cond
      (= x y z)
      :equilateral

      (or (= x y) (= y z) (= z x))
      :isosceles

      :else :scalene)))

(defn -main [& args]
	(let [{{:keys [a b c help]}
         :options :keys [arguments errors summary]} (cli/parse-opts args cli-options)]
    (when errors   (show-help-and-exit! errors summary 1))
    (when (nil? a) (show-help-and-exit! ["Please provide `a` triangle side length. Value is required"] summary 1))
    (when (nil? b) (show-help-and-exit! ["Please provide `b` triangle side length. Value is required"] summary 1))
    (when (nil? c) (show-help-and-exit! ["Please provide `c` triangle side length. Value is required"] summary 1))
    (when help     (show-help-and-exit! errors summary 0))
    (println (format "Triangle type is %s" (triangle-type a b c)))))
