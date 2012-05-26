# Example Noir 1.3 web app

This is an example Noir 1.3 project with a bunch of common dependencies (database clients, templating libraries) added. 


## Usage

With [Leiningen 2]()

``` bash
lein2 test
```

It will download all dependencies to the local Maven repository and run a single test there is. To run the app,

``` bash
lein2 run
```

and visit [http://localhost:8080](http://localhost:8080) in the browser to see HTML responses. For a sample JSON API response,
run

``` bash
curl -H "Accept: application/json" http://localhost:8080/api/ping
```


## License

Copyright (C) 2012 Michael S. Klishin

Distributed under the Eclipse Public License, the same as Clojure.

