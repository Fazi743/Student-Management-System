# University Management System Database Project

## Overview
This repository contains a comprehensive database project for managing a university or educational institution. The database is designed to handle various aspects of university management, including student information, teacher details, course offerings, results, attendance, fees, and more.

## Database Structure
1. **Student Table:**
   - Stores information about students, including name, parent name, department, address, current semester, email, date of birth, gender, and phone number.
   - Includes stored procedures for insertion, deletion, and selection of student records.

2. **Teacher Table:**
   - Manages teacher details, including name, department, qualification, gender, phone number, email, date of joining, salary, and availability.

3. **Admin Table:**
   - Contains information about administrative staff, including name, position, and department.

4. **Offer Courses Table:**
   - Records information about courses, including code, title, credit hours, assigned teacher, course status, and administrator in charge.

5. **Registered Course Table:**
   - Links students to the courses they are registered for.

6. **Result Table:**
   - Stores information about student results, including the teacher, course, student, total marks, obtained marks, and GPA.

7. **Attendance Table:**
   - Tracks student attendance, including student ID, attendance percentage, and date.

8. **Fee Table:**
   - Manages student fees, tracking paid and remaining amounts.

9. **Student Login and Teacher Login Tables:**
   - Store login credentials for students and teachers/administrators.

## Stored Procedures and Triggers
- **Stored Procedures:** Includes procedures for inserting, selecting, and deleting student records, as well as procedures for course registration and result entry.
- **Triggers:** Implements triggers for handling cascading deletions and other functionalities.

## Views and Queries
- **Views:** Provides various views for administrators to access student, teacher, course, fee, and result information.
- **Queries:** Includes queries for statistical analysis, such as finding maximum, minimum, and average marks in results.

## Usage
To use this database project, follow these steps:
1. Execute the SQL script to create the database and tables.
2. Run the provided stored procedures and triggers as needed.
3. Use the views and queries to retrieve information about students, teachers, courses, results, and more.
