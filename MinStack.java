//design a stack that supports getMin() in O(1) time

import java.util.*;

class MyStack
{
  Stack<Integer> stack;
  Stack<Integer> min;
  
  MyStack(){
    stack = new Stack<>();
    min = new Stack<>();
  }

  void pushIn(int a)
  {
    stack.push(a);
    if(min.size()==0||min.peek()>=a)
        min.push(a);

  }
  int popOut()
  {
      if(stack.size()==0)
        return -1;
      int ans = stack.pop();
      if(ans == min.peek())
          min.pop(); 
        return ans;
  }
  int getMin()
  {
    if(min.size()==0)
      return -1;
    return min.peek();
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
    m.pushIn(1);
   System.out.println("Minimum : "+m.getMin());
   

  }
}
