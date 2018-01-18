package day4.Circulation;

public class IsoscelesTriangleDemo {
    public static void main(String[] args) {
        int m = 1;
        int n = 1;
        for (int k = 1; k <= 5; k++) {
            for (int i = 6; i >= m; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
            m++;
            n = n + 2;
        }
    }
}


