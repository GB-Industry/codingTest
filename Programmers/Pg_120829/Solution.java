package Pg_120829;//각도기

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(90));
        System.out.println(solution(120));
        System.out.println(solution(180));
    }
    public static int solution(int angle) {
        if (angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle < 180) {
            return 3;
        } else if (angle == 180) {
            return 4;
        }
        return 0;
    }
}
