package Service;

public class Email {
    // property :
    private String subject;
    private String date;
    private String content;
    private String Recipient;
    
    // method : 
    public void sendEmail(){

    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return this.subject;
    }
    public void sendDate(String date){
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
    public void setRecipient(String recipient){
        this.Recipient = recipient;
    }
    public String getRecipient(){
        return this.Recipient;
    }
}
