package Core;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import org.xml.sax.SAXException;

public class TestRunner {
	
	public static void main (String[] args) 
			throws IOException, ParserConfigurationException, SAXException {
		
		
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG tng = new TestNG(); 
				
				
		XmlSuite suite = new XmlSuite(); 
		suite.setName("TmpSuite");
		List<String> files = new ArrayList<>(); 
		
		files.addAll(new ArrayList<String>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{ add("C:\\Users\\Alexander_Pisaruk\\workspace\\SeleniumFrameworks\\src\\TestSuite.xml");}});

        suite.setSuiteFiles(files);   
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);        
        tng.setXmlSuites(suites);
        
        tng.addListener(tla);

		tng.run(); 
		
		
		}
	

}
