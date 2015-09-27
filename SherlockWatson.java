import java.util.*;

public class SherlockWatson {
	public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int startIndex=0;
        String nkq[] = (sn.nextLine()).split(" ");
        int n=Integer.parseInt(nkq[0]);
        int k=Integer.parseInt(nkq[1]);
        int q=Integer.parseInt(nkq[2]);
        String numArray[] = (sn.nextLine()).split(" ");
        
        if(k<=(n-1) && k!=0){
            startIndex=k-1;
        }
        else if(k>(n-1) && k!=0){
            startIndex=(n%k)-1;
        }
        
        while(q>=1){
            //output the index element
            int demandedIndex=Integer.parseInt(sn.nextLine());
            if((startIndex+demandedIndex)>=n){
                int actualIndex = demandedIndex+startIndex-n;
                System.out.println(numArray[actualIndex]);
            }            
            else{
                int actualIndex = startIndex+demandedIndex;
                System.out.println(numArray[actualIndex]);
            }
            q--;
        }
        sn.close();
	}
}
