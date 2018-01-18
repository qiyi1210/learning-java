package day4.Circulation;

//求100以内，前五个3的倍数
public class BreakDemo {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                j++;
            }

            if(j >= 5){
                break;
            }

        }
    }
}
