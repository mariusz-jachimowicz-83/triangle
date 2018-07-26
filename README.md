# Triangle
Takes lengths of the triangle's three sides as input, and return whether the triangle is equilateral, isosceles or scalene.

## Requirements to run

* Install Java 8

## Requirement to generate jar file

* Install Leiningen

## Run results

```bash
java -jar target/triangle.jar -a 1.0 -b 1.0 -c 1.0
Triangle type is :equilateral

java -jar target/triangle.jar -a 1.0 -b 1.0 -c 2
Triangle type is :isosceles

java -jar target/triangle.jar -a 1.0 -b 2 -c 3
Triangle type is :scalene
```

## Display help

```bash
java -jar target/triangle.jar -h

# result
Run me as 
java -jar triangle.jar 
with parameters:
  -a, --a LENGTH  Triangle a side length
  -b, --b LENGTH  Triangle b side length
  -c, --c LENGTH  Triangle c side length
  -h, --help

```

## Generate jar file

```bash
lein uberjar
```

## Run tests

```bash
lein test
```

## About author

My name is Mariusz Jachimowicz
I am developer with 10 years of experience as an fullstack developer. I worked for instance on:
- auction and procurement systems using Java
- SaaS web application that simplifies material sourcing for the architecture & construction industry using Ruby,Angular and CoffeeScript
- backend servers and prototypes using Node.js, Express.js
- digital signature component for bids in auctions using Java and https://www.bouncycastle.org
- marking image with positional tags using Ruby, Angular and D3.js
For 2 years (1 year commercially in Flexiana) I have been using Clojure/ClojureScript as an best technology nowadays
Why Clojure?
In Clojure I don't need to write so much code as it is in other languages. Code is much more compact, expressive and it has very good performance
characteristic.
I am mentioned as an contributor of Onyx (http://www.onyxplatform.org https://github.com/onyx-platform/onyx). 
It's distributed computation framework for cloud, written in Clojure. I made couple things there:
- https://github.com/onyx-platform/onyx-dashboard/pull/63
- https://github.com/onyx-platform/onyx-dashboard/pull/75
- https://github.com/onyx-platform/onyx-dashboard/pull/74
- https://github.com/onyx-platform/onyx-dashboard/pull/67
- https://github.com/onyx-platform/onyx-dashboard/pull/62
- https://github.com/onyx-platform/onyx/pull/630
- https://github.com/onyx-platform/onyx-visualization/pull/8
Some proposals only:
- https://github.com/onyx-platform/onyx-dashboard/pull/79
- https://github.com/onyx-platform/onyx/pull/680

Recently, I have started doing research and working on some components that allow to easy build applications starting from simple MVP app up to microservices based apps.
- https://github.com/mariusz-jachimowicz-83/duct-microservices
- https://github.com/mariusz-jachimowicz-83/duct-datastore
- https://github.com/mariusz-jachimowicz-83/duct-migrations-auto-cfg
- https://github.com/mariusz-jachimowicz-83/duct-env-dbs
- https://github.com/mariusz-jachimowicz-83/duct-simple-mailer
- https://github.com/duct-framework/migrator.ragtime/pull/5
- https://github.com/mariusz-jachimowicz-83/ragtime-clj
My personal blog engine prototype:
- https://github.com/mariusz-jachimowicz-83/blog

I have been working full remotely for a couple of years. I live in Poland.  
My LinkedIn profile: https://www.linkedin.com/in/mariusz-jachimowicz-71862142  
Twitter profile: https://twitter.com/resto_cichy  
Github profile https://github.com/mariusz-jachimowicz-83  
