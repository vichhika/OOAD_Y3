/**
 * Student
 */
public class Student {

    private String id,
                lastName,
                firstName,
                dob,
                email,
                phoneNumber,
                department;

    public Student(){};
    public Student(String Id,String LastName,String FirstName,String Dob,String email,String phoneNumber,String department){
        setId(Id);setLastName(LastName);setFirstName(FirstName);setDob(Dob);setEmail(email);setPhoneNumber(phoneNumber);setDepartment(department);
    }

    public void setId(String Id){
        this.id = Id;
    }
    public void setLastName(String LastName){
        this.lastName = LastName;
    }
    public void setFirstName(String FirstName){
        this.firstName = FirstName;
    }
    public void setDob(String Dob){
        this.dob = Dob;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    public String getId(){
        return this.id;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getDob(){
        return this.dob;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getDepartment(){
        return this.department;
    }
}