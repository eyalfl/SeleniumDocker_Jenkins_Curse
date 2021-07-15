FROM alpine
RUN apk add openjdk8
ENV PATH ${PATH}:/usr/lib/jvm/java-1.8-openjdk/bin
WORKDIR /usr/share/eyalfl
ADD com/test/Test.java com/test/
ENTRYPOINT javac com/test/Test.java && java com.test.Test $NUMBER