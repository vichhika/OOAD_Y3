
package Permission;
import person.*;
import Material.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class UserStatus{
    
    public void addHW(Homework homework){
        System.out.print("Homework discription : ");
        Scanner input = new Scanner(System.in);
        homework.setHomework(input.nextLine());
        System.out.println("Add new homework done!");
    }
    public void viewHW(Homework homework){
        homework.getHomework();
    }
    public void submitHW(ArrayList<String> submitHistory,String title){
        submitHistory.add(title);
        System.out.println("Well done!");
    }
}