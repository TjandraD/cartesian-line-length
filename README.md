# Cartesian Line Length Calculator

## Problem Description
As a fan of geometry, I want to model a line based on points consisting of (x, y) coordinates using the cartesian system. So that I can calculate its length.

## Pre-Requisite to Run The Program
- Have an IDE for Java installed (e.g. Netbeans, Intellij, Eclipse)
- JDK 11.0 or higher installed ([see this link for installation](https://docs.oracle.com/en/java/javase/17/install/overview-jdk-installation.html))
- JUnit 5.0 or higher installed, for running the tests ([see this link for installation](https://junit.org/junit5/docs/current/user-guide/#overview-getting-started-junit-artifacts))

## How to Use This Package
```
Geometry geometry = new Geometry();

int [] firstPoint = {1, 2};
int [] secondPoint = {3, 4};

double lineLength = geometry.calculateDistance(firstPoint, secondPoint);
```

## How to Build The Program
- Open a terminal
- Change the working directory into the current project directory
- Execute `./gradlew build` in your terminal

## How to Run The Program
Can't, since this is a library only

## How to Run The Tests
- Open a terminal
- Change the working directory into the current project directory
- Execute `./gradlew test` in your terminal
