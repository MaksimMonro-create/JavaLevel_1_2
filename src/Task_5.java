public class Task_5 {
// ** Задать одномерный массив и найти в нем минимальный
// и максимальный элементы (без помощи интернета);
    public static void main (String[] args) {
        int[] array = {4, 3, 9, 7, 1, 2, 43};
        int min = array [0];
        int max = array [0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Минимальное значение =" + min);
        System.out.println("Максимальное значение =" + max);
    }
}
