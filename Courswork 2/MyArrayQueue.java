
/** a queue class that uses a one-dimensional array */
import java.io.*;
import java.util.*;
public class MyArrayQueue
{
   // data members
   int front;          // one counterclockwise from first element
   int rear;           // position of rear element of queue
   Object [] queue;    // element array

   // constructors
   /** create a queue with the given initial capacity */
   public MyArrayQueue(int initialCapacity)
   {
      if (initialCapacity < 1)
         throw new IllegalArgumentException
               ("initialCapacity must be >= 1");
      queue = new Object [initialCapacity + 1];
      // default front = rear = 0
   }

   /** create a queue with initial capacity 5 */
   public MyArrayQueue()
   {// use default capacity of 5
      this(5);
   }

   // methods
   /** @return true iff queue is empty */
   public boolean isEmpty()
      {return front == rear;}


   /** @return front element of queue
     * @return null if queue is empty */
   public Object getFrontElement()
   {
      if (isEmpty())
         return null;
      else
         return queue[(front + 1) % queue.length];
   }

   /** @return rear element of queue
     * @return null if the queue is empty */
   public Object getRearElement()
   {
      if (isEmpty())
         return null;
      else
         return queue[rear];
   }

   /** insert theElement at the rear of the queue */
   public void enqueue(Object theElement)
   {
     int fakeRear = rear;
     int fakeFront = front;
     if (((rear + 1) % queue.length) != front){
       MyArrayQueue nextQueue = new MyArrayQueue(queue.length*2);
       for(int i = 0; i < queue.length; i++){
         nextQueue.queue[i] = queue[i];
       }
     queue = nextQueue.queue;
     rear = fakeRear;
     front = fakeFront;
     queue[((rear + 1) % queue.length)] = theElement;
     rear = ((rear + 1) % queue.length);
   }
   }

   /** remove an element from the front of the queue
     * @return removed element */
   public Object dequeue()
   {
     if(isEmpty()){
       return null;
     }
     else {
       Object firstItem = queue[(front + 1) % queue.length];
       front = (front + 1) % queue.length;
       return  firstItem;
     }
   }

   /** test program */
   public static void main(String [] args)
   {
      MyArrayQueue q = new MyArrayQueue(3);
      boolean first = true;
      int pick = 0;
      while(!q.isEmpty()||first == true){
        first = false;
        try{
          Scanner in = new Scanner(System.in);
          System.out.println("Please input the number of the choice you want to pick:");
          System.out.println("1. Add item to queue");
          System.out.println("2. Remove item from the queue");
          System.out.println("3. Quit");
          pick = in.nextInt();
        }
        catch(InputMismatchException e){
          System.out.println("Please enter 1, 2 or 3");
        }
        if (pick == 1){
          Scanner in_ch1 = new Scanner(System.in);
          System.out.println("Please enter the item you want to add to the queue");
          String input = in_ch1.nextLine();
          q.enqueue(input);
          System.out.println("Rear element : " + q.getRearElement());
          System.out.println("Front element : " + q.getFrontElement());
        }
        else if(pick == 2){
          System.out.println(q.dequeue());
          System.out.println();
          System.out.println("Rear element : " + q.getRearElement());
          System.out.println("Front element : " + q.getFrontElement());
        }
        else if(pick == 3) break;
      }
	  if (q.isEmpty()) System.out.println("empty queue");
   }
}
