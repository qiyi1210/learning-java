package day4.Circulation;

public class WhileDemo2 {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        while (n<5) {
            n = n + 1;
            m = m + n;
        }
        System.out.println(m);
    }
}
