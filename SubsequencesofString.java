public class SubsequencesofString{
    public static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        subsequences(str, idx+1, newString+currChar);

        subsequences(str, idx+1, newString);
    }
    public static void main(String args[]){
        String str = "abcd";
        removeDuplicates(str, 0, "");
    }
}