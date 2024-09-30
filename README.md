# Bookstore-App-Java-PostgreSQL-React-with-Redux-Toolkit - Backend

This is a book sales application where books are listed, and users can add or remove any books they want from their cart. With the Redux Toolkit, the cart can be viewed simultaneously on the entire page, and changes can be tracked.

## Features

- **Home Page:** Users can view pictures, titles, and prices of books. If they wish, they can go to the book detail page or add the book to their cart.
- **Book Detail Page:** Photos, titles, descriptions, release years, and prices of the books are listed. Users can add the book to the cart or return to the home page.
- **Cart Page:** The books in the cart are displayed. The quantity can be increased or decreased, or the book can be completely removed from the cart.
- **Cart Icon in Header:** Thanks to the cart icon in the header, users can view the current status of their carts on every page, remove items, and navigate to the cart detail page.

## Requirements

- **Java:** 17 or later
- **Maven:** Installed
- **PostgreSQL:** Database management system

## Installation Instructions
To run this project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/ipekgungor/Bookstore-App-Java-PostgreSQL-React-with-Redux-Toolkit---Backend.git
   cd Bookstore-App-Java-PostgreSQL-React-with-Redux-Toolkit---Backend
   ```

2. Set up your PostgreSQL database:
   
   ```bash
   CREATE DATABASE book_store
   
   CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    price NUMERIC(10, 2) NOT NULL,
    description TEXT,
    release_year INTEGER,
    image_url VARCHAR(255)
   );
   ```
3. Add data

  ```bash
  INSERT INTO books (id, title, author, price, description, release_year, image_url) VALUES
  (1, 'The DNA Field and the Law of Resonance', 'Matt Haig', 14.99, 'Retired math teacher Grace Winters inherits a dilapidated house in Ibiza from a long-lost friend, prompting her to confront her past and uncover hidden secrets. This journey reveals the transformative power of hope and new beginnings.', 2024, 
  'https://m.media-amazon.com/images/I/71Bk-3JutTL._AC_UF1000,1000_QL80_.jpg'),
  (2, 'Blindness', 'Jose Saramago', 12.50, 'Blindness, a powerful work by the masterful author, depicts society''s descent into brutality and highlights a woman''s solitary efforts in solidarity and resistance as humanity''s last hope.', 1995, 'https://m.media-amazon.com/images/I/71FeYR+eOVL._AC_UF1000,1000_QL80_.jpg'),
  (3, '1984', 'George Orwell', 18.00, 'A dystopian novel about a totalitarian regime.', 1949, 'https://thewonk.in/wp-content/uploads/2024/02/ninteen-eighty-four-book-review.jpg'),
  (4, 'The Midnight Library', 'Matt Haig', 10.99, 'In a library on her last day, Nora discovers the opportunity to explore alternate lives and confront her regrets, ultimately questioning how to choose the best way to live among infinite possibilities.', 2020, 'https://m.media- 
  amazon.com/images/I/71FsIkGF3pL._AC_UF350,350_QL50_.jpg'),
  (5, 'A Kissing Hand for Chester Raccoon', 'Audrey Penn', 9.75, 'Little Racoon fears going to school, but Mother Racoon comforts him with a family secret called "The Kiss in Your Palm." Since 1993, this classic has helped millions of children cope with separation.', 2011, 'https://m.media- 
  amazon.com/images/I/71u32vBkGDL._AC_UF1000,1000_QL80_.jpg'),
  (6, 'War and Peace', 'Leo Tolstoy', 20.99, 'A historical novel that intertwines the lives of characters during the Napoleonic wars.', 1869, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAekuv2Owst1b9Tbe_XsJNfjPwPF_GiXhhFw&s');
  ```
4. Manage permissions
  ALTER TABLE books OWNER TO book_user;
  GRANT ALL PRIVILEGES ON TABLE books TO book_user;
  GRANT ALL ON SCHEMA public TO book_user;

6. Run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
4. Once the application is running, navigate to http://localhost:8080 to use the app.

## Contact
- **Developer:** İpek Güngör
- **Email:** ipekgungor2001@gmail.com
- **GitHub Profile:** ipekgungor

## Notes
- **Be careful about the java and eclipse versions.** My Eclipse version: 2024-06 (4.32.0) / My Java version: java 22.0.2
- **I solved the CORS problem using ngrok. You can find the configuration in the axiosConfig.js file. Ngrok allows you to create an account and start using it by entering the command "ngrok http 8080".** 
