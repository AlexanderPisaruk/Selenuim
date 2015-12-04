import static org.testng.AssertJUnit.assertEquals;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import java.util.ArrayList;
import java.util.List;

public class TestingResult {
	
	SeleniumDemo sel = new SeleniumDemo();
	List<String> APIKeys = sel.main(); 
	
	String oldAPI = APIKeys.get(0); 
	String newAPI = APIKeys.get(1); 
	
	@Test
	public void compareResults() {
		
		
		Assert.assertNotEquals(newAPI, oldAPI, "API hasn't been changed"); 
		
		
//		Assert.assertEquals(sel.main().get(1), sel.main().get(0), "Wrong"); 
	//	Assert.assertNotEquals(sel.main().get(1), sel.main().get(0), "Wrong"); 
		
	}
	
	

}
