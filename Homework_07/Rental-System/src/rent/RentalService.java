package rent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import product.Product;


/**
 * RentalService
 */
public class RentalService extends RentalServiceSystem{

    public Map<String,ArrayList<Product>> products = new HashMap<>();
    public RentalHistory rentalHistory = new RentalHistory();

    public void DisplayRentalHistory(){

    }

    public void DisplayProduct(int productFilter){
        ArrayList<Product> tmpProducts;
        tmpProducts = productFilter == 1 ? products.get("house"):products.get("car");
        for(Product x:tmpProducts){ 
            System.out.println(x.printProduct());
        }
    }

    @Override
    public Rental AddNewRent() {
        // TODO Auto-generated method stub
        return null;
    }
}