# Steps to connect to db with JDBC

1. Import the packages
2. Load(register) the driver
3. Create a connection
4. Create a query
5. Execute the query
6. Do something with the results
7. Close the connection

## Things to consider

- SQLite db does not need user and password, mysql (for example) does need them
- The driver can be installed manually or via maven. Go to maven and look for the driver, then paste the dependency in the pom.xml file
- In the case of SQLite, connection will always succeed, because if db does not exist it will be created