import java.util.Arrays;

public class Task_4 {
    //Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные
    // элементы единицами;
    public static void main (String[] args) {
        int[][] array = new int[10][10];
        for(int i = 0; i < array.length; i++) {
            int lastIndex = array.length-1;
            array[i][i] = array[i][lastIndex-i] = 1;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
