package rent;

public interface Rental {

    public void setId(String id);
    public void setUserId(String userId);
    public void setDateRent(String dateRent);
    public void setPrice(String price);
    public void setProductId(String productID);
    public String getId();
    public String getUserId();
    public String getDateRent();
    public String getPrice();
    public String getProductId();
    public void filledInInfo();
    public void displayRentalDetail();
    
}
