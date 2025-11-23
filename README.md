# 📘 Spring REST Course API

This is a simple Spring Boot REST API project for managing course details.  
It demonstrates basic REST operations (GET and POST) using a layered architecture and an in-memory list (ArrayList).

---

## 🚀 Features
- Fetch all courses  
- Fetch a course by ID  
- Add a new course  
- Simple and clean Spring Boot architecture  
- No database required (uses temporary in-memory list)

---

## 📦 Project Structure
The project follows a standard Spring Boot layered architecture:


---

## 🔗 API Endpoints

### 🏠 Home  
`GET /home`  
Returns a welcome message.

### 📚 Get All Courses  
`GET /courses`  
Returns a list of all courses.

### 📘 Get Course By ID  
`GET /courses/{courseId}`  
Fetch a specific course using its ID.

### ➕ Add New Course  
`POST /courses`  
Add a new course by sending JSON in the request body:

**Sample JSON**
```json
{
  "id": 101,
  "title": "New Course",
  "description": "Sample Description"
}
