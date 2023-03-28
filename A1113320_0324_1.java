import java.util.*;
class animal{
	String name;
	double height;
	int weight;
	int speed;
	void show(){
		System.out.println("姓名:"+name);
		System.out.println("身高:"+height);
		System.out.println("體重:"+weight);
		System.out.println("速度:"+speed);
	}
	double distance(int x,double y){
		double d=1.0;
		d=x*y*this.speed;
		return d;
	}
	double distance(int x){
		double d=1.0;
		d=x*this.speed;
		return d;
	}
}
public class A1113320_0324_1{
	public static void main(String[]argv){
		
		animal[] c=new animal[4];
		for(int i=0;i<4;i++){
			c[i]=new animal();
			if(i==0){
				c[i].name="雪寶";
				c[i].height=1.1;
				c[i].weight=52;
				c[i].speed=100;
			}
			if(i==1){
				c[i].name="驢子";
				c[i].height=1.5;
				c[i].weight=99;
				c[i].speed=200;
			}
			if(i==2){
				c[i].name="安那";
				c[i].height=1.7;
				c[i].weight=48;
				c[i].speed=120;
			}
			if(i==3){
				c[i].name="愛沙";
				c[i].height=1.7;
				c[i].weight=50;
				c[i].speed=120;
			}
			}

			for(animal a:c){
				System.out.println("請輸入時間（分鐘）、（加速度）");
				int m;
				double s;
				Scanner sc=new Scanner(System.in);
				m=sc.nextInt();
				s=sc.nextDouble();
				a.show();
				System.out.println("距離:"+a.distance(m,s));
			}
			
		
	}
}
