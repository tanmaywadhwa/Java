import static org.junit.Assert.*;

class Template{
	private static String test(String input){
	return input;
	}
	@Test
	private static void testTemplate(){
	}
	public static void main(String[] args){
		System.out.println(test("whatever"));	
	}
}
