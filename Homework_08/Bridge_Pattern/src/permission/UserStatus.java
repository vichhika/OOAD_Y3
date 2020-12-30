import java.util.*;

import Material.Homework;
import person.*;

abstract class UserStatus{
    
    void addHW(Homework homework,String title){
        homework.setHomework(title);
        System.out.println("Add new homework done!");
    }
    void viewHW(Homework homework){
        homework.getHomework();
    }
    void submitHW(Student student,int homeworkID){
        
    }
}