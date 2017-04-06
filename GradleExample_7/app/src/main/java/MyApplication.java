
public class MyApplication{
	public String doService(String value){
		MyService service = new MyService();
		if(service.checkMyString(value)){
			return "Its empty";
		}else{
			return "Its not empty";
		}
	}
	public static void main(String args[]){
		MyApplication app = new MyApplication();
		System.out.println(app.doService("Hello Multi project"));
		System.out.println(app.doService(""));
	}
}