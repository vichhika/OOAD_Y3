package rent;

public interface Rental {

    public void setId(String id);
    public void setUserId(String userId);
    public void setDateRent(String dateRent);
    public void setPeriod(String period);
    public void setPrice(String price);
    public String getId();
    public String getUserId();
    public String getDateRent();
    public String getPeriod();
    public String getPrice();
    public String getProductId();
    
}
