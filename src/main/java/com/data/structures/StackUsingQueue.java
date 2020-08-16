package com.data.structures;

import java.util.LinkedList; 
import java.util.Queue; 
  
//ppackage testpractice;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> qu = new LinkedList<Integer>();

    void push(int val){
        int size=qu.size();
        qu.add(val);
        for(int i=0;i<size;i++){
            int x=qu.remove();
            qu.add(x);
        }
    }

    int pop(){
        if(qu.isEmpty()){
            System.out.println("no elements");
            return -1;
        }
        int answer=qu.remove();
        return answer;
    }

    void display(){
        for(Integer i:qu){
            System.out.println(i);
        }
    }

    public static void main(String[] args
    		){

        StackUsingQueue squ = new StackUsingQueue();
        squ.push(10);
        squ.push(20);
        squ.push(40);
        squ.display();
    }
}
    