(ns clojure99problems.set1-test
  (:require [clojure.test :refer :all]
            [clojure99problems.set1 :refer :all]))

(deftest p1-last-box
  (testing "p1 last-box"
    (is (= 4 (last-box '(1 2 3 4))))))

(deftest p2-last-but-one
         (testing "p2 last-but-one-box"
                  (is (= '(3 4) (last-but-one '(1 2 3 4))))))
