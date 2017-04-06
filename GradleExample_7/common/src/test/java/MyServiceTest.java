import org.junit.Test;
import static org.junit.Assert.*;

public class MyServiceTest{
	@Test
	public void testCheckString(){
		MyService service = new MyService();
		assertTrue(service.checkMyString(""));
		assertFalse(service.checkMyString("as"));
	}
}