import java.util.*;
class Node{
	Node next;
	int data;
	public Node(int d){
		this.data=d;
	}
	public Node(){}
}

class ll extends Node{
	Node head;
	Node tail;
	void insertEnd(int data)
	{
		Node new1 = new Node(data);
		if(head==null)
		{
			head=new1;
			tail=new1;
			head.next=null;
		}
		else{
			tail.next=new1;
			tail=new1;
			tail.next=null;
		}
		System.out.println(data+" gets inserted at end!");
	}
	void insertBeg(int data)
	{
		Node new1 = new Node(data);
		if(head==null)
		{
			head=new1;
			tail=new1;
			head.next=null;
		}
		else{
			new1.next=head;
			head=new1;
		}
		System.out.println(data+" gets inserted at beginning!");
	}
	void insertbw(int data,int pos)
	{
		int i=1;
		Node t = head;
		Node new1=new Node(data);
		if(pos<=size())
		{
			while(i<pos-1)
			{
				t=t.next;
				i++;
			}
			new1.next=t.next;
			t.next=new1;
			t=null;
		}
		else{
			System.out.println("Enter the correct position!");
		}
	}
	void display()
	{
		Node r1=head;
		if(head==null)
			System.out.println("List is Empty");
		else{
			do{
				System.out.print(r1.data+" -> ");
				r1=r1.next;

			}while(r1!=null);
		}
		System.out.println();
	}
	void delete(int num)
	{
		Node r=head;
		if(r==null)
		{
			System.out.println("empty list");
			return;
		}
		while(r.next!=null)
		{
			if(r.next.data==num)
			{
				r.next=r.next.next;
				System.out.println(num +" gets deleted !");
				break;
			}
			r=r.next;
		}
	}
	int size()
	{
		int count=0;
		Node t = head;
		if(t==null)
			return count;
		do{
			count+=1;
			t=t.next;
		}while(t!=null);
		return count;
	}

	String search(int d)
	{
		Node t = head;
		String ans = "Not Found";	
		do{
			if(t.data==d)
			{
				ans="Found";
				break;
			}
			t=t.next;
		}while(t!=null);
		return ans;

	}

}

public class linkedlist{
	public static void main(String[] args)
	{
		ll n = new ll();
		Scanner c = new Scanner(System.in);
		while(true)
		{
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Linked list: \n== 1.insert beginning == 2.insert end == 3.insert between == 4.delete == 5.display == 6.search == 7.size == 8.exit ==");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
			int choice = c.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("enter the value ");
					n.insertBeg(c.nextInt());
					break;
				}
			case 2:
				{
					System.out.println("enter the value ");
					n.insertEnd(c.nextInt());
					break;
				}
			case 3:
				{
					System.out.println("enter the value and position");
					n.insertbw(c.nextInt(),c.nextInt());
					break;
				}
			case 4:
				{
					System.out.println("enter the data to be deleted");
					n.delete(c.nextInt());
					break;
				}
			case 5:
				{
					n.display();
					break;
				}
			case 6:
				{
					System.out.println("enter the value to be searched");
					System.out.println("\nThe value is "+n.search(c.nextInt()));
					break;
				}
			case 7:
				{
					System.out.println("\nThe size is : "+n.size());
					break;
				}
			case 8:
				{
					return;
				}

			}
		}

	}
}