package com.java.basics;

public class GarbageCollector {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is destroyed");
	}

	public static void main(String[] args) {
		GarbageCollector a;
		for(int i=1; i<10;i++) {
			a=new GarbageCollector();
		}
	}
}
