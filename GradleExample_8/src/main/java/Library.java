/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'Arko Sarkar' at '2/23/17 7:26 PM' with Gradle 2.14.1
 *
 * @author Arko Sarkar, @date 2/23/17 7:26 PM
 */
import org.apache.commons.lang.StringUtils;
public class Library {
    public boolean checkString(String value) {
		if(StringUtils.isEmpty(value)){
			return true;
		}
        return false;
    }
	
	public static void main(String args[]){
		System.out.println("Hello");
	}
}
