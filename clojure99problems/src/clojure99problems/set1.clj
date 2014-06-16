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

(defn last-but-one
  "P02 Find the last but one box of a list."
  [list]
  (if (= 2 (count list))
    list
    (last-but-one (rest list))
    )
  )

(defn element-at
  "P03 Find the K'th element of a list."
  [list k]
  (if (= k 1)
    (first list)
    (element-at (rest list) (- k 1))
    )
  )

(defn listsize
  "P04 Find the number of elements of a list."
  [list]
  (if (empty? list)
    0
    (+ 1 (listsize (rest list)))
    )
  )

(defn revlist
  "P05 Reverse a list."
  [lst]
  (letfn [(revhelper [acc lst]
    (if (empty? lst)
      acc
      (revhelper (conj acc (first lst)) (rest lst))
      )
    )]
    (revhelper '() lst)
    )
  )

(defn revlist-reduce
  "P05 Reverse a list using reduce"
  [lst]
  (reduce (fn [acc item]
          (conj acc item)
          ) 
          '() lst)
  )

(defn palindrome?
  "P06 Find out whether a list is a palindrome."
  [lst]
  true
  )

