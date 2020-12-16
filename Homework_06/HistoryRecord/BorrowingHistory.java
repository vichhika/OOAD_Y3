package HistoryRecord;

import java.util.ArrayList;
import LibraryClass.Book;
import Service.Request;

public class BorrowingHistory {
    // property :
    private String borrowedID;
    private String borrowedDate;
    private String dueDate;
    private ArrayList<Book> BorrowedBook;

    // method :
    public void borrowBooks(Request request){

    }
    public int getNumBooksBorrowed(){
        
    }
    public void returnBooks(String books){

    }
    public ArrayList<Book> viewBorrowingHistory(){

    }

    public String getBorrowerID(){
        return borrowedID;
    }
    public void setBorrowerID(String id){
        this.borrowedID = id;
    }

    public String getBorrowedDate(){
        return this.borrowedDate;
    }
    public void setBorrowedDate(String date){
        this.borrowedDate = date;
    }
    
    public String getDueDate(){
        return this.dueDate;
    }
    public void setDueDate(String date){
        this.dueDate = date;
    }
}
