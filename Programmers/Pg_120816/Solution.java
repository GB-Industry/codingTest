package Pg_120816; //피자 나눠 먹기 (3)

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(7,10));
        System.out.println(solution(4,12));

    }
    public static int solution(int slice, int n) {
        int answer;

        if (slice > n){
            answer = 1;
        }else{
            if (n%slice == 0){ //
                answer = n/slice;
            }else{
                answer = n/slice + 1;
            }
        }

        return answer;
    }
}
