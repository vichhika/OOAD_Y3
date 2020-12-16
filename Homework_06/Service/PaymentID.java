package Service;

public class PaymentID {
    // Propery 
    private String paymentID;
    private String memberID;
    private int paidAmount;
    private int visaCardNo;
    private String paidDate;

    // method 
    public void payMembershipFee(int fee){

    }
    public String getPaymentID(){
        return this.paymentID;
    }
    public void setPaymentID(String id){
        this.paymentID = id;
    }

    public String getMemberID(){
        return this.memberID;
    }
    public void setMemberID(String id){
        this.memberID = id; 
    }

    public int getPaidAmount(){
        return this.paidAmount;
    }
    public void setPaidAmount(int paidAmount){
        this.paidAmount = paidAmount;
    }

    public int getVisaCardNo(){
        return this.visaCardNo;
    }
    public void setVisaCardNo(int visaCardNo){
        this.visaCardNo = visaCardNo;
    }

    public String getPaidDate(){
        return this.paidDate;
    }
    public void setPaidDate(int date){
        this.visaCardNo = date;
    }
}
