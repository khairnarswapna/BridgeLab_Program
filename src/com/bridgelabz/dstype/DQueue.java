/**
 * purpose:for Dqueue implementation
 */
package com.bridgelabz.dstype;

public class DQueue<T> 
{
	
	Object[] deque;
	int front;
	int rear;
	int size;

	/**
	 * Purpose: constructor of class 
	 */
	public DQueue() 
	{
		deque = new Object[size];
		front = -1;
		rear = 0;
		this.size = size;
	}

	/**
	 * Purpose: inserting data from front of deque
	 * @param data input from user
	 */
	public void insertFront(T data) 
	{

		if (isFull()) 
		{
			System.out.println("Overflow");
			return;
		} 
		else 
		{ 
			if (front == -1)        //queue is initially empty
			{
				front = 0;
				rear = 0;
			} 
			else if (front == 0)
				
				front = size - 1;
			
			else
				front = front - 1;
			    deque[front] = data;

		}

	}

	/**
	 * Purpose: inserting data from rear end of deque
	 * @param data input from user
	 */
	public void insertRear(T data) 
	{
		if (isFull()) 
		{
			System.out.println(" Overflow ");
			return;
		} 
		else 
		{
			if (front == -1) 
			{
				front = 0;
				rear = 0;
			}
			else if (rear == size - 1)
				
				rear = 0;
			else
				rear = rear + 1;
				deque[rear] = data;
		}
		// insert current element into Deque
	}

	/**
	 * Purpose: delete front data of deque
	 */
	public void deleteFront() 
	{

		if (isEmpty()) 
		{
			System.out.println("Queue Underflow\n");
			return;
		} 
		else 
		{
			if (front == rear) 
			{
				front = -1;
				rear = -1;
			} 
			else 
			{
				if (front == size - 1)
					
					front = 0;
				
				else
					front = front + 1;
			}
			// deque[front] = 0;
		}

	}

	/**
	 * Purpose: delete rear data of deque
	 */
	public void deleteRear() 
	{
		if (isEmpty()) 
		{
			System.out.println(" Underflow");
			return;
		} 
		else 
		{
			if (front == rear) 
			{
				front = -1;
				rear = -1;
			} 
			else if (rear == 0)
				rear = size - 1;
			else
				rear = rear - 1;
		}

	}


	/**
	 * Purpose: checks deque is full or not
	 * @return returns true if full of deque else returns false
	 */
	public boolean isFull() 
	{
		return ((front == 0 && rear == size - 1) || front == rear + 1);
	}

 
	/**
	 * Purpose: checks deque is empty or not
	 * @return returns true if empty of deque else returns false
	 */
	public boolean isEmpty() 
	{
		if (rear == 0)
			return true;
		else if (front == -1)
			return true;
		return false;
	}


	/**
	 * Purpose: getting front element of deque
	 * @return returns the front element of deque
	 */
	@SuppressWarnings("unchecked")
	public T getFront() 
	{

		if (isEmpty()) 
		{
			System.out.println(" Underflow front");

		}
		 return (T) deque[front];
	}


	/**
	 * Purpose: getting rear value of deque
	 * @return returns the rear value of deque
	 */
	@SuppressWarnings("unchecked")
	public T getRear() 
	{
		// check whether Deque is empty or not
		if (isEmpty() || rear < 0) 
		{
			System.out.println(" Underflow rear");
		}
		return  (T) deque[rear];      //type casttype
	
	}  
    public void display()
    {
    	if(front==rear)
    	{
    		System.out.println("empty");
    	}
    	else
    	{
    		for(int i=front;i<rear;i++)
    		{
    			System.out.println(deque[i]+" ");
    		}
    	}
    }
}
