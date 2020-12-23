package product;

import java.util.ArrayList;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
 * Car
 */
public class Car implements Product{
    private String id;
    private String color;
    private String plateNumber;
    private String brand;

    public Car(String brand){
        this.brand = brand;
    }

    public void setID(String id){

    }
    
    public void setColor(String color){

    }

    public void setPlateNumber(String plateNumber){

    }

    public void setBrand(String brand){

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
    public void printProduct() {
        // TODO Auto-generated method stub
        System.out.println(this.brand);

    }

}