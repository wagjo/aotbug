(ns aotbug.ns1)

(defprotocol P
  (p [this]))

(deftype T [x]
  P
  (p [this] x))

