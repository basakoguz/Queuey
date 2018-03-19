import java.util.LinkedList;
import java.util.Stack;

public class Queuey <D> { //V2.0 Generics exercise; data type <D> added.

  LinkedList<D> queue /*= new LinkedList<D>()*/;

  public Queuey() {
    queue = new LinkedList<D>();
  }

  public boolean isEmpty(){
    return queue.isEmpty(); //Using the built in isEmpty() method of java for LinkedLists.
  }

  public int size(){
    return queue.size(); //size() is a built in method for LinkedLists.
  }

  public void enqueue(D n){ //Add an element from the queue.
    queue.addLast(n); //addLast is a built in method for LinkedLists.
  }

  //Returns the item dequeued.
  public D dequeue(){ //Remove the first element at the beginning of LinkedList.
    //First in first out.
    return queue.remove(0); //remove() is a built in method for LinkedLists.
    /*Casting like (int)queue.remove(0); to make the returned element an int.
    Bc we know everything in the LinkedList is an int (enqueue(int n)). */
    //V2.0 Generics exercise; casting (int) removed.
  }

  public D peek() { //Peek at the first item.
    return queue.get(0);
  }

  public static void main (String[] args){
    Queuey numberQueue = new Queuey();
    numberQueue.enqueue(5);
    numberQueue.enqueue(7);
    numberQueue.enqueue(6);
    System.out.println("First out: " + numberQueue.dequeue());
    System.out.println("Peek at first item: " + numberQueue.peek());
    System.out.println("Second out: " + numberQueue.dequeue());
    System.out.println("Third out: " + numberQueue.dequeue());

    Queuey stringQueue = new Queuey();
    numberQueue.enqueue("Cem");
    numberQueue.enqueue("is");
    numberQueue.enqueue("lovely");
    System.out.println("First out: " + numberQueue.dequeue());
    System.out.println("Second out: " + numberQueue.dequeue());
    System.out.println("Third out: " + numberQueue.dequeue());

    Stack<String> stacky = new Stack<>();
    stacky.push("there");
    stacky.push("Hi");
    System.out.println("Size of stacky is " + stacky.size() + ".");
    System.out.println("And what's in it is: \n" + stacky.pop() + " " + stacky.pop() + "!");


  }
}
