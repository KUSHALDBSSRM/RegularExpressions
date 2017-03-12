/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondportion;
import java.util.regex.*;
import java.util.*;

/**
 *
 * @author kushal
 */
public class REprog6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
     String input="",s="" ;
     int k=0,ke=0;
     input = sc.nextLine();
     Pattern p = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
          Matcher match = p.matcher(input);
     if(match.matches())
         System.out.println("Valid");
     else
         System.out.println("InValid");


    
    
    }
    
}
