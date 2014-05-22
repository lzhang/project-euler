(ns project-euler.core-test
  (:require [clojure.test :refer :all]
            [project-euler.core :refer :all]))

(deftest problem-1-test
  (testing "Find the sum of all the multiples of 3 or 5 below 1000."
    (is (= 233168 (problem-1 1000)))))
