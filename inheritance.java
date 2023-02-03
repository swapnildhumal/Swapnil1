package swapnil1;
class ak{
    public int a(int a, int b){
        System.out.println("india");
        return a+b;

    }
}
class ak1 extends ak{
    public void set(){
        System.out.println("moolya");
    }
}
class ak2 extends ak1{
    public void add(){
        System.out.println("book");
    }
}

public class inheritance {
    public static void main(String[] args) {
        ak1 abc= new ak1();
        abc.a(2,3);         //if we comment the line no. 18 then india will print 1 time
        System.out.println(abc.a(2,3));
        abc.set();
        ak2 def=new ak2();
        def.a(2,3);


    }
}
