# Uber Straight Solution Demo

## Build
`cd uber-straight`

`mvn clean install`

## Run
`cd uber-straight`

`mvn -f graphql-prototype/ clean jetty:run` 

## Test url
http://localhost:8080/?query=%7B%0A%20%20allParents%20%7B%0A%20%20%20%20parentId%0A%20%20%20%20additionalData%20%7B%0A%20%20%20%20%20%20adDictionaryUrl%0A%20%20%20%20%20%20adDictionaryValues%0A%20%20%20%20%20%20adInputType%0A%20%20%20%20%20%20adName%0A%20%20%20%20%20%20adValidators%0A%20%20%20%20%20%20adValue%0A%20%20%20%20%20%20isDeleted%0A%20%20%20%20%20%20preparationId%0A%20%20%20%20%20%20versionId%0A%20%20%20%20%20%20parent%20%7B%0A%20%20%20%20%20%20%20%20parentId%0A%20%20%20%20%20%20%20%20biological%0A%20%20%20%20%20%20%20%20createdBy%0A%20%20%20%20%20%20%20%20cstOriginal%0A%20%20%20%20%20%20%20%20dirtyStatus%0A%20%20%20%20%20%20%20%20geometricIsomerism%0A%20%20%20%20%20%20%20%20chemistId%0A%20%20%20%20%20%20%20%20initDate%0A%20%20%20%20%20%20%20%20isDeleted%0A%20%20%20%20%20%20%20%20modDate%0A%20%20%20%20%20%20%20%20modifiedBy%0A%20%20%20%20%20%20%20%20mwt%0A%20%20%20%20%20%20%20%20pcn%0A%20%20%20%20%20%20%20%20restricted%0A%20%20%20%20%20%20%20%20stereochemistry%0A%20%20%20%20%20%20%20%20structureType%0A%20%20%20%20%20%20%20%20unknownId%0A%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%20%20%20%20structure%20%7B%0A%20%20%20%20cdSmiles%0A%20%20%20%20%20%20parent%20%7B%0A%20%20%20%20%20%20%20%20parentId%0A%20%20%20%20%20%20%20%20biological%0A%20%20%20%20%20%20%20%20createdBy%0A%20%20%20%20%20%20%20%20cstOriginal%0A%20%20%20%20%20%20%20%20dirtyStatus%0A%20%20%20%20%20%20%20%20geometricIsomerism%0A%20%20%20%20%20%20%20%20chemistId%0A%20%20%20%20%20%20%20%20initDate%0A%20%20%20%20%20%20%20%20isDeleted%0A%20%20%20%20%20%20%20%20modDate%0A%20%20%20%20%20%20%20%20modifiedBy%0A%20%20%20%20%20%20%20%20mwt%0A%20%20%20%20%20%20%20%20pcn%0A%20%20%20%20%20%20%20%20restricted%0A%20%20%20%20%20%20%20%20stereochemistry%0A%20%20%20%20%20%20%20%20structureType%0A%20%20%20%20%20%20%20%20unknownId%0A%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%20%20%20%20parentIupacName%20%7B%0A%20%20%20%20%20%20adValue%0A%20%20%20%20%7D%0A%20%20%7D%0A%7D%0A