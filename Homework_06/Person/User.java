package Person;

public class User {
    // property :
    protected String id;
    private String name;
    private String address;
    private String email;
    private String type;

    // method :
    public void removeUser(){

    }

    public void setID(String id){
        this.id = id;
    }
    public String getID(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    
}
