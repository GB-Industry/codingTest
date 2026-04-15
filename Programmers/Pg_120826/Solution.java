package Pg_120826;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("elephant","ant"));
    }
    public static String solution(String my_string, String letter) {
        String answer;
        answer = my_string.replace(letter,"");
        return answer;
    }
}
