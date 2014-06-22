package com.xihuani.datastructures;

public class Stack {
	
	private int size;
	private String [] stackArray;
	private int top = -1;
	
	public Stack(int size) throws IllegalArgumentException {
		if(size < 1){
			throw new IllegalArgumentException("The size of the stack must be greater than zero.");
		}
		this.size = size;
		stackArray = new String [size];		
	}
	
	public int push(String newItem) {
		if(top+1 < size){
			top++;
			stackArray[top] = newItem;
			return top;
		}else{
			System.out.println("The stack is full.");	
			return -1;
		}
	}
	
	public String pop(){
		if(top > -1){
			String oldItem = stackArray[top];
			stackArray[top] = null;
			top--;
			return oldItem;
		}else{
			System.out.println("The stack is empty.");
			return null;
		}
	}
	
	public String peek(){
		if(top > -1){
			return stackArray[top];
		}else{
			System.out.println("The stack is empty.");
			return null;
		}
	}
	
	public int size(){
		return size;
	}

}
