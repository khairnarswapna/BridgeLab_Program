package com.bridgelabz.dstype;

import java.util.Scanner;

public class QueueUsingLinkedList<T> 
{
	LinkedList<T> queue = new LinkedList<T>();
	int index;
 
	Scanner scanner = new Scanner(System.in);
	int counter = 1;

	/**
	 * Purpose: method for getting the size of queue
	 * @return returns the size
	 */
	public int size() 
	{
		return index;
	}

	/**
	 * Purpose: method for enqueue the element
	 * @param data getting the from the userdata
	 */
	public void enQueue(T data) 
	{
		queue.add(data);
		index++;
	}

	/**
	 * Purpose: method for dequeue the element
	 */
	public void deQueue() 
	{
		index--;
		queue.deleteAt(index);
	}

	/**
	 * Purpose: method for printing queue
	 */
	public void show() 
	{
		queue.display();
	}

	/**
	 * Purpose: checking weather queue is empty or not
	 * @return returns the true if empty else false
	 */
	public boolean isEmpty() 
	{
		return queue.isEmpty();
	}

	/**
	 * Purpose: getting the value of last index
	 * 
	 * @return returns the value
	 */
	public T get() 
	{
		return queue.get(index);
	}

	/**
	 * Purpose: getting the value of particular index
	 * @param ind index value provided by user
	 * @return returns the value
	 */
	public T get(int index) 
	{
		return queue.get(index);
	}

	/**
	 * Purpose: method for printing queue without spaces
	 */
	public String showQueueWithoutSpace() {
		return queue.showListWithoutSpaces();
	}
	 
}
