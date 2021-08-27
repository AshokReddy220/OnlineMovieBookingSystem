import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class ValidateTheCardDeatilsTest extends TestCase {
   ValidateTheCardDeatils validatecard =
   new ValidateTheCardDeatils();
	@Test
	public void test() {
		String str ="855698325698147";
		try{
		String str1 =validatecard.validateCardNumber(str);
		assertEquals(16, str1);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void test1() {
		String str ="855698325698147";
		try{
		String str1 =validatecard.validateCardNumber(str);
		assertEquals(15, str1);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void test2() {
		String str ="22";
		try{
		String str1 =validatecard.validateCVV(str);
		assertEquals(3, str1);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
