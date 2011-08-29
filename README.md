This archetype generates a simple Java web project with these features:

* A nicely organized POM file supporting maven 3.0
* `mvn jetty:run` support
* JUnit, Mockito, slf4j and log4j dependencies
* Basic log4j.properties
* A trivial servlet

Try it out!

    mvn archetype:generate -U \
        -DarchetypeGroupId=com.55minutes \
        -DarchetypeArtifactId=fiftyfive-web-archetype \
        -DarchetypeRepository=http://opensource.55minutes.com/maven-snapshots \
        -DarchetypeVersion=1.0-SNAPSHOT

And then:

    mvn jetty:run

Your app will be running on http://localhost:8080/.
