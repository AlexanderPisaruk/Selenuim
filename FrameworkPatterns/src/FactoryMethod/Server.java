package FactoryMethod;

public class Server {

	
	protected String serverType; 
	protected String serverLink; 
	
			
	public String getServerType(){return serverType;};  
	public String getServerLink(){
		
		if (serverType == "QA"){serverLink = "https://videoportalqa.epam.com";}
		if (serverType == "PROD"){serverLink = "https://videoportal.epam.com";}
		if (serverType == "autoQA"){serverLink = "https://videoportalautoqa.epam.com";}
				
		
		return serverLink;};  
	
	
	public void setServerType(String newType){serverType = newType;}; 			
	//public void  setServerLink(String newLink){serverLink = newLink;}; 
	
	
		
		
		
	} 
	
	
	
	
	
