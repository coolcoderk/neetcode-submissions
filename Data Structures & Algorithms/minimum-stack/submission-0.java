class MinStack {
    int mini=0;
   


    Stack<Integer>min ;
    Stack<Integer>minim ;
    public MinStack() {
        min = new Stack<>();
           minim = new Stack<>();
          
    }
    
    public void push(int val) {
        if(minim.size()==0) minim.push(val);
        else if(val<=minim.peek()) minim.push(val);
        min.push(val);
    }
    
    public void pop() {


        int v= min.pop();
           if(minim.peek()==v) minim.pop();
               
    }
    
    public int top() {
        return min.peek();
                
    }
    
    public int getMin() {
              return minim.peek();
              
    }
}
