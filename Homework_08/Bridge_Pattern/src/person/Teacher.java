package person;

import Material.Dorm;
import Material.Homework;
import Permission.Foreign;
import Permission.UserStatus;

public class Teacher extends Person {

    public Teacher() {
    }

    public void addHome(Homework homework) {

        userStatus.addHW(homework);
    }

    public void requestDorm(Dorm dorm) {
        if (userStatus instanceof Foreign) {
            ((Foreign) userStatus).requestDorm(this, dorm);
        }
    }
}
