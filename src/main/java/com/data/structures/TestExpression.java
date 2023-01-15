package com.data.structures;

import java.util.Stack;

public class TestExpression {

	public static int isMatched(String expression){
	    final String opening = "({[";
	    final String closing = ")}]";
	    Stack<Character> buffer = new Stack<Character>();
	    
	   // for(char c:expression.toCharArray()){
	    	//System.out.println(opening.indexOf(c));
	      //  if(opening.indexOf(c)!=-1) {
	        //    buffer.push(c);
	       // }//System.out.println("push"+buffer);}
	          //  else if(closing.indexOf(c)!=-1){
	            	/*char c1 = buffer.pop();
	            	System.out.println("pop"+c1);*/
	             //   if(buffer.isEmpty())
	                	
	              //  char c1=buffer.pop();
	               // System.out.println("pop"+buffer);
	               // if(closing.indexOf(c)!=opening.indexOf(c1)) {
	                	//System.out.println("i am here");
	               // return false;
	               // }
	            //}
	    //}
	   // return buffer.isEmpty();
	    return 1;
	}
	public static void main(String[] args) {
	      
	          //boolean answer=false;
	          //answer=isMatched("");
			//	System.out.println(isMatched());
	         // System.out.println(answer);
	}

}

