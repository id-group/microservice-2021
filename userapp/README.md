docker build --build-arg JAR_FILE=target/userapp-1.0.0.jar . -t otus:userapp-0.0.1  

docker tag otus:userapp-0.0.1 idgroup/otus:userapp-0.0.1  
docker push idgroup/otus:userapp-0.0.1    

docker run --name userapp -d -p 8183:8080 -e DATASOURCE_URL=jdbc:postgresql://postgres/myapp -e DATASOURCE_USERNAME=myuser --name userapp idgroup/otus:userapp-0.0.1
