(ns triangle.solution-test
  (:require
   [clojure.test :refer [deftest testing is are]]
   [triangle.solution :refer [triangle-type]]))

(deftest triangle-type-test
  (testing "equilateral triangle"
    (are [expected x] (= expected (apply triangle-type x))
      :equilateral [0.1  0.1  0.1]
      :equilateral [1.5  1.5  1.5]))

  (testing "isosceles triangle"
    (are [expected x] (= expected (apply triangle-type x))
      :isosceles [0.1  0.1  2.0]
      :isosceles [0.1  2.0  0.1]
      :isosceles [2.0  0.1  0.1]))

  (testing "scalene triangle"
    (are [expected x] (= expected (apply triangle-type x))
      :scalene [0.1  0.2  0.3]
      :scalene [0.3  0.1  0.2]
      :scalene [0.2  0.3  0.1])))
