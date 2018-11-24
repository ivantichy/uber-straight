# Uber Straight Solution Demo

## Build
cd uber-straight
mvn clean install

## Run
cd uber-straight
mvn -f graphql-prototype/ clean jetty:run 

## Test url
http://localhost:8080/?query=%7B%0A%20%20allParents%20%7B%0A%20%20%20%20parentId%0A%20%20%20%20structureId%0A%20%20%20%20additionalData%20%7B%0A%20%20%20%20%20%20adDictionaryUrl%0A%20%20%20%20%20%20adDictionaryValues%0A%20%20%20%20%20%20adInputType%0A%20%20%20%20%20%20adName%0A%20%20%20%20%20%20adValidators%0A%20%20%20%20%20%20adValue%0A%20%20%20%20%20%20isDeleted%0A%20%20%20%20%20%20preparationId%0A%20%20%20%20%20%20versionId%0A%20%20%20%20%7D%0A%20%20%20%20structures%20%7B%0A%20%20%20%20%20%20cdSmiles%0A%20%20%20%20%7D%0A%20%20%20%20parentIupacNames%20%7B%0A%20%20%20%20%20%20adValue%0A%20%20%20%20%7D%0A%20%20%7D%0A%7D%0A
