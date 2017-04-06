import org.junit.Test;
import static org.junit.Assert.*;

public class MyApplicationTest{
	@Test
	public void testDoService(){
		MyApplication app = new MyApplication();
		assertEquals("Its empty",app.doService(""));
		assertEquals("Its not empty",app.doService("as"));
	}
}