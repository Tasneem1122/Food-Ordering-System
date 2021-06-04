import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test;
public class JUnitTesting {

	@Test		
    public void testAssert(){					
        		
        //Variable declaration		
        String string1[]={"Salad", "Japanese Noodles", "Spaghetti", "Spaghetti Meat Balls", "Thai Food"};					
        String string2[]={"Chocolate Pudding", "Lemon Ice"};					
        					
        		
        //Assert statements					
        assertNotSame(string1, string2);					
        assertNotNull(string1);		
	}

}
