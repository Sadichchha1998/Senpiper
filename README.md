# Senpiper
# Liv2Train Training Center API

This project is a Spring Boot application that provides APIs to manage training centers.


## Overview
The **Liv2Train Training Center API** is a Spring Boot application designed to manage training centers. The API provides endpoints for creating and retrieving training centers along with their details such as location, capacity, and the courses they offer.

## API Endpoints

### 1. Create a Training Center
**Endpoint:** `/api/training-centers`  
**Method:** `POST`  
**Request Body:**

```json
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

```
****Response:**
**Status Code: 201 Created****
```json
{
  "id": 1,
  "centerName": "Masai Training Center",
  "address": {
    "city": "Pune",
    "state": "Maharashtra",
    "zipCode": "413302"
  },
  "capacity": 100,
  "courses": ["Java", "Spring Boot"]
}
```

## 2. Get All Training Centers
**Endpoint: /api/training-centers
Method: GET
Response:
Status Code: 200 OK**
```json
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
```
