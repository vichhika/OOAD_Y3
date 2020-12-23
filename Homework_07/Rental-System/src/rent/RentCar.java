package rent;

import java.util.Scanner;

public class RentCar implements Rental {
    
    private String id;
    private String userId;
    private String productId;
    private String dateRent;
    private String period;
    private String price;
    private final String limit = "700km/per day";

    public String getLimit(){
       return this.limit; 
    }

    @Override
    public void setId(String id) {
        // TODO Auto-generated method stub
        this.id = id;
    }

    @Override
    public void setUserId(String userId) {
        // TODO Auto-generated method stub
        this.userId = userId;
    }

    @Override
    public void setDateRent(String dateRent) {
        // TODO Auto-generated method stub
        this.dateRent = dateRent;
    }

    public void setPeriod(String period) {
        // TODO Auto-generated method stub
        this.period = period;
    }

    @Override
    public void setPrice(String price) {
        // TODO Auto-generated method stub
        this.price = price;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public String getUserId() {
        // TODO Auto-generated method stub
        return userId;
    }

    @Override
    public String getDateRent() {
        // TODO Auto-generated method stub
        return dateRent;
    }

    public String getPeriod() {
        // TODO Auto-generated method stub
        return period;
    }

    @Override
    public String getPrice() {
        // TODO Auto-generated method stub
        return price;
    }

    @Override
    public String getProductId() {
        // TODO Auto-generated method stub
        return productId;
    }

    @Override
    public void setProductId(String productID) {
        // TODO Auto-generated method stub
        this.productId = productID;
    }

    @Override
    public void filledInInfo() {
        // set id rent:
        id = Double.toString(Math.random());
        // set product ID:
        System.out.print("Enter Car ID: ");
        productId =  new Scanner(System.in).next();
        // set date rent:
        dateRent = "2020-12-24";
        // set contract:
        System.out.print("Period: ");
        period = new Scanner(System.in).next();
        // set price:
        price = "500$";
    }

    @Override
    public void displayRentalDetail() {
        // TODO Auto-generated method stub
        System.out.println("______Rent Car______:");
        System.out.println("RentID: " + id);
        System.out.println("UserID: " + userId);
        System.out.println("DateRent: " + dateRent);
        System.out.println("Period: " + period);
        System.out.println("Price: " + price);
        System.out.println("Limit: " + limit);
    }
}
