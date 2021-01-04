
public class View {

    public void DisplayHeaderTable(){
        System.out.println("ID\t| First Name\t\t| Last name\t\t| Date of Birth\t| Email    \t\t| Phone Number\t| Department\t");
    }
   
    public void DisplayStudent(Student student){
       System.out.format("%s\t| %s    \t\t| %s    \t\t| %s\t| %s  \t| %s\t| %s\t\n",student.getId(),student.getFirstName(),student.getLastName(),student.getDob(),student.getEmail(),student.getPhoneNumber(),student.getDepartment());
    }
}
