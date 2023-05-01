# GUIProjectLibrary
## Project explanation: 

The Library Management System is designed to manage the operations of a library, with two types of users: managers and librarians. Users can add new books to the library database, including details such as title, author, and other relevant information. They can also remove books from the database.

Librarians can insert members to rent books from the library. To become a member, relevant information such as name, phone number, and email is required. Members can rent any available book from the library, and the system automatically assigns a return date 2 weeks from the rental date. If a book is not returned, it will not be available for renting until it is returned.

Staff, who are logged in to the application, are able to view a list of rented books, including the member's name and the return date of each book. The system also includes a search feature for books and members.

The library contains a notification feature, which allows managers to send notifications to staff. Managers can also add or remove staff members, as well as promote staff members to managers or demote a manager to a regular librarian.


## Design Patterns and implementation:  

The project was designed to incorporate three distinct design patterns.

Firstly, I utilized the Model-View-Controller (MVC) design pattern to organize the architecture of the entire system. This pattern allowed for the seamless integration of the front-end FXML views and the back-end Model that contains the library's database instances, through the Model classes.

Secondly, I implemented the Composite design pattern to illustrate the hierarchy between the managers and librarians. The manager class holds an array list of librarians that they can add to or remove from, creating a structured relationship between the two classes.

Finally, I implemented the Observer design pattern to enable the notification functionality. The Manager is the observable object that sends the notifications, while the Staff members are the observers that receive the notifications. This allowed for the efficient dissemination of important information throughout the system.
The following diagramm is a siplification of the last 2 designe patterns 

<img src="https://github.com/fatimaKaraki/GUIProjectLibrary/blob/master/UML%20class%20(1).jpeg">

## Data Base 
The database for this project was implemented using PHPMyAdmin and consists of 5 tables: Books, Members, Rented Books, Staff, and Notifications.

To handle database operations, DAO (Data Access Object) classes were created for each model. These DAO classes implement all necessary queries for data manipulation, from insertion to deletion and updates. You can find these DAO classes in the DAO package of the project.

## Some Snippets and Explanation 
login page 
<img src="">

Home Page 
<img src=""> 

Members 
<img src=""> 

Books 
<img src=""> 

EditBooks 
<img src=""> 

Library 
for Staff 
<img src=""> 
for Manager
<img src=""> 

Rent a Book Page 
<img src=""> 





## Contributions
the following project wa designed and implemented by: 

Fatima Karaki (103717) 

Fadel Bayloun (96879)

Issa Sabeh (100529) 

Hussien Maatouk (107147)

## Contact Information 
For any questions please contact one of the following: 

fatima karaki karakifatima29@gmail.com 

Issa Sabeh Issasab2204@gmail.com 

Fadel Bayloon Fadel.bayloun12@gmail.com

Hussien Maatouk Hmaatouk1998@gmail.com 



