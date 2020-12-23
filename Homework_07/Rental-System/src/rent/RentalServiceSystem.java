package rent;
import product.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * RentalServiceSystem
 */
public abstract class RentalServiceSystem {

    public Map<String,ArrayList<Product>> products = new HashMap<>();
    public RentalHistory rentalHistory = new RentalHistory();

    public abstract void DisplayRentalHistory();

    public abstract void DisplayProduct(int productFilter);
    public abstract Rental AddNewRent(String type);
}