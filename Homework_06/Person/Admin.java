package Person;

public class Admin {
    // property :
    private String adminID;
    private String email;
    
    // method :
    public String getAdminID(){
        return adminID;
    }
    public void setAdminID(String id){
        this.adminID = id;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
