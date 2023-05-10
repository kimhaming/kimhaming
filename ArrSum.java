import java.util.Arrays;

public class ArrSum {
    public static void main(String[] args) {
        int output = arrSum(new int[]{-1, -2, 1, 3});
        System.out.println(output); // --> 1
    }
    public static int arrSum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        // 쪼갤 수 있는 단위로 쪼개기
        int head = arr[0];  // 배열의 첫번째 요소 따로 꺼내주기
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        // 배열을 복사해와서 배열의 두번째 요소부터 배열의 마지막 요소까지로 새로운 배열 tail 생성

        return head + arrSum(tail); // 배열의 모든 요소의 합을 구해주는 arrSum 메소드에 새로운 배열 tail 입력하기
    }
}
