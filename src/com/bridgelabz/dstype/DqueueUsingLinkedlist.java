/**
 * 
 */
package com.bridgelabz.dstype;

public class DqueueUsingLinkedlist<T>
{
	LinkedList<T> deque = new LinkedList<T>();
	int front = 0;
	int rear = 0;

	/**
	 * Purpose: insert data from front
	 * @param data input from user
	 */
	public void insertFront(T data) 
	{
		deque.addAtStart(data);
		front++;
	}

	/**
	 * Purpose: insert data from rear
	 * @param data input from user
	 */
	public void insertRear(T data) 
	{
		deque.add(data);
		rear++;
	}

	/**
	 * Purpose: remove element from front
	 */
	public void removeFront() 
	{
		deque.deleteAtStart();
		front--;
	}

	/**
	 * Purpose: remove element from rear end
	 */
	public void removeRear() 
	{
		rear--;
		deque.deleteAtEnd();
	}

	/**
	 * Purpose: getting value from front
	 * @return returns the value
	 */
	public T getFront() 
	{
		return deque.get(--front);
	}
    /**
	 * Purpose: getting value from rear
	 * @return returns the value
	 */
	public T getRear() 
	{
		return deque.get(rear);
	}

}
