import java.util.Scanner;

public class Stacks {
	
	class Stack{
		 private int maximumSize;
		   private int[] stackArray;
		   private int top;
		   public Stack(int s) {
			   maximumSize = s;
		      stackArray = new int[maximumSize];
		      top = -1;
		   }
		   public void push(int j) {
		      stackArray[++top] = j;
		   }
		   public int pop() {
		      return stackArray[top--];
		   }
		   public int peek() {
		      return stackArray[top];
		   }
		   public boolean isEmpty() {
		      return (top == -1);
		   }
		   public boolean isFull() {
		      return (top == maximumSize - 1);
		   }
	}
	
	private int max_size;
	private int[] QueueArray;
	private int top;
	private int rear;
	private int size;
	Stack S1,S2;
	
	Stacks(int s){
		max_size = s;
		QueueArray = new int[s];
		size=-1;
		
		S1 = new Stack(s);
		S2 = new Stack(s);
	}
	
	void enqueue(int val){
		size++;
		while(!S1.isEmpty()){
			S2.push(S1.pop());
		}
		S1.push(val);
		while(!S2.isEmpty()){
			S1.push(S2.pop());
		}
	}
	
	int dequeue(){
		size--;
		return(S1.pop());
	}
	
	boolean isEmpty(){
		if (size==-1) 
			return true;
		return false;				
	}
	
	boolean isFull(){
		if (size==max_size-1) 
			return true;
		return false;				
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int size,num;
		System.out.println("Enter maximum Queue size: ");
		size = scan.nextInt();
		Stacks QueueArr = new Stacks(size);
		System.out.println("Enter input. Enter -999 when finished: ");
		num = scan.nextInt();
		 while(num!=-999)
	       {
	    	   if (!QueueArr.isFull()) {
			         QueueArr.enqueue(num);
				     num= scan.nextInt();
			       }
	    	   else{
	    		   System.out.println("Queue full");
	    		   break;
	    	   }
	       }

		 System.out.println("");
		 System.out.println("Enter '1' to enqueue"); 
		 System.out.println("Enter '2' to dequeue");
		 System.out.println("Enter '-1' to enqueue");
		 String choice = scan.next();
		 while(choice!="stop"){
			 if (choice.equals("1")){
				 System.out.println("Enter number to add in queue");
				 num = scan.nextInt();
				 QueueArr.enqueue(num);
			 }
			 else if (choice.equals("2")){
				 if (!QueueArr.isEmpty())
					 System.out.println(QueueArr.dequeue());
				 else
					 System.out.println("Queue empty");
			 }
			 else if (choice.equals("-1")){
				 break;
			 }
			 else{
				 System.out.println("Wrong number entered");
				 
			 }
			 System.out.println("");
			 System.out.println("Enter '1' to enqueue"); 
			 System.out.println("Enter '2' to dequeue");
			 System.out.println("Enter '-1' to enqueue");
			 choice = scan.next();
		 }
		 
		 while (!QueueArr.isEmpty()) {
	    	   
	         long value = QueueArr.dequeue();
	         System.out.print(value);
	         System.out.print(" ");
	       }
		 
	}
	

}
