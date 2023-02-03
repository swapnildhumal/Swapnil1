package swapnil1;
class akshay6{
    public int small(int ...arr) {
        int s=1;
        for (int a:arr) {   //a=iterator
            s=s*a;
        }
        return s;
    }
}

    public class varchar_for {
        public static void main(String[] args) {
            swapnil1.akshay5 ab = new swapnil1.akshay5();
            int mul = ab.small(1,2,3,4,5);
            System.out.println(mul);
        }
    }


