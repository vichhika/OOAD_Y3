package Person;

public class Member extends User{
    // property :
    private String memberID;
    private String iDCardNo;
    private String occupation;
    private String Organization;
    
    // method :
    public void setMemberID(String id){
        this.memberID = id;
    }
    public String getMemberID(){
        return this.memberID;
    }

    public void setIDCardNo(String idCard){
        this.iDCardNo = idCard;
    }
    public String getIDCardNo(){
        return this.iDCardNo;
    }
    
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
    public String getOccupation(){
        return this.occupation;
    }

    public void setOrganization(String org){
        this.Organization = org;
    }
    public String getOrganization(){
        return this.Organization;
    }
}
