📓 Journal App (Spring Boot)

A RESTful backend application for managing personal journal entries. This project is built using Spring Boot, following a clean layered architecture with controllers, services, repositories, and entities.

🚀 Features
Create journal entries for a user
Fetch all journal entries of a user
Get a specific journal entry by ID
Update an existing journal entry
Delete a journal entry
Exception handling and proper HTTP responses
Clean and scalable architecture
🏗️ Project Structure
journalApp/
│
├── controller/
│   ├── JournalEntryController.java
│   ├── UserController.java
│   └── HealthCheck.java
│
├── entity/
│   ├── JournalEntry.java
│   └── User.java
│
├── repository/
│   ├── JournalEntryRepository.java
│   └── UserRepository.java
│
├── service/
│   ├── JournalEntryService.java
│   └── UserService.java
│
├── resources/
│   └── application.properties
│
└── JournalApplication.java
🧠 Tech Stack
Java
Spring Boot
Spring Web
Spring Data (MongoDB likely)
Maven
REST API
📌 API Endpoints
📝 Journal Entry APIs
1. Create Entry
POST /journal/{userName}

Request Body:

{
  "title": "My Day",
  "content": "Today was productive..."
}
2. Get All Entries of User
GET /journal/{userName}
3. Get Entry by ID
GET /journal/id/{myId}
4. Update Entry
PUT /journal/id/{userName}/{myId}
5. Delete Entry
DELETE /journal/id/{userName}/{myId}
⚙️ Setup Instructions
1. Clone the repository
git clone https://github.com/your-username/journal-app.git
cd journal-app
2. Open in IDE
Recommended: IntelliJ IDEA
3. Configure Database

Update application.properties:

spring.data.mongodb.uri=mongodb://localhost:27017/journaldb
4. Run the application
mvn spring-boot:run
🧪 Testing APIs

Use tools like:

Postman
Thunder Client
cURL
📦 Response Handling
200 OK → Success
201 CREATED → Entry created
204 NO CONTENT → Deleted successfully
400 BAD REQUEST → Invalid input
404 NOT FOUND → Resource not found
🔒 Future Improvements
Add Spring Security (JWT Authentication)
Input validation using @Valid
Global exception handling
Pagination & sorting
Swagger API documentation
Dockerization
👨‍💻 Author

Aman Verma
Engineering Student | Backend Developer

⭐ Contribution

Feel free to fork the project and improve it. Contributions are welcome!
