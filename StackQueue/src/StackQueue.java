/**
 * StackQueue
 * A stack that is able to both enqueue and dequeue
 * Author: William Writer
 * Date: 1/14/22
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: WW
 **/
public class StackQueue <T> {
    //instance data
    private int count;
    private Stack stack1;
    private Stack stack2;

    //default constructor
    public StackQueue() {
        count = 0;
        stack1 = new Stack();
        stack2 = new Stack();
    }

    //enqueue method
    public void enqueue(T data) {
        //add the data to the first stack
        stack1.push(data);
        //increase the counter
        count++;
    }

    //dequeue method
    public T dequeue() {
        //variable to store the data removed to return it
        StackNode pop;
        //if there is no data return null
        if (count == 0) {
            return null;
        }
        //if there is one piece of data, pop it
        else if (count == 1) {
            //pop the data and store the return in a variable
            pop = stack1.pop();
        }
        //if stack is greater than one, remove data until last one from stack1 and add to stack2
        else {
            //go through and remove the elements and add to the other stack
            for (int i = 1; i < count; i++) {
                stack2.push(stack1.pop());
            }
            //remove the piece of data at the bottom
            //pop the data and store the return in a variable
            pop = stack1.pop();
            //move all the data back to stack1
            for (int i = 1; i < count; i++) {
                stack1.push(stack2.pop());
            }
        }
        //decrease counter
        //check if counter is above zero
        if (count > 0) {
            count--;
        }
        //return the value removed
        return (T) pop;
    }

    //peek method
    public T peek() {
        //if there is no data return null
        if (count == 0) {
            return null;
        }
        //if there is one piece of data, peek it
        else if (count == 1) {
            return (T) stack1.peek();
        } else {
            //if multiple pieces of data do same process as above to access the data
            //go through and remove the elements and add to the other stack
            for (int i = 1; i < count; i++) {
                stack2.push(stack1.pop());
            }
            //store the data to return
            StackNode returnStack = stack1.peek();
            //move all the data back to stack1
            for (int i = 1; i < count; i++) {
                stack1.push(stack2.pop());
            }
            //return the data
            //return the piece of data at the bottom
            return (T) returnStack;

        }
    }

    //isEmpty method
    public boolean isEmpty() {
        boolean mt = count > 0;
        return !mt;
    }

    //size method
    public int size() {
        return count;
    }
}
