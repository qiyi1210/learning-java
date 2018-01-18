package day4;

//需求，如果今天是星期一则输出星期一，如果是星期二就输出星期二，以此类推
public class SwitchDemo {
    /**
     * switchi(整型表达式）
     * {
     * case 值1：执行的语句;break;
     * case 值2：执行的语句;break;
     * …
     * default:上述的值都不是表达式的结果
     * }
     */
    public static void main(String[] args) {
        int weekday = 5;
        switch (weekday) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你怕是个傻子吧");
        }

    }


}
