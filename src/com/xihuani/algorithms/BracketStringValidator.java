package com.xihuani.algorithms;

import com.xihuani.datastructures.Stack;



public class BracketStringValidator {

	public static boolean isValid(String s){
		
		String [] c = s.trim().split("");
		Stack stack = new Stack(c.length);
		
		
		for(String d: c){	
			
			if (d.equals("(")){
				stack.push(String.valueOf(d));
			}
			if (d.equals("{")){
				stack.push(String.valueOf(d));
			}
			if (d.equals("[")){
				stack.push(String.valueOf(d));
			}
			
			
			if (d.equals(")")){
				if (stack.peek().equals("(")){
					stack.pop();
				} else {
					return false;
				}
			}
			if (d.equals("}")){
				if (stack.peek().equals("{")){
					stack.pop();
				} else {
					return false;
				}
			}
			if (d.equals("]")){
				if (stack.peek().equals("[")){
					stack.pop();
				} else {
					return false;
				}
			}
		}
		
		return stack.peek() == null;
		
	}
	
}
