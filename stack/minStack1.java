package stack;

import java.util.Stack;

class minStack{
  Stack<Integer> s = new Stack<>();
  Stack<Integer> ss = new Stack<>();

  void push(int a){
    s.push(a);
    if(ss.isEmpty() || ss.peek()>=a) ss.push(a);
  }

  int pop(){
    if(s.isEmpty()) return -1;
    int ans = s.peek();
    s.pop();
    if(ss.peek() == ans) ss.pop();
    return ans;
  }

  int min(){
    if(ss.isEmpty()) return -1;
    return ss.peek();
  }

  void display(){
    System.out.println("Stack : " + s);
    System.out.println("Min   : " + ss);
  }
}

public class minStack1 {
  public static void main(String[] args) {
    minStack x = new minStack();
    int arr[] = {18,19,29,15,16};
    for(int i=0; i<arr.length; i++){
      x.push(arr[i]);
    }
    x.display();
    System.out.println(x.min());
  }
}
