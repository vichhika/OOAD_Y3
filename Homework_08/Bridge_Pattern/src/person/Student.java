package person;

import java.util.ArrayList;

import Material.Dorm;
import Material.Homework;
import Permission.Foreign;
import Permission.UserStatus;

public class Student extends Person{
    private ArrayList<String> submitHistory = new ArrayList<>();
    public Student(){
       
    }

    public void viewHW(Homework homework){
        userStatus.viewHW(homework);
    }

    public void addSubmit(String title){
        userStatus.submitHW(submitHistory, title);
    }
    public void  viewSubmitHistory(){
       for (String string : submitHistory) {
           System.out.println(string);
       }
    }
    public void requestDorm(Dorm dorm){
        if(userStatus instanceof Foreign){
            ((Foreign)userStatus).requestDorm(this, dorm);
        } else{
            System.out.println("Your are not Foreign");
        } 
    }
}
