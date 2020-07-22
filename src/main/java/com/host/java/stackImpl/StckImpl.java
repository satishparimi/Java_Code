package com.host.java.stackImpl;

public class StckImpl {

	public static final int MAX = 1000;
	int arr []= new int[MAX];
	int Top;

	StckImpl() {
		Top = -1;
	}

	boolean isEmpty() {
		return Top < 0;
	}

	boolean Push(int input) {
		if (Top >= MAX - 1) {

			System.out.println("stack over flow");
			return false;
		} else {

			arr[++Top] = input;

			return true;
		}

	}

	int pop() {

		if (Top < 0) {
			System.out.println("Stack is underflow");
			return 0;
		} else {
			int res = arr[Top--];
			return res;
		}

	}

	int peek() {
		if (Top < 0) {
			System.out.println("Stack in underflow");
			return 0;
		} else {
			
			int res = arr[Top];
			return res;
		}
	}
	
	
	public static void main(String[]args) {
		
		StckImpl stack = new StckImpl();
		
		stack.Push(2);
		stack.Push(5);
		stack.Push(8);
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}