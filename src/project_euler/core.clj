(ns project-euler.core)

(defn problem-1
  "If we list all the natural numbers below 10 that are multiples of 3 or 5, we
  get 3, 5, 6 and 9. The sum of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000."
  [x]
  (reduce + (filter
              (fn [n] (or (= 0 (mod n 3)) (= 0 (mod n 5))))
              (range x))))
