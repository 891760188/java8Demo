package ye.guo.huang;

/**
 * new 出某个接口
 */

public class Test02 {

    interface MathOperation{
        int operation(int a , int b);
    }

    interface MathOperation2{
        String operation(int a);
    }
    interface MathOperation3{
        void operation(int a);
    }

    public static void main(String[] args) {

        MathOperation mathOperation11 = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return 0;
            }
        };
        MathOperation mathOperation12 = (a,b) -> a+b ;
        MathOperation mathOperation13 = (int a, int b) -> a+b ;
        MathOperation mathOperation14 = (int a, int b) -> { return a+b ;} ;

        MathOperation2 mathOperation21 = a -> a + "" ;

        MathOperation3 mathOperation31 = a -> System.out.println(a);

        System.out.println("---------------");
        mathOperation31.operation(100);


    }
}
