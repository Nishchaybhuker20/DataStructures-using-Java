public class CheckArrayisSorted {
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]) {
            return isSorted(arr, idx+1);
        } else{
            return false;
        }
    }
    public static void main(String args[]){
        String str = "abaacdaefaahs";
        findOccurance(str, 0, 'a');
    }
}