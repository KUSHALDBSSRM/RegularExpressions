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
public class REprog3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 Scanner sc = new Scanner(System.in);
     String input="",s="" ;
     int k=0,ke=0;
     input = sc.nextLine();
     Pattern p = Pattern.compile(".*//");
     Pattern p1 = Pattern.compile("//.*:");
     Pattern p2 = Pattern.compile("/(.*)html");
     Matcher match = p.matcher(input);
     Matcher m = p1.matcher(input);
     Matcher m1 = p2.matcher(input);
     int pos = input.indexOf("//");
     System.out.println("prottocol:"+input.substring(0,pos));
     k = input.indexOf(':', pos+2);
     System.out.println("hostname:"+input.substring(pos+2,k));
     ke = input.indexOf('/',k);
     int kl = input.indexOf(".html");
     System.out.println("Path:"+input.substring(ke+1,kl)+".html");

    }
    
}
