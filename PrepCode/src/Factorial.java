import java.util.Scanner;
import java.math.*;
public class Factorial {

	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int number = Integer.parseInt(sn.nextLine());
		BigInteger factorialValue = new BigInteger("1");
		while(number>0){
			factorialValue=factorialValue.multiply(new BigInteger(""+number));
			number--;
		}
		System.out.println(""+factorialValue);
		sn.close();
        
	}
	
}
