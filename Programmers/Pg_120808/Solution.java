package Pg_120808;

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.print(solution(7,8,9,10)[i] + " ");
        }
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int denom3 = denom1 * denom2;
        int numer3 = numer1 * denom2 + numer2 * denom1;

        int max = 1;

        for (int i = 1; i <= denom3 && i <= numer3; i++) {
            if (numer3 % i == 0 && denom3 % i == 0){
                max = i;
            }
        }

        answer[0] = numer3 / max;
        answer[1] = denom3 / max;

        return answer;
    }
}
