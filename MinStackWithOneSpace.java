import java.util.*;

class MyStack
{
  Stack<Integer> stack;
  int min ;
  MyStack(){
    stack = new Stack<>();
    
  }

  void pushIn(int a)
  {
    if(stack.size()==0)
    {
      min = a;
      stack.push(a);
    }
    else {
        if(a>=min)
            stack.push(a);
        else if(a<min){
            stack.push(2*a-min);
            min = a;
        }
    }

  }
  int popOut()
  {
    int ans=-1;
      if(stack.size()==0)
        return -1;
      else {
        if(stack.peek()>=min)
            return stack.pop();
        else
        {
          ans = min;
          min = 2*min-stack.pop();
          return ans;
        }
      }
  }
  int getMin()
  {
    if(stack.size()==0)
      return -1;
    return min;
  }
  int getTop(){
    if(stack.size()==0)
      return -1;
    else{
      if(stack.peek()>=min)
        return stack.peek();
      else  
        return min;
    }
  }


}

class Main {
  public static void main(String[] args) {
    MyStack m = new MyStack();
    m.pushIn(29);
    m.pushIn(19);
    m.pushIn(39);
    System.out.println("Minimum : "+m.getMin());
    System.out.println(m.popOut());
    m.pushIn(59);
    System.out.println("Top : "+m.getTop());
    m.pushIn(1);
    System.out.println("Top : "+m.getTop());  
   System.out.println("Minimum : "+m.getMin());
   

    


  }
}
