import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Feature {
   private Scanner input = new Scanner(System.in);
   private Map<String,Student> students = new HashMap<>();
   private Student student = new Student();
   private View view = new View();
   private int autoID = 0;

   public void addStudent(){
      System.out.println("-----Add information of Student-----");
      student.setId(""+autoID);
      System.out.print("First Name :");
      student.setFirstName(input.nextLine());
      System.out.print("Last Name :");
      student.setLastName(input.nextLine());
      System.out.print("Date of Birth : ");
      student.setDob(input.nextLine());
      System.out.print("Email : ");
      student.setEmail(input.nextLine());
      System.out.print("Phone Number :");
      student.setPhoneNumber(input.nextLine());
      System.out.print("Department : ");
      student.setDepartment(input.nextLine());
      students.put(student.getId(),new Student(student.getId(), student.getLastName(), student.getFirstName(), student.getDob(), student.getEmail(), student.getPhoneNumber(), student.getDepartment()));
      view.DisplayHeaderTable();
      view.DisplayStudent(student);
      autoID++;
   }
   public boolean searchStudentId(){
      view.DisplayHeaderTable();
      for(Entry<String, Student> student: students.entrySet()) view.DisplayStudent(student.getValue());
      System.out.print("Search : ");
      student.setId(input.nextLine());
      if(students.containsKey(student.getId())) {
         student = students.get(student.getId());
         view.DisplayHeaderTable();
         view.DisplayStudent(student);
         return true;
      }
      else{
         System.out.println("So Sad, that student not found in list!!!");
         return false;
      }
   }
   public void updateStudent(){
      if(!searchStudentId()) return;
      System.out.println("------Update information-----");
      System.out.print("First Name :");
      student.setFirstName(input.nextLine());
      System.out.print("Last Name :");
      student.setLastName(input.nextLine());
      System.out.print("Date of Birth : ");
      student.setDob(input.nextLine());
      System.out.print("Email : ");
      student.setEmail(input.nextLine());
      System.out.print("Phone Number :");
      student.setPhoneNumber(input.nextLine());
      System.out.print("Department : ");
      student.setDepartment(input.nextLine());
      students.put(student.getId(), student);
      System.out.println("Done!!!");
   }
   public void removeStudent(){
      if(!searchStudentId()) return;
      System.out.print("Do you want to delete ? y/n :");
      switch (input.nextLine()) {
         case "y":
            students.remove(student.getId());
            System.out.println("Delete successfully!!!");
            break;
         case "n":
            break;
         default:
            System.out.println("I don't understand what you mean!, So I can't delete him right now!!!");
            break;
      }
   }
}
