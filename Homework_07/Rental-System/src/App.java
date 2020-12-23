import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);

    public static void menu(){
        while(true){
            System.out.println("-----Rental-System-----");
            System.out.println("1. Add a new rent");
            System.out.println("2. Display rental history");
            System.out.println("0. Exit");
            System.out.print("Choose:");
            switch (input.nextLine()) {
                case "1":
                    System.out.println("1. House");
                    System.out.println("2. Car");
                    System.out.println("Otherwise. Back");
                    System.out.print("Choose:");
                    switch (input.nextLine()) {
                        case "1":
                            
                            break;
                        case "2":

                            break;
                        default:
                            break;
                    }
                    break;
                case "2":

                    break;
                case "0":
                    return;
                default:
                    System.out.println("Input Incorrectly !");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        menu();
    }
}
