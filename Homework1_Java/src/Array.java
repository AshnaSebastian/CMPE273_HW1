

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.println("enter size of array");
		Scanner scan = new Scanner(System.in);
		int arrLength = scan.nextInt();
		int arr [] = new int[arrLength];
		int productArray [] = new int[arrLength];
		int leftPrdtArray[] = new int[arrLength];
		int rightPrdtArray[] = new int[arrLength];
		System.out.println("Enter array data");
		for (int i=0;i<arrLength;i++){
			arr[i] = scan.nextInt();
		}
		System.out.println("The array is :");
		for (int i=0;i<arrLength;i++){
			System.out.print(arr[i]+ "  ");
		}
		System.out.println("\nThe left product is :");
		for (int i=0;i<arrLength;i++){
			if(i==0)
				leftPrdtArray[i] = 1;
			else
				leftPrdtArray[i] = leftPrdtArray[i-1]*arr[i-1];
		}
		for (int i=0;i<arrLength;i++){
			System.out.print(leftPrdtArray[i] + "  ");
		}
		System.out.println("\nThe right product is :");
		for (int i=arrLength-1;i>=0;i--){
			if(i==(arrLength-1))
				rightPrdtArray[i] = 1;
			else
				rightPrdtArray[i] = rightPrdtArray[i+1]*arr[i+1];
		}
		for (int i=0;i<arrLength;i++){
			System.out.print(rightPrdtArray[i] + "  ");
		}
		System.out.println("\nThe final product is :");
		for (int i=0;i<arrLength;i++){
			productArray[i] = leftPrdtArray[i]  * rightPrdtArray[i] ;
		}
		for (int i=0;i<arrLength;i++){
			System.out.print(productArray[i] + "  ");
		}
	}

	
	
	

}
