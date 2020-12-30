package Permission;
import Material.Dorm;
import person.Person;

public class Foreign extends UserStatus {
    private String room;

    public void requestDorm(Person person,Dorm dorm){
        room = dorm.getRoom();
        System.out.println("Accept your request");
    }

    public void getRoomDetail() {
        System.out.println(room);
    }
}
