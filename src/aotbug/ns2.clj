(ns aotbug.ns2
  (require [aotbug.ns1]))

(defn foo [^aotbug.ns1.P t]
  (.p t))
