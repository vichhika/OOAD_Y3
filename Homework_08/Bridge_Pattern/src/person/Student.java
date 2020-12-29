package person;

public class Student extends Person{
    @Override
    public void takeAction(String action){
        switch(action){
            case "ViewHW" : /*View Homework*/ break;
            case "Submit" : /*Submit Homework*/ break;
        }
    }
}
