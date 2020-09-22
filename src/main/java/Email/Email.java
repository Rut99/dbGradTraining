package Email;

import java.util.LinkedList;
import java.util.List;

public class Email {
	
    private String emailID;
    private String emailSubject;
    private String emailBody;
    List<String> emailAttachments= new LinkedList();
    public Email() {
    	this.emailID="rutuja.patil@db.com";
    	this.emailAttachments=emailAttachments;
    	this.emailBody="Hi how are you?";
    	this.emailSubject="Greetings!";   			
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getEmailSubject() {
		return emailSubject;
	}
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}
	public String getEmailBody() {
		return emailBody;
	}
	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}
    
}
