package rent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import product.Product;


/**
 * RentalService
 */
public class RentalService extends RentalServiceSystem{
    @Override
    public void DisplayRentalHistory(){
        for (int i = 0; i < rentalHistory.Size(); i++){
            rentalHistory.getRentalAt(i).displayRentalDetail();
        }
    }
    @Override
    public void DisplayProduct(int productFilter){
        ArrayList<Product> tmpProducts;
        tmpProducts = productFilter == 1 ? products.get("house"):products.get("car");
        for(Product x:tmpProducts){ 
            System.out.println(x.printProduct());
        }
    }

    @Override
    public Rental AddNewRent(String type) {
        // TODO Auto-generated method stub
        if (type == "Car"){
            return new RentCar();
        }else if (type == "House")
            return new RentHouse();
        else 
            return null;
    }
}