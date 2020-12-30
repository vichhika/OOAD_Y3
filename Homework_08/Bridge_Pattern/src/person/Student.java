package person;

import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<String> submitHistory = new ArrayList<>();
    @Override
    public void takeAction(String action){
        switch(action){
            case "ViewHW" : /*View Homework*/ break;
            case "Submit" : /*Submit Homework*/ break;
        }
    }
    public ArrayList getSubmitHistory(){
        return submitHistory;
    }
}
