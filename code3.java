package swapnil1;
class akshay3{
    String regex="^(?:9|8|7)[0-9]{9}+$";
    String name;

    public void set(String str){
        if (str.matches(regex)){
            System.out.println("correct numbers is set");
            this.name=str;
        }else {
            System.out.println("wrong number is given");
        }
    }
}

public class code3 {
    public static void main(String[] args) {
        akshay3 abc= new akshay3();
        abc.set("9564567890");
    }
}
