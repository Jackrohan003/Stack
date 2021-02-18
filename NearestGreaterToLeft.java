import java.io.*;
import java.util.*;

class Main {  
  
  	public static void main (String[] args)
	 {
	     //code
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number that you want to exectute that much time");
	    int t = sc.nextInt();
	    while(t>0){
	        System.out.println("Enter Length of array ");
	        int n = sc.nextInt();
	        long a[] = new long[n];
	        System.out.println("Enter element:");
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
      for(int i=0;i<n;i++){

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
