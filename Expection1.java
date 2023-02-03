package swapnil1;

public class Expection1 {
    public static void main(String[] args) {
        int [] i= {2,4,5,6};
        try{
            System.out.println(i[4]);
        }
        catch (Exception e){
            System.out.println("code failed due to space"+e);
        }
    }
}
