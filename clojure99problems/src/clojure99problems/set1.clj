(ns clojure99problems.set1)

;;; problems 1 to 28


(defn last-box
  "P01 Find the last box of a list"
  [list]
  (if (= 1 (count list))
    (first list)
    (last-box (rest list))
    )
  )
