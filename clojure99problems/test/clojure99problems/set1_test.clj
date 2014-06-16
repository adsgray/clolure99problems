(ns clojure99problems.set1-test
  (:require [clojure.test :refer :all]
            [clojure99problems.set1 :refer :all]))

(deftest p1-last-box
  (testing "p1 last-box"
    (is (= 4 (last-box '(1 2 3 4))))))

(deftest p2-last-but-one
         (testing "p2 last-but-one-box"
                  (is (= '(3 4) (last-but-one '(1 2 3 4))))))

(deftest p3-element-at
         (testing "p3 element-at kth element"
                  (is (= 4 (element-at '(1 2 3 4 5) 4)))
                  )
         )

(deftest p4-listsize
         (testing "p4 listsize"
                  ; multiple assertions in a single deftest
                  (is (= 0 (listsize '())))
                  (is (= 1 (listsize '(42))))
                  (is (= 5 (listsize '(1 2 3 4 5))))
                  )
         )

(deftest p5-revlist
         (testing "p5 revlist"
                  (is (= '() (revlist '())))
                  (is (= '(2 1) (revlist '(1 2))))
                  (is (= '(3 2 1) (revlist '(1 2 3))))

                  ; test the version that uses reduce as well:
                  (is (= '() (revlist-reduce '())))
                  (is (= '(2 1) (revlist-reduce '(1 2))))
                  (is (= '(3 2 1) (revlist-reduce '(1 2 3))))
                  ))
