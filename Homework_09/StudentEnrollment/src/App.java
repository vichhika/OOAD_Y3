import java.util.Scanner;

public class App {

    private static Feature feature = new Feature();
    private static Scanner input = new Scanner(System.in);

    private static void menu(){
        while (true) {
            System.out.println("------Student Enrollment-----");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student By Id");
            System.out.println("3. Update Student");
            System.out.println("4. Remove Student");
            System.out.println("0. Exit");
            System.out.print("Choose:");
            switch (input.nextLine()) {
                case "1":
                    feature.addStudent();
                    break;
                case "2":
                    feature.searchStudentId();
                    break;
                case "3":
                    feature.updateStudent();
                    break;
                case "4":
                    feature.removeStudent();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Look at the menu again! and Choose by the number.");    
                    break;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        menu();
    }
}
