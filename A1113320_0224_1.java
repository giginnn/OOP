import java.util.*;
public class A1113320_0224_1{
	public static void main(String[]argv){
		int a;
		System.out.println("Please input an integer");
		Scanner number=new Scanner(System.in);
		a=number.nextInt();
		if(a%2==0){
			System.out.println("偶數");
		} 
		else{
			System.out.println("奇數");
		}
	}
}