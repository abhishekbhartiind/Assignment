
public class LinkedList {
	
	//It contains a static inner class ListNode
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	//Given a listNode,print all element
	public void display(ListNode head){
		if(head==null){return;}
		ListNode current= head;
		while(current!=null){
			System.out.print(current.data+ "-->");
			current= current.next;
		}
	}
	
	//find out length of linked list
	public int length(ListNode head){
		if(head==null){
			return 0;
		}
		int count=0;
		ListNode current=head;
		while(current!=null){
			count++;
			current=current.next;
		}
		return count;
	}
	
	public ListNode deleteAt(ListNode head,int position){
		int size =length(head);
		if(position>size|| position<1){
			return head;
		}
		if(position==1){
			ListNode temp= head;
			head= head.next;
			temp.next= null;
			return temp;
		}else{
			ListNode prev= head;
			int count=1;
			while(count<position-1){
				prev= prev.next;
				count++;
			}
			ListNode curr= prev.next;
			prev.next= curr.next;
			curr.next=null;
			return curr;
		}
		
	}
	public static void main(String[] args) {
		//Create a LinkedList
		// 12 --> 6 --> 8 --> 1--> 16-->null
		
		ListNode head= new ListNode(12);
		ListNode second= new ListNode(6);
		ListNode third= new ListNode(8);
		ListNode fourth= new ListNode(1);
		ListNode fifth= new ListNode(16);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		LinkedList ll = new LinkedList();
		ll.display(head);
		System.out.println();
		System.out.println(ll.length(head));
		
		ListNode l2= ll.deleteAt(head, 3);
		System.out.println(l2.data);
		ll.display(head);

	}

}
