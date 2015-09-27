import java.util.*;
public class CommonChild {

	//	Given two strings a and b of equal length, what's the longest string (S) that can be constructed such that it is a child of both? 
	//
	//	A string x is said to be a child of a string y if x can be formed by deleting 0 or more characters from y. 
	//
	//	For example, ‘‘abcd" and ‘‘abdc" has two children with maximum length 3, ‘‘abc" and ‘‘abd". Note that we will not consider ‘‘abcd" as a common child because ′c′ doesn't occur before ′d′ in the second string.
	//
	//	Input format
	//
	//	Two strings, a and b, with a newline separating them.
	//
	//	Constraints
	//
	//	All characters are upper cased and lie between ASCII values 65-90. The maximum length of the strings is 5000.
	//
	//	Output format
	//
	//	Length of string S.
	//
	//	Sample Input #0
	//
	//	HARRY
	//	SALLY
	//	Sample Output #0
	//
	//	2
	//	The longest possible subset of characters that is possible by deleting zero or more characters from HARRY and SALLY is AY, whose length is 2.
	//
	//	Sample Input #1
	//
	//	AA
	//	BB
	//	Sample Output #1
	//
	//	0
	//	AA and BB has no characters in common and hence the output is 0.
	//
	//	Sample Input #2
	//
	//	SHINCHAN
	//	NOHARAAA
	//	Sample Output #2
	//
	//	3
	//	The largest set of characters, in order, between SHINCHAN and NOHARAAA is NHA.
	//
	//	Sample Input #3
	//
	//	ABCDEF
	//	FBDAMN
	//	Sample Output #3
	//
	//	2
	//	BD is the longest child of these strings.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		char[] string1 = sn.nextLine().toCharArray();
		char[] string2 = sn.nextLine().toCharArray();
		Stack qualifying1,qualifying2;
		int initStringLength = string1.length;
		int i = initStringLength-1;
		
		while(i >= 0){
			if(present(i-initStringLength-1,string2)){
				
			}
			i--;
		}
		

	}
	static boolean present(int j,char[] secondString){
		//checks if char is present in the 2nd string after the given index
		return true;
	}
}
