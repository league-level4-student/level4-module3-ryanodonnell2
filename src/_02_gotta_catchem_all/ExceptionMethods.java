package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static int divide(int num, int divide) throws Exception {
		if(divide==0) {
			throw new Exception();
		}
		return num/divide;
	}
	public static String reverse(String message) throws Exception {		 
		if(message.equals("")) {
			throw new Exception();
		}
	    StringBuilder reverse = new StringBuilder();
	    reverse.append(message);
	    reverse = reverse.reverse();
	    return reverse.toString();
	}
	
}
