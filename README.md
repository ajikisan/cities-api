Desafio: Construir uma API REST de consulta de cidades do Brasil do zero até a produção.

Bootcamp Digital Innovation One: Automação de testes NTT DATA Quality Assurance Beginner #3

Realizado o desenvolvimento uma interface de programação de aplicações para transferência representacional de estado em serviço web.

Deste modo foi utilizado método HTTP GET http://localhost:8080/cities para exibição da consulta de cidades do Brasil com dados comparativos de geolocalização.

Referência:
https://web.digitalinnovation.one/lab/construindo-uma-api-rest-de-consulta-de-cidades-do-brasil-do-zero-ate-producao/learning/9e5267ad-45fe-4557-a620-6e9aa93b9e63
Instrutor: André Luis Gomes

Tópicos:
Git   
Github
Spring Initializr
Linguagem de Programação: Java
IDE - IntelliJ Community - Gradle
Container PaaS: Docker
Terminal Ubuntu - Linux - SGBD PostgreSQL
ajikisan@LAPTOP-6BPS8238:~/sql-paises-estados-cidades/PostgreSQL$ ll
total 768
drwxr-xr-x 2 ajikisan ajikisan   4096 Oct 31 12:52 ./
drwxr-xr-x 7 ajikisan ajikisan   4096 Oct 31 12:52 ../
-rw-r--r-- 1 ajikisan ajikisan 754012 Oct 31 12:52 cidade.sql
-rw-r--r-- 1 ajikisan ajikisan   1743 Oct 31 12:52 estado.sql
-rw-r--r-- 1 ajikisan ajikisan  13592 Oct 31 12:52 pais.sql

API Postman
http://localhost:8080/cities
http://localhost:8080/distances/by-points?from=4929&to=5254
http://localhost:8080/distances/by-cube?from=2455&to=1243
http://localhost:8080/distances/by-cube?from=1567&to=3246&unit=MILES
http://localhost:8080/distances/by-points?from=2467&to=2369&unit=MILES
http://localhost:8080/countries/countries?page=0&size=10&sort=name, asc
http://localhost:8080/states



API Cloud Heroku

https://glacial-anchorage-23325.herokuapp.com/cities
https://glacial-anchorage-23325.herokuapp.com/countries/countries?page=0&size=10&sort=name, asc
https://glacial-anchorage-23325.herokuapp.com/countries/countries?page=0&size=40&sort=id, asc
https://glacial-anchorage-23325.herokuapp.com/countries
https://glacial-anchorage-23325.herokuapp.com/states
https://glacial-anchorage-23325.herokuapp.com/distances/by-points?from=4929&to=5254
https://glacial-anchorage-23325.herokuapp.com/distances/by-points?from=21359&to=4759
https://glacial-anchorage-23325.herokuapp.com/distances/by-cube?from=3265&to=1452
https://glacial-anchorage-23325.herokuapp.com/distances/by-cube?from=1567&to=3246&unit=MILES
https://glacial-anchorage-23325.herokuapp.com/distances/by-cube?from=2567&to=2926&unit=KILOMETERS
https://glacial-anchorage-23325.herokuapp.com/distances/by-cube?from=2237&to=4236&unit=METERS