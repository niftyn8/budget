(defproject budget "0.0.1"
  :description "Simple budget tracking for myself"
  :url "http://github.com/niftyn8/budget"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]
                 [ring-server "0.3.1"]
                 [cheshire "5.3.1"]
                 [hiccup-bootstrap-3 "0.2.0-SNAPSHOT"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler budget.handler/app
         :init budget.handler/init
         :destroy budget.handler/destroy}
  :aot :all
  :profiles
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.2.1"]]}})
