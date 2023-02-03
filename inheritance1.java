package swapnil1;
class swa{
    public void add(int a, int b){
        System.out.println(a+b);
    }

}
class swa1 extends swa{
    public void sub(int a, int b){
        System.out.println(a-b);
    }
}
class swa2 extends swa1{
    public void mul(int a, int b){
        System.out.println(a*b);
    }
}
class swa3 extends swa2{
    public void div(int a, int b){
        System.out.println(a/b);
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        swa3 ab=new swa3();
        ab.add(10,5);
        ab.sub(10,5);
        ab.mul(10,5);
        ab.div(10,5);


    }
}
