package p0220.Stream.daily;
import java.util.Scanner;

public class AscendingSort {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;

        // 두 배열을 오름차순으로 합치기
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        // 남은 요소들 처리
        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        AscendingSort ascendingSort = new AscendingSort();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array1 = new int[number];

        for (int i = 0; i < number; i++) {
            array1[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] mergedArray = ascendingSort.solution(array1, array2);

        for (int x : mergedArray) {
            System.out.print(x + " ");
        }
    }
}
