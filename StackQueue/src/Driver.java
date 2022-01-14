/**
 * StackQueue
 * A driver to test my StackQueue Java
 * Author: William Writer
 * Date: 1/14/22
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: WW
 **/
public class Driver {

    public static void main(String[] args) {
        StackQueue<String> q = new StackQueue<>();

        //isEmpty method
        System.out.println("Testing the isEmpty method: " + q.isEmpty()); //should return true
        //size method
        System.out.println("Testing the size method: " + q.size()); // return 0
        //peek method
        System.out.println("Testing the peek method: " + q.peek()); // return null
        //dequeue method
        System.out.println("Testing the dequeue method: " + q.dequeue()); // return null
        //enqueue method
        System.out.println("Testing the enqueue method "); // adds that.
        q.enqueue("CSA_IS_THE_BEST");
        //peek method
        System.out.println("Testing the peek method: " + q.peek()); //returns "CSA_IS_THE_BEST"
        //size method
        System.out.println("Testing the size method: " + q.size()); //returns 1
        //isEmpty method
        System.out.println("Testing the isEmpty method: " + q.isEmpty()); //return false
        //enqueue method
        System.out.println("Adding Hi using the enqueue method"); //adds hi
        q.enqueue("Hi");
        //dequeue methods
        System.out.println("Testing the dequeue method: " + q.dequeue()); //should return
        // "CSA_IS_THE_BEST" and delete it
        System.out.println("Testing the dequeue method: " + q.dequeue()); // should return hi and
        //delete it
        System.out.println("Testing the size method: " + q.size()); //should return 0
    }
}
