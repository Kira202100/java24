import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public void ArOperation() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int i=0;
        while (i<array.length) {
            System.out.println("Введите номер:");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int j=1; j< array.length; j++){
            if (array[j]<min) {
                min = array[j];
            }
        }
        System.out.println("наименьший элемент массива:  "+ min);
        int max = array[0];
        for (int j=1; j< array.length; j++){
            if (array[j]>max) {
                max = array[j];
            }
        }
        System.out.println("Max:  "+ max);
    }
}
