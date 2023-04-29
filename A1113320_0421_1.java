import java.util.*;
public class A1113320_0421_1{
	public static void main(String[]argv){
		System.out.println("請輸入email");
		String email;
		Scanner sc=new Scanner(System.in);
		email=sc.next();
		System.out.println(email.matches("[a-z]{5}[0-9]{1}[@]{1}[a-z]{5}[.]{1}[a-z]{3}"));
	}
}