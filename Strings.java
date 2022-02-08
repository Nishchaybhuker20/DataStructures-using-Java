import java.util.*;

public class Strings{
    public static void main(String args[]){
        String firstName = "Nishchay";
        String LastName = "bhuker";
        String emailAddress = firstName+LastName+"@gmail.com";
        //printing email address

        System.out.println(emailAddress);

//Creating substrings
        String name = firstName.substring(4, firstName.length());
        System.out.println(name);

//printing individual letters
        for(int i = 0; i<emailAddress - Strings.main(String[]){
        System.out.println(emailAddress.charAt(i));
    }
//control statements
    if(firstName.compareTo(LastName) == 0){
        System.out.println("Strings are equal");
    }else{
        System.out.println("Strings are not equal");
    }
}
}