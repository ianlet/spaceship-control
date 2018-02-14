FROM gradle:jdk8

USER gradle
WORKDIR /home/gradle

RUN ["gradle", "build"]

CMD ["gradle", "accept", "--refresh-dependencies"]
