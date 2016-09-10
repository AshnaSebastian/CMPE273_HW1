import java.util.ArrayList;

import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
		ArrayList<Integer> integerArray = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter Array size : ");
		
		int arraySize = scan.nextInt();
		
		System.out.println("Enter Array elements : ");
		for (int i=0;i<arraySize;i++){
			integerArray.add(scan.nextInt());
		}
		System.out.println("Enter sum");
		int sum = scan.nextInt();
		integerArray.sort(null);
		int l =0, r= integerArray.size()-1;
		while(l<r){
			if(integerArray.get(l)+integerArray.get(r)==sum){	
				System.out.println(integerArray.get(l)+" "+integerArray.get(r));
				r--;
				l++;
			}
			else if(integerArray.get(l)+integerArray.get(r)>sum){
				r--;
			}
			else{
				l++;
			}
		}
		

	}
	
	

}
