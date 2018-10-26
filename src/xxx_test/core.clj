(ns xxx-test.core
  (:require [xxx-test.simple-namespace :as simple-namespace]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!" simple-namespace/hello))
