package day4.Circulation;

public class TableDemo {
    public static void main(String[] args) {
        int line;
        int i;
        for( line = 1;line<=9;line++){
            for (i = 1; i <= line; i++) {
                System.out.print(i + "*" + line + "=" + (i * line) + "\t");
            }
            System.out.println();
        }
    }
}
