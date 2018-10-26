(ns xxx-test.simple-namespace
  (:require [clojure.set :as cs]))

(def hello "message")

(def keyword-var :a-keyword )

(defn combine-sets [s1 s2]
  (cs/union s1 s2))