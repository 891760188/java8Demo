package ye.guo.huang;

import java.util.Date;

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
    interface GreetingService {
        void sayMessage(String message);
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

        System.out.println("---------------1");
        mathOperation31.operation(100);

        /**
         * 不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误
         */
        final  String value = "我是value";
        GreetingService greetingService = msg -> {
//            value = "我是value2";
            System.err.println(msg + value + "==" + new Date());
        };
        System.out.println("---------------2");
        greetingService.sayMessage("我是msg");
    }
}
