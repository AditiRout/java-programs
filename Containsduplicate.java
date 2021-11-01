package newpack;
import java.util.Scanner;
public class Containsduplicate {
	public static boolean  containsDuplicate(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count+=1;
                    break;
                }
            }
            
        }
        boolean ter=count>0?true:false;
        return ter;
    }
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[]d=new int[15];
        for(int i=0;i<15;i++){
            d[i]=s.nextInt();
        }
        boolean ans=containsDuplicate(d);
        System.out.println(ans);
        s.close();
        
    }

}
