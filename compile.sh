#!/bin/sh

set -e

mkdir -p target/classes  target/test-classes

javac -d target/classes src/main/java/com/bodejidi/*.java
javac -d target/test-classes -classpath target/classes src/main/test/com/bodejidi/*.java
