(ns clojure99problems.set1-test
  (:require [clojure.test :refer :all]
            [clojure99problems.set1 :refer :all]))

(deftest p1-last-box
  (testing "p1 last-box"
    (is (= 'abcdefg (last-box 'abcdefg)))))
