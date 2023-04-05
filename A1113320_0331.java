import java.util.*;
class animal{
	String name;
	double height;
	int weight;
	int speed;
	animal(String name,double height,int weight,int speed){
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.speed=speed;
	}
	void show(){
		System.out.println("姓名:"+name);
		System.out.println("身高:"+height);
		System.out.println("體重:"+weight);
		System.out.println("速度:"+speed);
	}
	double distance(int x,double y){
		double d=1.0;
		d=x*y*this.speed;
		if(x==0){
			System.out.println("請重新輸入");
		}
		return d;
	}
	double distance(int x){
		double d=1.0;
		d=x*this.speed;
		if(x==0){
			System.out.println("請重新輸入");
		}
		return d;
	}
	public static void showinfo(){
		System.out.println("歡迎進入冰雪奇緣系統");
	}
}

class human extends animal{
	String gender;
	human(String name,double height,int weight,int speed,String gender){
		super(name,height,weight,speed);
		this.gender=gender;
	}
	void show(){
		super.show();
		System.out.println("性別："+gender);
	}
}

class snow extends human{
	int freeze;
	snow(String name,double height,int weight,int speed,String gender,int freeze){
		super(name,height,weight,speed,gender);
		this.freeze=freeze;
	}
	void show(){
		super.show();
		if(freeze==1){
			System.out.println("冰凍技能：Yes");
		}
		else{
			System.out.println("冰凍技能：No");
		}
	}

	@Override
	double distance(int x,double y){
		double d=1.0;
		d=(double)x*y*(double)this.speed*2;
		if(x==0){
			System.out.println("請重新輸入");
		}
		return d;
	}
	@Override
	double distance(int x){
		double d=1.0;
		d=x*this.speed*2;
		if(x==0){
			System.out.println("請重新輸入");
		}
		return d;
	}
}

public class A1113320_0331{
	public static void main(String[]argv) throws Exception{
		animal.showinfo();
		animal c1=new animal("雪寶",1.1,52,100);
		
		animal c2=new animal("驢子",1.5,99,200);
		
		human c3=new human("阿克",1.9,80,150,"男");
		
		human c4=new human("漢斯",1.8,78,130,"男");
		
		human c5=new human("安那",1.7,48,120,"女");
		
		snow c6=new snow("愛沙",1.7,50,120,"女",1);
	
		for(int i=1;i<=6;i++){
			if(i==1){
				System.out.println("請輸入時間（分鐘）、（加速度）");
				int m;
				double s;
				Scanner sc=new Scanner(System.in);
				m=sc.nextInt();
				s=sc.nextDouble();
				c1.show();
				System.out.println("距離:"+c1.distance(m,s));
			}
			if(i==2){
				System.out.println("請輸入時間（分鐘）、（加速度）");
				int m;
				double s;
				Scanner sc=new Scanner(System.in);
				m=sc.nextInt();
				s=sc.nextDouble();
				c2.show();
				System.out.println("距離:"+c2.distance(m,s));
			}
			if(i==3){
				System.out.println("請輸入時間（分鐘）、（加速度）");
				int m;
				double s;
				Scanner sc=new Scanner(System.in);
				m=sc.nextInt();
				s=sc.nextDouble();
				c3.show();
				System.out.println("距離:"+c3.distance(m,s));
			}
			if(i==4){
				System.out.println("請輸入時間（分鐘）、（加速度）");
				int m;
				double s;
				Scanner sc=new Scanner(System.in);
				m=sc.nextInt();
				s=sc.nextDouble();
				c4.show();
				System.out.println("距離:"+c4.distance(m,s));
			}
			if(i==5){
				System.out.println("請輸入時間（分鐘）、（加速度）");
				int m;
				double s;
				Scanner sc=new Scanner(System.in);
				m=sc.nextInt();
				s=sc.nextDouble();
				c5.show();
				System.out.println("距離:"+c5.distance(m,s));
			}
			if(i==6){
				System.out.println("請輸入時間（分鐘）、（加速度）");
				int m;
				double s;
				Scanner sc=new Scanner(System.in);
				m=sc.nextInt();
				s=sc.nextDouble();
				c6.show();
				System.out.println("距離:"+c6.distance(m,s));
			}
		}
	}
}