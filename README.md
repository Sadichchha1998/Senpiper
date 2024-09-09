# Senpiper
# Liv2Train Training Center API

This project is a Spring Boot application that provides APIs to manage training centers.
1. Create a Training Center
URL: /api/training-centers

Method: POST

Request Body:
{
  "centerName": "Masai Training Center",
  "address": {
    "city": "Pune",
    "state": "Maharashtra",
    "zipCode": "413302"
  },
  "capacity": 100,
  "courses": ["Java", "Spring Boot"]
}

Response: 201 Created

{
"id":1,
  "centerName": "Masai Training Center",
  "address": {
    "city": "Pune",
    "state": "Maharashtra",
    "zipCode": "413302"
  },
  "capacity": 100,
  "courses": ["Java", "Spring Boot"]
}


2. Get All Training Centers
URL: /api/training-centers
Method: GET
Response: 200 OK


[
  {
    "id": 1,
    "centerName": "Masai Training Center",
    "address": {
      "city": "Pune ",
      "state": "Maharashtra",
      "zipCode": "413302"
    },
    "capacity": 100,
    "courses": ["Java", "Spring Boot"]
  },
  {
    "id": 2,
    "centerName": "School Training Center",
    "address": {
      "city": "Mumbai ",
      "state": "Maharashtra",
      "zipCode": "411211"
    },
    "capacity": 200,
    "courses": ["Python", "Data Science"]
  }
]
