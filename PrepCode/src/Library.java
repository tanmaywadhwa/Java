import java.io.*;
import java.util.*;

public class Library {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		String actualDate = sn.nextLine();
		String idealDate = sn.nextLine();
		int lateMonths;
		int lateYears;
		int lateDays;
		
		String i[] = idealDate.split(" ");
		String a[] = actualDate.split(" ");
		
		String iYear = i[2];
		String iMonth = i[1];
		String iDate = i[0];
		String aYear = a[2];
		String aMonth = a[1];
		String aDate = a[0];
		
		if((lateYears=(Integer.parseInt(aYear) - Integer.parseInt(iYear))) > 0){
			System.out.println("10000");
		}
		else if( (lateMonths = (Integer.parseInt(aMonth) - Integer.parseInt(iMonth))) > 0 
				&& lateYears == 0){
			System.out.println(""+(500*lateMonths));
		}
		else if( (lateDays = (Integer.parseInt(aDate) - Integer.parseInt(iDate))) > 0 
				&& lateMonths == 0 && lateYears == 0){
			System.out.println(""+(15*lateDays));
		}
		else System.out.println("0");
		
//		System.out.println(iYear+iMonth+iDate);
//		System.out.println(aYear+aMonth+aDate);
		sn.close();
		
	}
}
