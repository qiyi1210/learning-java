package day4.Circulation;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
