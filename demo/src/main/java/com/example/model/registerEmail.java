package com.example.model;

public class registerEmail {
	 // Class data members
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
    public registerEmail(String  recipient,String msgBody,String subject,String attachment) {
    	 this.recipient = recipient;
    	 this.msgBody = msgBody;
    	 this.subject = subject;
    	 this.attachment = attachment;
    	 
    	
    }
    public String getRecipient() {
    	return this.recipient;
    }
    public String getMsgBody() {
    	return this.msgBody;
    }
    public String getSubject() {
    	return this.subject;
    }

}
