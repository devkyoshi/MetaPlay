## Pre-requisites

1. Install Java 21 in your system
   https://www.oracle.com/java/technologies/downloads/#java21 
2. Install MySQL in your system/ Use MySQL Workbench for database
https://dev.mysql.com/downloads/workbench/
3. Install git GUI, git bash in your system 
https://git-scm.com/downloads

## Project setup

1. **Clone the repository using SSH**

    ```bash
    git clone git@github.com:DevAshiZ/MetaPlay.git
    ```
2. **Go to the project directory**

    ```bash
    cd MetaPlay
    ```

3. **Go to the backend directory**

    ```bash
    cd backend
    ```

4. **Create a database in MySQL**

- Use MySQL Workbench to create a database

5. Update the properties file

- (Update the application.properties file with your database credentials located in src/main/resources folder)

```properties
spring.application.name=backend

# Database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/<<your_database_name>>
spring.datasource.username=<<your_username usually default is 'root'>>
spring.datasource.password=<<your_password>>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate configuration
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

```

6. Install dependencies

- (if using inteliJ IDEA, it will automatically install the dependencies. Click maven install in the popup)

