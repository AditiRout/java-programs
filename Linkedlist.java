package dsa;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>s=new LinkedList<String>();//one more is Arraylist
		s.add("1");
		s.add("2");
		s.add("3");
		Collections.sort(s);
		System.out.println(s.get(1));
		
		System.out.println(s);
			
		
		

	}

}
