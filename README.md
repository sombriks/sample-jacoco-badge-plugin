# sample-jacoco-badge-plugin

![coverage](coverage.svg)

sampling jacoco badge plugin

## sampling

build with `mvn clean install`

## why old junit

because jacoco is buggy with junit5

## expectations

By the time of this sample creation, if you run `mvn clean install -DskipTests=true` will produce an error.

That should not happen so a pull request is being produced so that error don't happen anymore.
