(defn local-repo-path []
  (get (System/getenv) "M2_REPO" (str (get (System/getenv) "HOME") "/.m2/repository")))

(defproject clojureapp "0.1.0-SNAPSHOT"
    :plugins [[lein-ring "0.7.5"]]
    :dependencies [[org.clojure/clojure "1.6.0"]
                   [http-kit "2.1.18"]]
    :local-repo ~(local-repo-path)
    :main webapp)
