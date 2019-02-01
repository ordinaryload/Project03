package study;

import java.util.ArrayList;

/*
* 1.IDEA中代码模块所处的位置：setings：editor-live Temlates/Postfix Completion
    2.常用的模板
* */
public class TemplatesTest {

    //模板六：prsf:可生成private static final
    private static final Customer CUST = new Customer();

    //变形：psf
    public static final int NUM = 1;
    // 变形：psfi
    public static final int num2 = 2;
    //变形：psfs
    public static final String nation = "china";

    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");//打印形参
        System.out.println("TemplatesTest.main");//方法
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);
        
        //模板三：fori
        String[] arr = new String[]{"Tom","lilei","lihua"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);

        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr:倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public void method(){
        System.out.println("TemplatesTest.method");

        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);

        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }

    }
}
