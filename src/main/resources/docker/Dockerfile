FROM java:8

MAINTAINER mbasri<basrimohamed@live.fr>

#RUN apt-get update

ADD build/libs/synapsis-cv*.jar /app/synapsis-collaborator.jar
ADD src/main/resources/docker/run.sh /app/

RUN chmod +x /app/synapsis-collaborator.jar
RUN chmod +x /app/run.sh

EXPOSE 8080

ENTRYPOINT ["bash","run.sh"]

WORKDIR /app