University Event Management


*This project is a RESTful web service for managing events at a university. The project is built using Spring Boot and provides APIs for creating, updating, and deleting events and students.

#Models
The project contains two models - Student and Event.

#Student Model
*The Student model has the following attributes:
StudentId
First name
Last name
Age
Department

#Event Model
*The Event model has the following attributes:
EventId
EventName
LocationOfEvent
Date
StartTime
EndTime
Imageurl

#Repositories
*The project contains two repositories - StudentRepository and EventRepository. These repositories extend JpaRepository and provide basic CRUD operations for the corresponding models.

#Controllers
*The project contains two controllers - StudentController and EventController. These controllers are responsible for handling HTTP requests and providing the appropriate responses.

#StudentController
*The StudentController provides APIs for creating, updating, and deleting students. It also provides an API for retrieving all students and retrieving a student by id.

#EventController
*The EventController provides APIs for creating, updating, and deleting events. It also provides an API for retrieving all events for a given date.

#How to run the project
*Clone the project to your local machine
*Import the project into your preferred IDE
*Run the project as a Spring Boot application
*Use a REST client (such as Postman) to send HTTP requests to the APIs.

#Endpoints
The following endpoints are provided by the project:
#StudentController
POST /students - Add a student
PUT /students/{studentId} - Update a student's department
DELETE /students/{studentId} - Delete a student
GET /students - Get all students
GET /students/{studentId} - Get student by id
#EventController
POST /events - Add an event
PUT /events/{eventId} - Update an event
DELETE /events/{eventId} - Delete an event
GET /events/{date} - Get all events by date
