(set-env! :dependencies   '[[org.clojure/clojure "RELEASE"]
                            [org.clojure/core.async "0.2.385"]
                            [mraa/mraa "1.0.0"]])

(task-options! repl {:port 48080})

