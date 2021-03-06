import java.util.ArrayList;
import java.util.Scanner;

import product.Car;
import product.House;
import product.Product;
import rent.RentCar;
import rent.RentHouse;
import rent.Rental;
import rent.RentalService;
import rent.RentalServiceSystem;

public class App {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Product> houses = new ArrayList<>();
    private static ArrayList<Product> cars = new ArrayList<>();
    private static RentalServiceSystem rentalService = new RentalService();

    public static void initProduct(){
        houses.add(new House("h1","16m x 6m","Phnom Penh", "Vila", "5", "2", true));
        houses.add(new House("h2","13m x 6m", "Phnom Penh", "Vila", "4", "2", true));
        houses.add(new House("h3","6m x 10m", "Kandal", "Flat", "2", "1", false));
        cars.add(new Car("c1", "white", "2A-1153", "Jeep"));
        cars.add(new Car("c2", "black", "2B-1223", "BMW"));
        cars.add(new Car("c3", "Red", "2A-5555", "Apple"));

        rentalService.products.put("house", houses);
        rentalService.products.put("car", cars);
    }
    public static void registerNewRent(String type){
        Rental rent = rentalService.AddNewRent(type);
        // set userId:
        rent.setUserId("Cus1");
        // filled in info:
        rent.filledInInfo();
        // add new contract to rental History:
        rentalService.rentalHistory.addNewRental(rent);
    }


    public static void menu(){
        initProduct();
        while(true){
            System.out.println("-----Rental-System-----");
            System.out.println("1. Add a new rent");
            System.out.println("2. Display rental history");
            System.out.println("0. Exit");
            System.out.println("-----------------------");
            System.out.print("Choose:");
            switch (input.nextLine()) {
                case "1":
                    System.out.println("-----------------------");
                    System.out.println("1. House");
                    System.out.println("2. Car");
                    System.out.println("Otherwise. Back");
                    System.out.println("-----------------------");
                    System.out.print("Choose:");
                    switch (input.nextLine()) {
                        case "1":
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("ID |\tSize\t\t|\tType\t\t\t|\tLocation\t|  Bed Room\t|  Bath Room\t|  ParkingLot  ");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                            rentalService.DisplayProduct(1);
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                            //add rent for house here
                            registerNewRent("House");
                            System.out.println("Succesfully Rent!");
                            break;
                        case "2":
                            System.out.println("-------------------------------------------------------------");
                            System.out.println("ID |  Brand\t|\tColor\t| Plate Number");
                            System.out.println("-------------------------------------------------------------");
                            rentalService.DisplayProduct(2);
                            System.out.println("-------------------------------------------------------------");
                            //add rent for car here
                            registerNewRent("Car");
                            System.out.println("Succesfully Rent!");
                            break;
                        default:
                            break;
                    }
                    System.out.println("_______________________________________________________________________");
                    break;
                case "2": 
                    //Display history here
                    System.out.println("");
                    rentalService.DisplayRentalHistory();
                    System.out.println("");
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
