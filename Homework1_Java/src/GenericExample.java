import java.util.Scanner;

public class GenericExample <T>{
	private T var1;
	private T var2;
	
	public void setVar(T var1, T var2){
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public void disp(){
		System.out.println(var1 + "  " + var2);
	}
	
	public static void main (String args[]){
		GenericExample<String> genClass1 = new GenericExample<>();
		GenericExample<Integer> genClass2 = new GenericExample<>();
		String str1,str2;
		int int1, int2;
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter two strings");
		str1=myScan.next();
		str2=myScan.next();
		genClass1.setVar(str1,str2);
		System.out.println("Enter two integers");
		int1=myScan.nextInt();
		int2=myScan.nextInt();
		genClass2.setVar(int1, int2);
		System.out.println();
		System.out.println("Class created with type String");
		genClass1.disp();
		System.out.println("Class created with type Integer");
		genClass2.disp();
	}
	
}
