package day4;

public class ScoreLevelDemo {
    public static void main(String[] args) {
        int score = 59;
        if (score > 90) {
            System.out.println("111");
        } else if (score > 80) {
            System.out.println("222");
        } else if (score > 70) {
            System.out.println("333");
        } else {
            System.out.println("重在参与");
        }
    }
}