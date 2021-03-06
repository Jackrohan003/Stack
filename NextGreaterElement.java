import java.util.*;
import java.lang.*;
import java.io.*;
class NextGreaterElement
 {
	public static void main (String[] args)
	 {
	     //code
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t>0){
	        int n = sc.nextInt();
	        long a[] = new long[n];
	        for(int i=0;i<n;i++){
	            a[i]= sc.nextLong();
	        }
	            
	        printNGE(a, n); 
	        System.out.println();
	        t--;
	    }
	
	 }
	 public static void printNGE(long a[],int n){

      long b[]=new long[n];
      Stack<Long> stack = new Stack<>();
      for(int i=n-1;i>=0;i--){

          if(stack.size()==0)
              b[i]=-1;
          else if(stack.size()>0 && stack.peek()>a[i])  
              b[i]=stack.peek();
          else if(stack.size()>0 && stack.peek()<=a[i]){

            while(stack.size()>0 && stack.peek()<=a[i])
                stack.pop();

            if(stack.size()==0)
              b[i]=-1;
            else  
              b[i]=stack.peek();
          }
          stack.push(a[i]);         
      }
      for(long i:b)
        System.out.print(i+" ");
  }
}
