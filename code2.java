package swapnil1;
class akshay2{
    String regex="^[a-zA-Z]+$";
    String name;

    public void set(String str){
        if (str.matches(regex)){
            System.out.println("correct name is set");
            this.name=str;
        }else{
            System.out.println("wrong name is given");
        }
    }

}

public class code2 {
    public static void main(String[] args) {
        akshay2 ab= new akshay2();
        ab.set("swapnil");
    }
}
