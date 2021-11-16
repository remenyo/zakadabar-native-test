FROM openjdk:8-jdk-alpine
COPY local local
RUN apk update && apk add -y mc
ENTRYPOINT ["java","-jar","/local/szamologep/lib/szamologep-@version@-all.jar", "--settings", "/local/szamologep/etc/stack.server-docker.yaml"]
LABEL version="@version@"