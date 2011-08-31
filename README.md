# fiftyfive-web-archetype

## Features

This archetype generates a simple Java web project with these features:

* A nicely organized POM file the plays nice with maven 3.0
* Java 6 by default
* `mvn jetty:run` support
* Works on [Heroku](http://blog.heroku.com/archives/2011/08/25/java/) out of the box
* JUnit, Mockito, slf4j and log4j dependencies
* Basic log4j.properties
* A trivial servlet to get you started

## Quickstart

Try it out!

    mvn archetype:generate -U \
        -DarchetypeGroupId=com.55minutes \
        -DarchetypeArtifactId=fiftyfive-web-archetype \
        -DarchetypeRepository=http://opensource.55minutes.com/maven-snapshots \
        -DarchetypeVersion=1.0-SNAPSHOT

Change into the generated project directory, then run:

    mvn jetty:run

Your app will be running on http://localhost:8080/.

## Bonus: Deploy to Heroku!

These instructions assume you already have a [free Heroku account](http://www.heroku.com/) and have installed the `heroku` gem.

Within the generated project directory:

    git init
    git add .
    git commit -m init
    heroku create --stack cedar
    git push heroku master

View the deployed app in your browser:

    heroku open
