package Pg_120851;//숨어있는 숫자의 덧셈(1)

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
    }
    public static int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-zA-Z]", "").split("");

        for (String s : arr) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}
