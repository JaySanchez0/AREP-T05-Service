FROM openjdk:8
WORKDIR /nodeapp
ENV PORT 6000
COPY . /nodeapp
CMD ["java","-cp","./target/classes:./target/dependency/*","com.nodeApp.App"]