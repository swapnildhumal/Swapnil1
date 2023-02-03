package swapnil1;
class akshay{
    int radius;
    double area;
    public void set(int r){
        this.radius=r;

    }
    public double get(){
        area=3.14*radius*radius;
        return area;
    }

}

public class code2_area {
    public static void main(String[] args) {
        akshay re=new akshay();
        re.set(69);  //re.radius=69
        System.out.println(re.get());
    }
}
