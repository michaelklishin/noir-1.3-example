(defproject webapp "0.1.0-SNAPSHOT"
  :min-lein-version "2.0.0"  
  :description "Just an example of a Noir project with a bunch of database clients, templating libraries and Leiningen plugins"
  :test-selectors {:default   (constantly true)
                   :focus       :focus
                   :all         (constantly true)}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 ;; See http://webnoir.com
                 [noir "1.3.0-beta7"]
                 ;; PostgreSQL, JDBC, Korma.
                 ;; See http://sqlkorma.com
                 [korma "0.3.0-beta9"]
                 [postgresql "9.1-901.jdbc4"]
                 ;; selector-based templates, see https://github.com/cgrand/enlive
                 [enlive "1.0.0"]
                 ;; moustache templates
                 [stencil "0.2.0"] ;; or [de.ubercode.clostache/clostache "1.3.0"]
                 ;; see http://clojuremongodb.info
                 [com.novemberain/monger "1.0.0-beta5"]
                 ;; see http://clojureriak.info
                 [com.novemberain/welle  "1.0.0"]]
  ;; commonly used plugins. Typically this would be in ~/.lein/profiles.clj.
  :profiles {:user {:plugins [[lein-swank    "1.4.3"]
                              [lein-difftest "1.3.8"]
                              [lein-pprint   "1.0.0"]
                              [lein-ring     "0.7.1"]]}}
  ;; Additional Maven repositories
  :repositories {"sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail :update :always}}
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}
  ;; where to find the -main function
  :main webapp.server)

