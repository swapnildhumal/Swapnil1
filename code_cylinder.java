package swapnil1;
class akshay1{
    int radius;
    int height;
    double volume;
    public void set(int r, int h){
        this.radius=r;
        this.height=h;
    }
    public double get(){
        volume=3.14*radius*radius*height;
        return volume;

    }
}

public class code_cylinder {
    public static void main(String[] args) {
        akshay1 re = new akshay1();
        re.set(5, 6);
        System.out.println(re.get());
    }
}


