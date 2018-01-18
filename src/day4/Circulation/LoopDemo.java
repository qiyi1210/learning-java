//死循环与三大循环对比。
package day4.Circulation;

import java.net.SocketPermission;

public class LoopDemo {
    public static void main(String[] args) {
     /*   for(System.out.println("初始化");true;System.out.println("循环后")){
            System.out.println("啊啊啊");
     */
        //打印1~5
        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        } /*j的作用域到此为止*/
        //for循环性能更高，变量定义在for循环里面，当跳出循环时，就会释放该变量的储存空间
        System.out.println("-------------------------------------------------");
        int j = 1; //此j的作用与在整个类
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
    }
}
