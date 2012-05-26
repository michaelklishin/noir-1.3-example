(ns webapp.basic-test
  (:use clojure.test
        webapp.server
        noir.util.test))



(deftest test-ping
  (-> (send-request "/api/ping" {})
      (has-status 200)
      (has-content-type "application/json; charset=utf-8")))
