package Material;

import java.util.ArrayList;

/**
 * Homework
 */
public class Homework {

    private ArrayList<String> homework = new ArrayList<>();

    public setHomework(String title){
        homework.add(title);
    }

    public void getHomework(){
        for(String x: this.homework){
            System.out.println("- "+x);
        }
    }
    
}