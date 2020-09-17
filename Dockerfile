FROM maven as builder
WORKDIR /workdir
COPY . /workdir
RUN mvn install

FROM anapsix/alpine-java
ARG jarfile
ENV JAR_FILE=$jarfile
WORKDIR /workdir
COPY --from=builder /workdir/target/$jarfile /workdir
EXPOSE 8080
ENTRYPOINT java -jar $JAR_FILE
