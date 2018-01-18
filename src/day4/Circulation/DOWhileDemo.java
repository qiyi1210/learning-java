//Do While 循环
package day4.Circulation;

public class DOWhileDemo {
    public static void main(String[] args) {

        boolean b = false;
        while (b) {
            System.out.println("哈哈");//不会执行
        }

        do {
            System.out.println("哈哈");//执行
        }
        while (b);
        //输出10次“美女”
        int a = 0;
        do {
            System.out.println("美女");
            a = a + 1;
        }
        while (a < 10);

        //输出1~10
        int c = 0;
        do {
            c = c + 1;
            System.out.println(c);
        }
        while (c < 10);

        //输出 1 到 10 之和
        int num = 1;
        int time = 0;
        do {
            time = num + time;
            num = num + 1;
        }
        while (num <= 10);
        System.out.println(time);
    }

}
