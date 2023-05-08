import A1113320_0505_2.*;
import java.util.*;

class MyException extends Exception{
    MyException(String a){
        super(a);
    }
}

public class A1113320_0505_1 {
    public static void main(String[] args) throws Exception {
        
        int [] myn=getn();
        int [] win={10,13,16,19,21,8};

        lucky.lottery ilottery = new lucky.lottery(myn,win);
        System.out.println(ilottery.toString());
    }


    public static int[] getn(){
        Scanner sc=new Scanner(System.in);
        int [] numbers =new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("輸入整數" + (i + 1) + ": ");
            
            try{
                int num=sc.nextInt();

                if(num<1 || num>49){
                throw new MyException("請輸入1~49!");
                }
                else{
                    numbers[i]=num;
                }
                
            }
            catch(MyException e){
                System.out.println(e.getMessage());
                i--;
            }
        }
        return numbers;
    }
}