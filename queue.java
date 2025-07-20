//FIFO approach
import java.util.*;
public class rajat{
    public static void main(String args[]){
        Queue<Double> queue = new LinkedList<>();//changing it into priority queue will make it get auto arranged using number system
        
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){//queue is not empty
            System.out.println(queue.poll());
        }
    }
}


//Queue<Double> queue=new PriorityQueue<>();
// 1.5
// 2.0
// 2.5
// 3.0
// 4.0

// while doing the Queue<double> queue=new Priority Queue(Collections.reverseOrder()); it will print in Descending order
// 4.0
// 3.0
// 2.5
// 2.0
// 1.5
//Similarly if we change the quehue type to string then also prioirty queu can be used 
