# GUIProjectLibrary
## Project explanation: 

The Library Management System is designed to manage the operations of a library, with two types of users: managers and librarians. Users can add new books to the library database, including details such as title, author, and other relevant information. They can also remove books from the database.

Librarians can insert members to rent books from the library. To become a member, relevant information such as name, phone number, and email is required. Members can rent any available book from the library, and the system automatically assigns a return date 2 weeks from the rental date. If a book is not returned, it will not be available for renting until it is returned.

Staff, who are logged in to the application, are able to view a list of rented books, including the member's name and the return date of each book. The system also includes a search feature for books and members.

The library contains a notification feature, which allows managers to send notifications to staff. Managers can also add or remove staff members, as well as promote staff members to managers or demote a manager to a regular librarian.


## Designe Patterns and implementation:  

The project was designed to incorporate three distinct design patterns.

Firstly, I utilized the Model-View-Controller (MVC) design pattern to organize the architecture of the entire system. This pattern allowed for the seamless integration of the front-end FXML views and the back-end Model that contains the library's database instances, through the Model classes.

Secondly, I implemented the Composite design pattern to illustrate the hierarchy between the managers and librarians. The manager class holds an array list of librarians that they can add to or remove from, creating a structured relationship between the two classes.

Finally, I implemented the Observer design pattern to enable the notification functionality. The Manager is the observable object that sends the notifications, while the Staff members are the observers that receive the notifications. This allowed for the efficient dissemination of important information throughout the system.



