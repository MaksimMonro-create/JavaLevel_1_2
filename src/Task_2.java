import java.util.Arrays;

public class Task_2 {
    // Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void main (String[] args) {
        int[] array = new int[8];
        for(int i =0; i<array.length; i++){
            array[i] = i * 3;
        }
        System.out.println(Arrays.toString(array));
    }

}
