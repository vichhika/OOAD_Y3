package LibraryClass;

import java.util.ArrayList;

import Person.User;
import Service.Email;

/**
 * Authors: Group 1
 * Note 
 *      All the variable start with the lowercase
 *      All object or class start with uppercase
 */
public class Library {
    ArrayList<Book> Books = new ArrayList<>();
    User user = new User();
    Email email = new Email();
    public static void main(String[] args) {
        // ArrayList<Book> Books = new ArrayList<>();

        // User user1 = new User();

        // Book b1 = new Book();
        // b1.setID("0");
        // b1.setAuthorName("Mr.A");
        // b1.setTitle("Harry Potter");
        // Books.add(b1);

        // System.out.println(b1.getTitle());

    }
}
