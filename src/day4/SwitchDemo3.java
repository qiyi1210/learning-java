package day4;

import java.net.SocketPermission;
/*
switch语句选择的基本数据类型自由四中。short byte int char 没有long
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        int a =8;
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("你怕是个傻子吧");

        }
    }
}