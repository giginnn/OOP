import java.util.*;
public class A1113320_0317_1{
	public static void main(String[]argv){
		int n,m,i,j;
		System.out.println("請輸入n與m");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int[][] a;
		a=new int[n][m];
		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++){
				a[i][j]=(i+1)*(j+1);
			}
		}

		for(int[] line1:a){
			for(int line2:line1){
				System.out.print(line2+"\t");
			}
			System.out.println("");
		}
	}
}

