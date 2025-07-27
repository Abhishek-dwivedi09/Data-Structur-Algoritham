package Stack;

/*

Stack Data Structure in Java
A stack is a fundamental data structure in computer science that follows the Last-In-First-Out (LIFO) principle. This means that the last element added to the
stack is the first one to be removed.
Think of a stack like a pile of books or plates - you add to the top and remove from the top.
Here's a basic implementation of a stack in Java:

*/

import java.util.ArrayList;
import java.util.EmptyStackException;



public class StackImplementationsDemo {

    // we make node class basically this class represent  each node of linkedlist with help of this class

    static class Node{
        // every node have data and next pointer
         int data;
         Node next;

   /*
     now we make a constructor
   Constructors in Java are special methods with the same name as the class. They are called when an object is created, and their main role is to initialize the object's
         */

        Node(int data){
            this.data = data;
            next  = null;
        }
    }

    // now we make a stack class here we emplement stack
    public static class  Stack{
        public static Node head;

        // here we make one function which check stack is empty or  not

        public static boolean isEmpty(){
            return head == null;
        }

        // now we make push function to implemen the stack
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next  = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty())
                return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty())
                return -1;
            return head.data;
        }




    }



    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }




    }

}
