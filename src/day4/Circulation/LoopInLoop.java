//嵌套循环
package day4.Circulation;

import java.net.SocketPermission;

public class LoopInLoop {
    public static void main(String[] args) {
        int i, j;
        for (j = 1; j <= 4; j++) {
            for (i = 1; i <= 5; i++) {
                System.out.println(i);
            }
            System.out.println("------------");
        }
        /*
        int i = 1;
        while (i <= 4) {
            int j = 1;
            while (j <= 5) {
                System.out.println(j);
                j++;
            }
            i++;
            System.out.println("--------");
        }
        */
    }
}

