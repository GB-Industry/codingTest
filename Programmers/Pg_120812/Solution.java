package Pg_120812; //최빈값 구하기
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,3,4};
        int[] arr2 = {1,1,2,2};
        int[] arr3 = {923};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));

    }
    public static int solution(int[] array) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : array) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int answer = 0;
        boolean isDuplicate = false;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                answer = num;
                isDuplicate = false;
            } else if (count == maxCount) {
                isDuplicate = true;
            }
        }
        return isDuplicate ? -1 : answer;
    }
}
