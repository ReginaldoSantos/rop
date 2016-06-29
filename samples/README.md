# Rop Samples

A small sample of ROP capabilities to support the implementations of command line apps like Git and Maven.


## Git Like Command Sample

Here goes a Git like command line implementation: "First command is main (level 1) and it allows one and only one sub command (level 2)"

For a fast glance:

```
$ mvn clean test -PsingleCmd 
```

It will execute the main class GitLikeMainCommand with parameter --help.


## Maven Like Command Sample

Here goes a Maven like command line implementation: "First command is main (level 1) and it allows multiple sub command(s) (level 2)"

For a fast glance:

```
$ mvn clean test -PmultiCmd 
```

It will execute the main class MavenLikeMainCommand with parameter --help.


## Just For The Sake Of Completeness

There is also a profile showing how to build a single JAR for distribution using GitLikeMainCommand.

```
$ mvn clean package
$ java -jar target\samples-0.0.1-SNAPSHOT-jar-with-dependencies.jar --help
```


