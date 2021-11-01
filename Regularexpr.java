package heya;

import java.util.regex.*;

public class Regularexpr {

	public static void main(String[] args) {
		String pattern="[a-zH]+";
		//String pattern="in";
		//String pattern="\\bin\\b";
		String check="Happy learning in edun 12";
		Pattern p=Pattern.compile(pattern);
		Matcher c=p.matcher(check);
		while(c.find()) {//the one which matches with pattern
			System.out.println(check.substring(c.start(),c.end()));
		}
		// TODO Auto-generated method stub

	}

}
