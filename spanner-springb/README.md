# spanner-springb
Create the Spanner Spring Boot app to deliver Spanner data as a service for the pose generator app.

#Create the supporting Spanner objects
Refer to the blog for steps: https://medium.com/google-cloud/spring-boot-a-persistent-orm-and-a-consistent-database-a38ec886f73c

#Build by running the below command from your Cloud Shell Terminal (if you are running it from Google Cloud Terminal)

./mvnw package

#Run in the Google Cloud Shell machine

./mvnw spring-boot:run

#Cloud Run Deploy

gcloud run deploy --source .

#Your service URL should be able to list the data created in Spanner
