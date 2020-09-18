FROM maven as builder
WORKDIR /workdir
COPY . /workdir
RUN mvn install

FROM openjdk:14-alpine
WORKDIR /workdir
COPY --from=builder /workdir/target/hexcolor-generator-build.jar /workdir
EXPOSE 8080
ENTRYPOINT java -jar hexcolor-generator-build.jar
