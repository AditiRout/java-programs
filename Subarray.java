package heya;

import java.util.Scanner;

public class Subarray {
	public int sum(int[]nums,int a) {
		
		int []ans=new int[nums.length+1];
		ans[0]=0;
		for(int i=1;i<=nums.length;i++) {//1 2 3  1 3 6
			ans[i]=ans[i-1]+nums[i-1];
			
		}
		int c=0;
		for(int i=1;i<=nums.length;i++) {
			for(int j=0;j<i;j++) {//
				if(ans[i]-ans[j]==a) {
					c++;
					
				}
				
				
			}
		}
		return c;
			
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []ar= {1,2,3};
		
		Subarray t=new Subarray();
		int ans=t.sum(ar, 3);
		System.out.println("subarray:"+ ans);
		s.close();
		
		
		// TODO Auto-generated method stub

	}

}
