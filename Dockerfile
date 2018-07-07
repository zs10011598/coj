FROM library/java

WORKDIR /solutions

ADD . /solutions

RUN java -version