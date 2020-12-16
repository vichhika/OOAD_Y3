package LibraryClass;

public class Book {
    // property 
    private String id;
    private String title;
    private String authorName;
    private String availabilityStatus;

    // method :
    public void searchBookID(){

    }
    public void searchBookByTitle(String title){

    }
    public void searchBookByAuthorName(String author){
        
    }

    public void insertBooks(){

    }
    public void removeBooks(){

    }

    public void getBookAvailability(){

    }
    public void setBookAvailability(){

    }

    public String getID(){
        return this.id;
    }
    public void setID(String id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthorName(){
        return this.authorName;
    }
    public void setAuthorName(String name){
        this.authorName = name;
    }
}
