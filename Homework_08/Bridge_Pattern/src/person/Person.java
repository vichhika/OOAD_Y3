package person;

public abstract class Person {
    public String id;
    public String name;
    public String gender;
    public String phoneNo;
    public String email;

    public abstract void takeAction(String action);
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
}
