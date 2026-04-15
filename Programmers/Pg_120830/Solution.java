package Pg_120830; //양꼬치

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(10,3));
        System.out.println(solution(64,6));
    }
    public static int solution(int n, int k) {
        return n * 12000 + k * 2000 - (n/10)*2000;
    }
}
