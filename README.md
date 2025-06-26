EasyShop E-Commerce API

📋 Description of the Project

EasyShop is a Java-based Spring Boot REST API that serves as the backend for an online store.
The application allows users to browse and search for products, manage their shopping cart, and register/login to access features. 
Administrators have the ability to manage product and category data. 
The project focuses on API security, CRUD functionality, bug fixing, and designing extendable features for future development.

Intended Users:

Customers who want to browse, shop, and order products online

Admins who manage product listings and categories

Core Functionality:

User registration and login with role-based access

CRUD operations for products and categories (admin-only)

Product search by category, price range, and color

Shopping cart persistence by user

Checkout flow converting cart to order



🧑‍💻 User Stories

As a guest, I want to browse products so that I can see what's available in the store.

As a registered user, I want to log in and manage my shopping cart so that I can prepare for checkout.

As an admin, I want to add, update, or remove categories and products so that the product catalog stays up to date.

As a user, I want my cart to stay saved when I log out and come back later.

⚙️ Setup

Prerequisites

IntelliJ IDEA: Download IntelliJ


Java SDK: Java 17 (recommended)


MySQL: A running MySQL server with the EasyShop DB created via the provided script


Postman: For testing API endpoints


Running the Application in IntelliJ

Clone this repo into your machine.


Open IntelliJ IDEA.


Select "Open" and navigate to the project folder.


Set up the MySQL database by running create_database.sql from the database folder.


Add application.properties with your DB credentials and JWT secret.


Find the main class (e.g., EasyShopApplication.java) and run it.


Use Postman to test endpoints (localhost:8080/...).


💻 Technologies Used

Java 17


Spring Boot


Spring Security


JWT Authentication


MySQL


Maven


Postman


🎥 Demo ![image](https://github.com/user-attachments/assets/689b4933-3a44-42ae-a1b6-100652fc7070)
![image](https://github.com/user-attachments/assets/689b4933-3a44-42ae-a1b6-100652fc7070)





🌱 Future Work

Add a wishlist feature


Email confirmation after checkout


Product review system


Admin dashboard for low-stock alerts


Payment integration (Stripe or PayPal)


📚 Resources

Spring Boot Docs

workbooks

github.com/RayMaroun

google

AI

API project


👥 Team Members

Amena Nazari – Full-stack backend development, feature implementation, testing, and debugging

🙏 Thanks

Special thanks to Maroun Raymond for his continuous support, clear explanations, and guidance throughout this capstone project.


Thanks to classmates and the developer community for ideas and inspiration.


 
