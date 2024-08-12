import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 1, 0, 0, 4};
        System.out.println("Задание 1.");
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Результат: " + findResult(arr));

        System.out.println("Задание 2");
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Результат: " + findSub(arr));

        System.out.println("Задание 3");
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Результат: " + findNullElements(arr));




    }

    public static int findResult(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                count = count + 1;
            }

        }
        return count;
    }

    public static int findSub(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max - min;
    }

    public static boolean findNullElements(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i+1] == 0){
                return true;
            }
        }
        return false;
    }
}