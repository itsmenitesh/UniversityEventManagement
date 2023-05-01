# UniversityEventManagement

this Api work is to take input of Job vlaues like  and with it it will make a Job  data.

## Frameworks and Language Used

The following frameworks and languages were used in the development of this project:

- Java
- Spring Boot
- H2 database

## Data Flow

The following functions were used in this project:

1. Controller - This component is responsible for handling the incoming requests and processing them.
2. Services - This component provides business logic to the application.
3. Repository - This component interacts with the database.
4. Module - This component is responsible for the design of the schema.

## Data Structure

The following data structures were used in this project:

- ArrayList

## brief description of each of the components in the context of the code:

### Controller
The controller is responsible for handling incoming requests and returning appropriate responses. These methods use the UserService to perform CRUD (create, read, update, delete) operations on the Student and Event data.

### Service
The service layer contains the business logic of the project. It acts as an intermediary between the controller and the repository. In the code, it have a StudentService and EventService which contains methods. These methods perform validation on the input data and delegate database operations to the StudentRepository and EventRepository.

### Repository
In the code, it have a IStudentRepository and IEventRepository.

### Module
In the code, i have created a module named Student,Event and one enum class of DepartmentType. This class represents the data model of the Student and Event.

Overall, these components work together to create a layered architecture for your project, which separates concerns and promotes modularity and maintainability.

## Project Summary

The aim of this project is to create a system that can take input data and use it to create a project. The system is built using Java and Spring Boot H2-database.The data flow is handled by the Controller, Services, and Repository components, with the Database Design being responsible for the schema. The project also makes use of arrayslists to store and manipulate data.
