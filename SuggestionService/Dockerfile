#  define base docker image
FROM openjdk:17
LABEL maintainer="Rohit"   
ADD target/SuggestionService-0.0.1-SNAPSHOT.jar suggestion-service.jar
ENTRYPOINT [ "java","-jar", "suggestion-service.jar" ]