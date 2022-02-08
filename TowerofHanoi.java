public class TowerofHanoi{
    public static void towerofHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk"+ n + " From " + src + " to " + dest);
            return;
        }
        towerofHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n + " from " + src + " to " + dest);
        towerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String args []){
        int n = 1;
        towerofHanoi(n, "S", "H", "D");
    }
}