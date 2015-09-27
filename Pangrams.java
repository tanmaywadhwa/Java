import java.io.*;
import java.util.*;

public class Pangrams {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sn = new Scanner(System.in);
        String inputString = sn.nextLine();
        char[] stringArray = inputString.toCharArray();
        int inputLength = stringArray.length;
        //creating a reference hashmap
        Map<Character,Integer> comparisonMap=new HashMap<Character,Integer>();
        comparisonMap.put('a', 0);
        comparisonMap.put('b', 0);
        comparisonMap.put('c', 0);
        comparisonMap.put('d', 0);
        comparisonMap.put('e', 0);
        comparisonMap.put('f', 0);
        comparisonMap.put('g', 0);
        comparisonMap.put('h', 0);
        comparisonMap.put('i', 0);
        comparisonMap.put('j', 0);
        comparisonMap.put('k', 0);
        comparisonMap.put('l', 0);
        comparisonMap.put('m', 0);
        comparisonMap.put('n', 0);
        comparisonMap.put('o', 0);
        comparisonMap.put('p', 0);
        comparisonMap.put('q', 0);
        comparisonMap.put('r', 0);
        comparisonMap.put('s', 0);
        comparisonMap.put('t', 0);
        comparisonMap.put('u', 0);
        comparisonMap.put('v', 0);
        comparisonMap.put('w', 0);
        comparisonMap.put('x', 0);
        comparisonMap.put('y', 0);
        comparisonMap.put('z', 0);
        
        while(inputLength>0){
        	//insert each char into hashmap
        	if(comparisonMap.containsKey((""+stringArray[inputLength-1]).toLowerCase().toCharArray()[0])){
        		comparisonMap.put((""+stringArray[inputLength-1]).toLowerCase().toCharArray()[0], 1);
        	}
        	inputLength--;
        }

        if(comparisonMap.values().contains(0)) 
        	System.out.print("not pangram");
        else 
        	System.out.print("pangram");
        
        sn.close();
    }
}
