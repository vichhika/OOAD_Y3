package Service;
import java.util.ArrayList;
import LibraryClass.Book;

public class Request {
    // property : 
    private String requestID;
    private ArrayList<Book> requestedBook;

    // method : 
    public void createNewRequest(){

    }

    public String getRequestID(){
        return this.requestID;
    }

    public void setRequestID(String id){
        this.requestID = id;
    }
    public ArrayList<Book> getRequestBook(){
    
    }

}
