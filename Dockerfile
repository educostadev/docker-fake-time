FROM adoptopenjdk/openjdk11
COPY  . /home/app/

WORKDIR /home/app

ENV LD_PRELOAD=/home/app/libfaketime.so.1

# See https://github.com/wolfcw/libfaketime
ENV FAKETIME="@2022-01-01 00:00:00"
ENV FAKETIME_DONT_RESET=1

EXPOSE 5454

ENTRYPOINT ["java","-jar", "-Xmx15m", "./target/demo-0.0.1-SNAPSHOT.jar"]