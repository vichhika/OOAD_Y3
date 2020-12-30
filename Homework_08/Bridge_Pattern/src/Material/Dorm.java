package Material;

import java.util.ArrayList;

/**
 * Dorm
 */
public class Dorm {

    public ArrayList<String> room = new ArrayList<>();

    public Dorm(){
        for(int i=0;i<10;i++){
            room.add("Room-"+i);
        }
    }
    public void reStoreRoom(String roomName){
        room.add(roomName);
    }

    public String getRoom(){
        String tmpRoom = new String();
        if(!room.isEmpty()){
            tmpRoom = room.get(0);
            room.remove(0);
            System.out.print("Your Dorm Room name is " +tmpRoom);
        }else{
            System.out.println("Room is available F*!");
        }
        return tmpRoom; 
    }
}
