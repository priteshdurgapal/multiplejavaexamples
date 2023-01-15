package com.data.structures;

import java.util.Arrays;

public class CustomArrayList<E> {
	
		final static int CAPACITY = 10;
		private E[] data;
		int size=0;
		public CustomArrayList() {this(CAPACITY);}
		public CustomArrayList(int capacity) {
			data= (E[]) new Object[capacity];
		}
		public int size() {return size;}
		
		public void add(int i,E e) throws IndexOutOfBoundsException {
			checkIndex(i,size+1);
			if(size==data.length) {
				ensureCapacity();
			}
			for(int k=size-1;k>=i;k--) {
				data[k+1]=data[k];
			}
			data[i]=e;
			size++;
		}
		
		public E remove(int i) {
			checkIndex(i,size);
			E temp=data[i];
			for(int k=i;k<size-1;k++) {
				data[k]=data[k+1];
			}
			return temp;
		}
		private void ensureCapacity() {
			int newSize = data.length*2;
			data = Arrays.copyOf(data, newSize);
			
		}
		private void checkIndex(int i, int n) {
			if(i<0||i>n) {
				throw new IndexOutOfBoundsException("Illegal index");
			}
		}
		
}
