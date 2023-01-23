package GFG.StackQueue;

import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {
    static class Queue{
        static Stack<Integer> s1=new Stack();
        static Stack<Integer> s2=new Stack();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is full.");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is full.");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args)
    {
        Queue q=new Queue();

        for(int i=1; i<=10; i++){
            q.add(i);
        }

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}

