# marvelCharactersAPI-master
API de consulta da API Marvel

marvelCharacters API utiliza the Marvel Comics API to:

Serve an endpoint that returns all the Marvel character ids only, in a JSON array of numbers.
Accessed via "/characters"
Serve an endpoint that contains the real-time character information from the Marvel API /v1/public/characters/{characterId} with flexibility to translate the description to a desired language via query parameter.
Accessed via "/character/{characterID}?languageCode={languageID}"
Included character information: id, name, description, thumbnail
Default languageCode if not provided is English
The API includes Swagger specification that can be viewed with Swagger UI or imported to Postman

DEPLOY INSTRUCTIONS

Directions compiling and running this project from project root:

Install and configure Java and Maven if not already present on system
Java: https://www.oracle.com/technetwork/java/javase/downloads/index.html
Maven: https://maven.apache.org/install.html
Command: mvn package
All required dependencies are managed by Maven
Command: java -jar target/marvel-1.0.jar
Navigate to http://localhost:8080/
Utilize and enjoy the supported endpoints for Marvel characters API!
Third party API

Jyandex - translation API
Swagger - visualisation API
