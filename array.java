package heya;

public class array {
    
	public static void main(String[] args) {
		int []a= {1,3,5,6,7,8};
		int[]b=new int[6];
		System.arraycopy(a,0,b,0,4);
		for(int i=0;i<5;i++) {
			System.out.println(b[i]+" ");
		}
		String s="Happy";
		System.out.println("New string is:"+s.concat(" Learning"));
		s="anagrar";
		String t="naargam";
		
		System.out.println(t.compareTo(s));
		System.out.println(s.contains("l"));
		String replace=s.replace('e', 'a');
		System.out.println(replace);
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 3, "HEL");
		System.out.println(sb);
		sb.append(" peter");
		System.out.println(sb);
		sb.delete(0, 1);//delete range
		System.out.println(sb);
		sb.insert(0, 'H');
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		 StringBuilder builder=new StringBuilder("hello");  
	     builder.append("java");  
	     System.out.println(builder);  
	     builder.insert(0, "Welcome");
	     System.out.println(builder); 
		
		// TODO Auto-generated method stub

	}

}
