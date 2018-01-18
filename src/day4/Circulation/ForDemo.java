package day4.Circulation;

import java.net.SocketPermission;

public class ForDemo {
    public static void main(String[] args) {
        /*
            for(初始化语句;boolean表达式;循环之后的操作语句)
            {
                循环体
            }
            执行顺序：
                1）初始化顺序
                2）Boolean表达式；
                    true；进入第三步
                    false：跳过循环
                3）执行循环体
                4）执行循环后的操作语句
                5）进入第2步

         */
        //打印10次帅哥
        for (int count = 1; count <= 5; count++) {
            System.out.println("帅哥" + count);
        }
        //输入1~10
        for (int count1 = 1; count1 <= 10; count1++) {
            System.out.println(count1);
        }
        //输出1~100之和
        int result = 0;
        for (int count2 = 1; count2 <= 100; count2++) {
            result += count2;
        }
        System.out.println(result);
    }

}
