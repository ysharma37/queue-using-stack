public class QueueUsingStacks{

    int head = 0;
    int tail = 0;
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    void enqueue(int a){
        s1.push(a);
        tail++;
    }
    
    int dequeue(){
        if(s1.empty()){
            return Integer.MIN_VALUE;
        }
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int a = s2.pop();
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        head++;
        return a;
    }
    
    void show(){
        if(s1.empty()){
            System.out.println("Empty queue");
            return;
        }
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        while(!s2.empty()){
            int a = s2.peek();
            s1.push(s2.pop());
            System.out.println(a);
        }
    }
}

public class Queues{
    public static void main(String []agrs){
        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.show();

        System.out.println("\n"+q.dequeue());
        System.out.println(q.dequeue()+"\n");
        q.show();
       
    }
}