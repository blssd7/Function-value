public class Number {
    public static void main(String[] args) {
        int number = 3;
// Возводимое в степень число

        int result = 1;
// Результат возведения в степень

        int power = 1;
// Начальный показатель степени

        while (power <= 10) {
// условие входа в цикл

            result = result * number;
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
        }
    }
}
