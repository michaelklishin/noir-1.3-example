(ns webapp.views.ping
  (:require [noir.response :as r])
  (:use noir.core))


(defpage "/api/ping"
  []
  (r/json {:pong true}))
