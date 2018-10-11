package ye.guo.huang;

import java.util.Date;

/**
 */

public class Test03 {

    interface Mesage<T,U>{
        T transForm(U u) ;
    }

    public static void main(String[] args) {
        Mesage mesage1 = a -> {
            return String.valueOf(a);
        } ;
        System.out.println(mesage1.transForm(001));
        //静态方法的引用
        Mesage mesage2 = String :: valueOf;
        System.out.println(mesage2.transForm(002));

        Mesage<String ,String> mesage3 = String::toUpperCase;// 引用的是String普通方法:public String toUpperCase(String str);
        System.out.println(mesage3.transForm("aaaaba"));

    }

}
