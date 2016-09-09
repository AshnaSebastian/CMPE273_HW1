import java.util.Scanner;

public class Queues {
	class Queue{
		private int maximumSize;
		private int[] QueueArray;
		private int top;
		private int rear;
		private int size;
		
		Queue(int s){
			maximumSize = s;
			QueueArray = new int[s];
			size=-1;
			top=0;
			rear=0;
		}
		
		void enqueue(int val){
			size++;
			QueueArray[top] = val;
			top++;
			top = top % maximumSize;
		}
		
		int dequeue(){
			
			int a = QueueArray[rear];
			rear++;
			rear = rear % maximumSize;
			size--;
			return a;
		}
		
		boolean isEmpty(){
			if (size==-1) 
				return true;
			return false;				
		}
		
		boolean isFull(){
			if (size==maximumSize-1) 
				return true;
			return false;				
		}
	}
	
	 private int maxSize;
	   private int[] stackArray;
	  Queue Q1;
	  Queue Q2;
	  int size=-1;
	  
	   public Queues(int s) {
	      maxSize = s;
	      stackArray = new int[maxSize];
	       Q1 = new Queue(maxSize);
		   Q2 = new Queue(maxSize);
	   }
	   
	   public void push(int j) {
		  int val;
	      Queue temp = new Queue(maxSize);
	      Q2.enqueue(j);
	      while (!Q1.isEmpty()) {	    	   
		         int value = Q1.dequeue();
		         Q2.enqueue(value);
		       }
	      temp=Q2;
	      Q2=Q1;
	      Q1=temp;
	      size++;
	   }
	   
	   public int pop() {
		   size--;
	      return(Q1.dequeue());
	      
	   }
	   
	   public long peek() {
	      return (Q1.QueueArray[Q1.size]);
	   }
	   
	   public boolean isEmpty() {
	      if (size == -1)
	    	  return true;
	      return false;
	   }
	   public boolean isFull() {
	      if(size == maxSize-1)
	    	  return true;
	      return false;
	   }
	   
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter maximum Stack size: ");
		num = sc.nextInt();
		Queues StackArr = new Queues(num);
		System.out.println("Enter input. Enter -999 when finished. ");
	       num= sc.nextInt();
	       while(num!=-999)
	       {
	    	   if (!StackArr.isFull()) {
			         StackArr.push(num);
			       }
	    	   else{
	    		 System.out.println("stack full.");
	    		 break;
	    	   }
	    	   num= sc.nextInt();
	       } 
	       int choice = 0;	    
	       while(choice!=-1){
				       System.out.println("Enter 1 to push a number to stack");
				       System.out.println("Enter 2 to pop a number from stack");
				       System.out.println("Enter 3 to peek the stack");
				       System.out.println("Enter 4 to display the contents of the stack");
				       System.out.println("Enter -1 to exit");
				       choice = sc.nextInt();
				       switch (choice){
				       case 1 :
				    	   System.out.println("Enter number to push to stack: ");
				    	   int input = sc.nextInt();
				    	   if (!StackArr.isFull()) {
						         StackArr.push(input);
						       }
				    	   else{
				    		 System.out.println("stack full.");
				    		 break;
				    	   }
				    	   break;
				       case 2 :
				    	   StackArr.pop();
				    	   break;
				       case 3 :
				    	   StackArr.peek();
				    	   break;
				       case 4 :
				    	   while (!StackArr.isEmpty()) {
					    	   
						         int value = StackArr.pop();
						         System.out.print(value);
						         System.out.print("\n");
						       }
				    	   break;
				       case -1 :
				    	   break;
				       default:
				    		   System.out.println("Wrong number entered");
				    
				       }
				       
		      }
	}

}
