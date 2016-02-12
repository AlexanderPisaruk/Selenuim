package FactoryMethod;

public class FactoryMethod {

	
	public static Server setDefaultServer () { 
	
			Server server = new Server(); 
			server.setServerType("QA");
			
			return server; 
		};
	
		
		public static Server setProdServer () { 	
		

			Server server = new Server(); 
			server.setServerType("PROD");
			
			return server; 
			
		}
		
		
		public static Server setAutoQAServer () { 
		
			Server server = new Server(); 
			server.setServerType("autoQA");
			
			return server; 
			
			
		}
			
			
}
