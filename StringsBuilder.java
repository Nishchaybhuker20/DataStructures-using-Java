import java.util.*;

public class StringsBuilder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Helloworld");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'P');
        System.out.println(sb);


        //insertion in string
        sb.insert(0,'S');
        System.out.println(sb);

        //Deletion in String
        sb.delete(2, 3);
        System.out.println(sb);


        //using append to add at last
        sb.append("e");
        sb.append("l");
        sb.append("t");
        System.out.println(sb);
    }
}