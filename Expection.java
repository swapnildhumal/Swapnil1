package swapnil1;

public class Expection {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("code failed due to space"+e);
        }
    }
}
