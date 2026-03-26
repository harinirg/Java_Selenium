package com.collections;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk = new Stack<String>();
		System.out.println("Size of the stack is " + stk.size());
		stk.push("A");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		System.out.println("Elemnets in the stack " + stk);
		System.out.println("Size of the stack is " + stk.size());
		stk.pop();
		System.out.println("Elemnets in the stack after remove" + stk);
		System.out.println("Size of the stack after the removal is " + stk.size());
	}

}
