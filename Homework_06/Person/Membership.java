package Person;

public class Membership {
    // property : 
    private String memberID;
    private String startedDate;
    private String expiredDate;
    private String status;
    private int fee;

    // method : 
    public void renew(){

    }

    public void setMemberID(String id){
        this.memberID = id;
    }
    public String getMemberID(){
        return this.memberID;
    }

    public void setStartedDate(String date){
        this.startedDate = date;
    }
    public String getStartedDate(){
        return this.startedDate;
    }

    public void setExpiredDate(String date){
        this.expiredDate = date;
    }
    public String getExpiredDate(){
        return this.expiredDate;
    }

    public void setMembership(String status){
        this.status = status;
    }
    public String getMembership(){
        return this.status;
    }

    public void setFee(int fee){
        this.fee = fee;
    }
    public void getFee(int fee){
        this.fee = fee;
    }
    
}
