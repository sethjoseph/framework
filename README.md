framework
=========

Unified platform API framework


Overview
========
This is a unified platform API framework to be used to access all backend services. This API is built from scratch modeled after Capital One's eAPI framework. The goal is to design and develop one piece at a time in small, manageable chucnks. Continue adding to the framework until all the pieces are put in place and any UI or consumer of the API can be built on top using the services contained herein.


Phase I
=======
1. Create a Hello World webapp that can be run on tomcat
2. Create an embedded data source that can be injected into a test environment
3. Create and run unit tests using the injected data source


TODO
====
1. Get local instance of nexus repository manager running.
2. Create a maven archetype to set up the project modeled after Capital One's eAPI framework.
3. Create a maven snapshot project with a BOM, parent pom, unit tests and integration tests.


TODO Environment/Configuration
==============================
1. Get eclipse to access nexus repos and central repository


Technologies
============
1. Git
2. Nexus
3. Maven (archetypes, plugins, profiles)
4. REST JAXRS (jersey, spring)
5. Tomcat, Jetty
6. HQL, JDBC
7. ActiveMQ
8. Swagger 
9. JUnit, Integration Tests
10. Coherence
11. Jenkins


Additional Resources
====================

I. Technologies
----------------
1. Nexus: http://books.sonatype.com/nexus-book/reference
