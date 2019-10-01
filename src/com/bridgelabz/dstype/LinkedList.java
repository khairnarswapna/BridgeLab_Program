/**
 * generics type of linkedlist function


 */
package com.bridgelabz.dstype;

public class LinkedList<G> 
{
	 
		Node<G> head;
		public Object deleteAt;
		int size = 0;
		
		
		/**
		 * Purpose: method for check list is empty or not
		 * @return returns true if list empty else returns false
		 */
		public boolean isEmpty() 
		{
			return head == null;
		}

		/**
		 * Purpose: method for getting the size of linked list 
		 * @return returns the size of linked list
		 */
		public int size() 
		{
			return size;
		}
		
		/**
		 * Purpose: method for insert node into linked list
		 * @param :input as data from user
		 */
		public void add(G i) 
		{
			Node<G> newnode = new Node<G>();
			
			newnode.data = i;
			
			if (head == null) 
			{
				head = newnode;
				size++;
			}

			else 
			{
				Node<G> n = head;
				while (n.next != null) 
				{
					n = n.next;
				}
				n.next = newnode; //append the newnode at the end
				size++;
			}
		}

		/**
		 * Purpose: Method for Adding node at beginning(start) of linked list
		 * @param :input as data from user
		 */
		public void addAtStart(G data) 
		{
			Node<G> newnode = new Node<G>();
			newnode.data = data;
			newnode.next = null; 
			
			newnode.next = head;
			head = newnode;
			size++;
		}

		/**
		 * Purpose: Method for Adding node at specific index of linked list 
		 * @param index input from user
		 * @param data  input from user
		 */
		public void addAt(int index, G data) 
		{
			Node<G> newnode = new Node<G>();
			newnode.data = data;
			
			if (index == 0)
				head = newnode;
			else 
			{
				Node<G> n = head;
				for (int i = 0; i < index - 1; i++) 
				{
					n = n.next;
				}
				newnode.next = n.next;
				n.next = newnode;
			}
			size++;
		}
		
		/**
		 * 
		 * @param index from the user
		 * @return 
		 */

		public G get(int index) 
		{
			if (index == 0)
				return head.data;
			else 
			{
				Node<G> n = head;
				for (int i = 0; i < index; i++) 
				{
					if (n.next != null) 
					{
						n = n.next;
					} 
					else 
					{
						return null;
					}

				}
 
				return n.data;

			}

		}

		/**
		 * Purpose:Method for deleting node from beginning(start) of linked list
		 */
		public void deleteAtStart() 
		{
			head = head.next;
			size--;
		}

		/**
		 * Purpose:THis Method for deleting node from index position of linked list
		 * @param index input from user
		 */
		public void deleteAt(int index) 
		{
			if (index == 0) 
			{
				head = head.next;
			
			} 
			else 
			{
				Node<G> n = head;
				Node<G> n1 = null;
				for (int i = 0; i < index - 1; i++) 
				{
					n = n.next;
				}
				n1 = n.next;
				n.next = n1.next;
 
				n1 = null;
			}
			size--;

		}

		/**
		 * Purpose: Method for deleting node from end of linked list
		 */
		public void deleteAtEnd() 
		{
			if (!isEmpty()) 
			{
				Node<G> n = head;

				while (n.next != null) 
				{
					n = n.next;
				}
				System.out.println("Node deleted is: " + n.data);
				n.next = null; //next feild is null

			} 
			else 
			{
				System.out.println("Linked list is empty nothing to delete");
			}
			size--;
		}

		/**
		 * Purpose: Method is for displaying Node Linked list
		 */
		public void display() 
		{
			Node<G> n = head;
			while (n.next != null) 
			{
				System.out.print(n.data + " ");
				n = n.next;
			}
			System.out.println(n.data);
		}

		/**
		 * Purpose: printing the list without using spaces
		 */
		public String showListWithoutSpaces() 
		{
			String str = "";
			Node<G> n = head;
			while (n.next != null) 
			{
				str += n.data;
				n = n.next;
			}
			str += n.data;
			return str;
		}

		/**
		 * Purpose: method which convert list in string and return it
		 * @return returns the list in string
		 */
		public String returnListInString() 
		{
			String str = "";
			Node<G> n = head;
			while (n.next != null) 
			{
				str += n.data + ",";
				n = n.next;
			}
			str += n.data;
			return str;
		}

		/**
		 * Purpose: method for search node from list
		 * @param key  input from user
		 * @param size input from user
		 * @return updated size if delete then size-- else incrementing size++
		 */
		public int searchNode(G key, int size) 
		{
			boolean isFound = false;  //boole
			int counter = -1;
			Node<G> n = head;
			while (n.next != null) 
			{
				counter++;
				if (n.data.equals(key)) 
				{
					isFound = true;
					break;
				}
				n = n.next;
			}
			if (isFound) 
			{
				System.out.println("key found and deleting...");
				deleteAt(counter);
				size--;
				
			} 
			else if (n.data.equals(key)) 
			{
				System.out.println("key found at last and deleting...");
				counter++;
				deleteAt(counter);
				size--;
			}
			else 
			{
				System.out.println("key not found and inserting...");
				size++;
				add(key);
			}
			return size;
		}

		/**
		 * Purpose: method for sort the Integer list 
		 * @param size size of an array
		 */
		
	
		@SuppressWarnings("hiding")
		public <G extends Comparable<G>> void sort(int size) 
		{
			@SuppressWarnings("unchecked")
			Node<G> n = (Node<G>) head;
			Node<G> n1 = n.next;
			G temp;

			for (int i = 0; i < size - 1; i++) 
			{
				for (int j = 0; j <= size - 1 - i - 1; j++) 
				{

					if (n.data.compareTo(n1.data) > 0) 
					{
						temp = n.data;
						n.data = n1.data;
						n1.data = temp;
					}
					n1 = n1.next;
				}
				n = n.next;
				n1 = n.next;
			}
		}
 

}
