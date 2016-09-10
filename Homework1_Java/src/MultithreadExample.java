
public class MultithreadExample {
	
	
	public class MultiThreadClass extends Thread{
		public void run(){
			try {
				sleep(60);
				
				System.out.println("Thread id : " + this.getId() + " started." );
				for(int i=0;i<5;i++){
					sleep(60);
					System.out.println("Thread id : " + this.getId()+ "  count :" + i);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	MultiThreadClass ThreadClass;

	
	MultithreadExample(){
		 ThreadClass = new MultiThreadClass();
	
	}

	public static void main(String[] args) {
		for (int i=0;i<10;i++){
			MultithreadExample mult = new MultithreadExample();
			mult.ThreadClass.start();
			
		}

	}

}
