(defproject aot-bug "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  ;; this works :aot [aotbug.ns1 aotbug.ns2 aotbug.ns4 aotbug.ns3]
  ;; this throws:
  :aot [aotbug.ns3 aotbug.ns1 aotbug.ns2 aotbug.ns4]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha5"]])
