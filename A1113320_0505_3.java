package A1113320_0505_2;

public class A1113320_0505_3 {
    int [] ipn;
    int [] winn;
    int count=0;
    public lottery(int [] ipn,int []winn){
        this.ipn=ipn;
        this.winn=winn;
    }
    public String toString(){
        for(int user:ipn){
            for(int host:winn){
                if(user==host){
                    count++;
                    break;
                }
            }
        }
        
        if(count>=3){
            return "中獎了";
        }
        else{
            return "沒中獎";
        }
        
    }

    
}
