package p0220.Stream.daily;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PrintMoreBigNumber {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

        answer.add(array[0]);

        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1]) {
                answer.add(array[i]);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        PrintMoreBigNumber printMoreBigNumber = new PrintMoreBigNumber();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }
    }

}