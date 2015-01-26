(ns aotbug.ns4
  (require [aotbug.ns1]
           [aotbug.ns2 :refer [foo]]))

(println (foo (aotbug.ns1.T. :foo)))

(def x (foo (aotbug.ns1.T. :foo)))


