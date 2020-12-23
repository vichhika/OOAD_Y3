package product;

/**
 * Car
 */
public class Car implements Product{
    private String id;
    private String color;
    private String plateNumber;
    private String brand;

    public Car(String brand){
    }

    public void setID(String id){
        this.id = id;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    public void setPlateNumber(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getID(){
        return this.id;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getPlateNumber(){
        return this.plateNumber;
    }
    
    public String getBrand(){
        return this.brand;
    }

    @Override
    public String printProduct() {
        // TODO Auto-generated method stub
    }

}