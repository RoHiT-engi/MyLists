#  define base docker image
FROM openjdk:17
LABEL maintainer="Rohit"   
ADD target/SuggestionService-0.0.1-SNAPSHOT.jar ListingService.jar
ENTRYPOINT [ "java","-jar", "ListingService.jar" ]