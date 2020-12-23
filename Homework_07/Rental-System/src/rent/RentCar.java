package rent;

public class RentCar implements Rental{
    
    private String id;
    private String userId;
    private String productId;
    private String dateRent;
    private String period;
    private String price;
    private final String limit = "700km";

    public String getLimit(){
       return this.limit; 
    }

    @Override
    public void setId(String id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setUserId(String userId) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setDateRent(String dateRent) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setPeriod(String period) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setPrice(String price) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getUserId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDateRent() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPeriod() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPrice() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getProductId() {
        // TODO Auto-generated method stub
        return null;
    }
}
