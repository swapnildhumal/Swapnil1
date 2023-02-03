package swapnil1;
class akshay5{
    public int small(int ...arr){
        int s=1;
        for (int i=0;i<arr.length;i++){
            s=s*arr[i];
        }
        return s;
    }
}

public class varchar_product {
    public static void main(String[] args) {
        akshay5 ab= new akshay5();
        int mul= ab.small(1,2,3,4,5,6,7,8,9,10);
        System.out.println(mul);

    }
}
