package Pg_120825; //문자 반복 출력

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("Hello",3));
    }
    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        char[] newAnswer = my_string.toCharArray(); // split

        for (int i = 0; i < my_string.length(); i++) {
            answer.append(String.valueOf(newAnswer[i]).repeat(n));
        }
        return answer.toString();
    }
}
