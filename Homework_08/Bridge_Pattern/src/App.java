import java.util.Scanner;

import Material.Dorm;
import Material.Homework;
import Permission.Foreign;
import Permission.Local;
import person.Person;
import person.Student;
import person.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String choose1,choose2,choose3;
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
        
       while (true) {
           System.out.println("_____Class System_____");
           System.out.println("1. Local Student");
           System.out.println("2. Foreigner Student");
           System.out.println("3. Local Teacher");
           System.out.println("4. Foreigner Teacher");
           System.out.println("0. Exit");
           System.out.print("Choose:");
           switch(choose1 = input.nextLine()){
                case "1":
                    System.out.println("1. View Homework");
                    System.out.println("2. Submit Homework");
                    System.out.println("3. View submit History");
                    break;
                case "2":
                    System.out.println("1. View Homework");
                    System.out.println("2. Submit Homework");
                    System.out.println("3. View submit History");
                    System.out.println("4. Request Dorm");
                    break;
                case "3":
                    System.out.println("1. Add Homework");
                    break;
                case "4": 
                    System.out.println("1. Add Homework");
                    System.out.println("2. Request Dorm");
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Wrong input");
                    choose1 = "wrong";
                    break;
           }
           if(choose1 != "wrong"){
                System.out.print("Choose:");
                choose2 =input.nextLine();
                choose3 = choose1 + choose2;
                switch (choose3) {
                    case "11":
                        ((Student)lstudent).viewHW(myHomework);
                        break;
                    case "12":
                        System.out.print("Homework title : ");
                        ((Student)lstudent).addSubmit(input.nextLine());
                        break;
                    case "13":
                        ((Student)lstudent).viewSubmitHistory();
                        break;
                    case "21":
                        ((Student)fstudent).viewHW(myHomework);
                        break;
                    case "22":
                        System.out.print("Homework title : ");
                        ((Student)fstudent).addSubmit(input.nextLine());
                        break;
                    case "23":
                        ((Student)fstudent).viewSubmitHistory();
                        break;
                    case "24":
                        fstudent.requestDorm(myDorm);
                        break;
                    case "31":
                        ((Teacher)lteacher).addHome(myHomework);
                        break;
                    case "41":
                        ((Teacher)fteacher).addHome(myHomework);
                        break;
                    case "42":
                        fteacher.requestDorm(myDorm);
                        break;
                    default:
                        break;
                }
            }
       } 
    }
}
