# Filmorate

A service that works with films and user ratings, and returns the top most popular films recommended for viewing.

Implemented functions:
- Adding movie reviews.
- Adding users to each other's friends and
Like movies.
- Find movie feature.
- Functionality to find shared movies with other users.
Search for shared movies with other users.
- Functionality to find
Recommended movies.
- Event feed.


## Database diagram
![schema.png](schema.png)

## Technologies Used
- Spring Boot
- Spring Web MVC
- Maven
- SQL/H2 Database
- JUnit
- Git

## Deployment guide

### Requirements

- Java Development Kit (JDK) 11 or later
- PostgreSQL

### Building the Project

1. Clone the repository:

   `git clone https://github.com/living221/java-filmorate-group.git`

2. Build the project using Maven:

   `./mvnw clean install`
   
3. Run the application using the following command from CLI:

   `./mvnw spring-boot:run`
 
The application will run on port 8080. Access the public API at `http://localhost:8080`.
