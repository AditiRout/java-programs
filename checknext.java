package heya;

import java.util.Scanner;
import java.util.regex.Pattern;

public class checknext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String s = "Program:Java;Python;Android";  
        //Create scanner Object and pass string in it  
        Scanner scan = new Scanner(s);  
        //Check if the scanner has a token  
        System.out.println("Result: " + scan.hasNext());  
        //Print the string  
        //System.out.println("String: " +scan.nextLine());  
        //Check if the scanner has a token after printing the line  
        System.out.println("Final Result: " + scan.hasNext());  
        //Close the scanner
        String str = "JavaTpoint.com 15 + 15 = 18.0";  
        Scanner scanner = new Scanner(str);  
        //Checking scanner's next token matches "c"  
        System.out.println("Result: "+scanner.hasNext("JavaTpoint.com"));  
        //Checking scanner's next token matches "="  
        System.out.println("Result: "+scanner.hasNext("="));  
        //Print the rest of the string  
        System.out.println("Rest of String: "+scanner.nextLine());  
        
        //Initialize the String pattern  
        String pattern = "Program:.*";  
        //Check if pattern satisfies the String content  
        if(scan.hasNext(pattern)){  
          System.out.println("Pattern found");  
        }  
        else{  
          System.out.println("Pattern not found");  
        }  
        scanner.close();  
        scan.close();  
        Scanner sn = new Scanner("Names:Raju1;Pawan;Suresh");  
        //Declare the delimiter  
        sn.useDelimiter(";");  
        /*Initialize the String pattern which signifies that the String 
        token contains characters of the alphabet only*/  
        Pattern patern = Pattern.compile("[A-Za-z]*");  
        while(sn.hasNext()){  
            //Check if the token consists of declared pattern  
            if(sn.hasNext(patern)){  
                System.out.println(sn.next());  
            }  
            else  
                sn.next();  
            }  
            sn.close();  
    }    

	}


