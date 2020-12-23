package rent;

import java.util.Scanner;

public class RentHouse implements Rental {
    private String id;
    private String userId;
    private String productId;
    private String dateRent;
    private String contract;
    private String deposit;
    private String price;

    public void setContract(String contract){
        this.contract = contract;
    }

    public void setDesposit(String desposit){
        this.deposit = desposit;
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

    @Override
    public void setPrice(String price) {
        // TODO Auto-generated method stub
        this.price = price;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return this.id;
    }

    @Override
    public String getUserId() {
        // TODO Auto-generated method stub
        return this.userId;
    }

    @Override
    public String getDateRent() {
        // TODO Auto-generated method stub
        return this.dateRent;
    }

    @Override
    public String getPrice() {
        // TODO Auto-generated method stub
        return this.price;
    }

    @Override
    public String getProductId() {
        // TODO Auto-generated method stub
        return this.productId;
    }

    @Override
    public void setProductId(String productID) {
        // TODO Auto-generated method stub
        this.productId = productID;
    }
    public String getContract(){
        return this.contract;
    }

    @Override
    public void filledInInfo() {
        // set id rent:
        id = Double.toString(Math.random());
        // set product ID:
        System.out.print("Enter Hourse ID: ");
        productId =  new Scanner(System.in).next();
        // set date rent:
        dateRent = "2020-12-24";
        // set contract:
        System.out.print("Contract: ");
        contract = new Scanner(System.in).next();
        // set deposit: 
        System.out.print("Deposit: ");
        deposit = new Scanner(System.in).next();
        // set price:
        price = "500$";
    }

    @Override
    public void displayRentalDetail() {
        // TODO Auto-generated method stub
        System.out.println("______Rent House______:");
        System.out.println("RentID: " + id);
        System.out.println("UserID: " + userId);
        System.out.println("House ID: " + productId);
        System.out.println("DateRent: " + dateRent);
        System.out.println("Contrat: " + contract);
        System.out.println("Price: " + price);
        System.out.println("Deposit: " + deposit);
    }
}
