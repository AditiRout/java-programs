package dsa;

import java.util.*;
import java.util.Scanner;

class Sol {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>>l=new ArrayList<List<Integer>>();
		if(numRows==0) {
			
			return l;
		}
        l.add(new ArrayList<>());//have to give space
		l.get(0).add(1);
		for(int i=1;i<numRows;i++) {
			List<Integer>row=new ArrayList<Integer>();
			List<Integer>prev=l.get(i-1);
			row.add(1);
			for(int j=1;j<i;j++) {
				row.add(prev.get(j-1)+prev.get(j));
			}
			row.add(1);
			l.add(row);
			
		}
		

		return l;
	}
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		List<List<Integer>>l=new ArrayList<>();
		Sol w=new Sol();
		l=w.generate(x);
		System.out.println(l);
		s.close();
		

	}

}