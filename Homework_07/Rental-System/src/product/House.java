package product;

/**
 * House
 */
public class House implements Product{

    private String id;
    private String location;
    private String size;
    private String type;
    private String bedRoom;
    private String bathRoom;
    private boolean ParkingLot;
    
    
    public House(){

    }

    public void setId(String id){
        this.id = id;
    }

    public void setLocation(String location){
       this.location = location; 
    }

    public void setSize(String size){
       this.size = size; 
    }

    public void setType(String type){
       this.type = type; 
    }

    public void setBedRoom(String bedroom){
       this.bedRoom = bedroom; 
    }

    public void setBathRoom(String bathroom){
       this.bathRoom = bathroom; 
    }

    public void setParkingLot(boolean parking){
        this.ParkingLot = parking;
    }

    public String getId(){
        return this.id;
    }

    public String getLocation(){
        return this.location;
    }

    public String getSize(){
        return this.size;
    }

    public String getType(){
        return this.type;
    }

    public String getBedRoom(){
        return this.bedRoom;
    }

    public String getBathRoom(){
        return this.bathRoom;
    }

    public boolean getParkingLot(){
        return this.ParkingLot;
    }

    @Override
    public String printProduct() {
        // TODO Auto-generated method stub

    }
}