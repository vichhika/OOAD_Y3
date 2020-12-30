import Material.Dorm;
import Material.Homework;
import Permission.Foreign;
import Permission.Local;
import person.Person;
import person.Student;
import person.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        Homework myHomework = new Homework();
        Dorm myDorm = new Dorm();

        Person lstudent = new Student();
        lstudent.setUserStatus(new Local());
        Person fstudent = new Student();
        fstudent.setUserStatus(new Foreign());
        Person lteacher = new Teacher();
        lteacher.setUserStatus(new Local());
        Person fteacher = new Teacher();
        fteacher.setUserStatus(new Foreign());

        
        

    }
}
