package day4;

public class SwitchDemo2 {
    public static void main(String[] args)


    {
        char ch = 'C';
        switch (ch) {
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
        }
    }
}
//switch仅仅只支持int类型，byte short char 会自动提升为int类型