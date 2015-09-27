import java.util.Scanner;

public class FunnyStrings {
	// Problem Statement
	//
	// Suppose you have a string S which has length N and is indexed from 0 to
	// N−1. String R is the reverse of the string S. The string S is funny if
	// the condition |Si−Si−1|=|Ri−Ri−1| is true for every i from 1 to N−1.
	//
	// (Note: Given a string str, stri denotes the ascii value of the ith
	// character (0-indexed) of str. |x| denotes the absolute value of an
	// integer x)
	//
	// Input Format
	//
	// First line of the input will contain an integer T. T testcases follow.
	// Each of the next T lines contains one string S.
	//
	// Constraints
	//
	// 1<=T<=10
	// 2<=length of S<=10000
	// Output Format
	//
	// For each string, print Funny or Not Funny in separate lines.
	//
	// Sample Input
	//
	// 2
	// acxz
	// bcxz
	// Sample Output
	//
	// Funny
	// Not Funny
	// Explanation
	//
	// Consider the 1st testcase acxz
	//
	// here
	//
	// |c-a| = |x-z| = 2
	// |x-c| = |c-x| = 21
	// |z-x| = |a-c| = 2
	// Hence Funny.
	//
	// Consider the 2nd testcase bcxz
	//
	// here
	//
	// |c-b| != |x-z|
	// Hence Not Funny.

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int totalTests= Integer.parseInt(sn.nextLine());
		String[] inputStrings = new String[totalTests];
		for(int j=0;j<totalTests;j++){
			inputStrings[j]=sn.nextLine();
		}
		int initTestVal=totalTests;
		while(totalTests>0){
			char[] inputCharArr = inputStrings[initTestVal-totalTests].toCharArray();
			int i=0;
			boolean funny=true;
			while(i < (inputCharArr.length-1)){
				int currentVal= Character.getNumericValue(inputCharArr[i+1])
						- Character.getNumericValue(inputCharArr[i]);
				if(currentVal < 0) 
					currentVal = currentVal + (-2*currentVal);
				
				int revVal = Character.getNumericValue(inputCharArr[inputCharArr.length-(i+2)])
						- Character.getNumericValue(inputCharArr[inputCharArr.length-(i+1)]);
				if(revVal < 0) 
					revVal = revVal + (-2*revVal);

				//System.out.println(currentVal+"------"+ revVal);
				if(currentVal-revVal!=0) funny=false;
				i++;
			}
			if(funny) System.out.println("Funny");
			else System.out.println("Not Funny");
			totalTests--;
		}
		sn.close();
	}

}
