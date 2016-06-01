package org.sourceit;

public class HomeTask1 {
    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Метод возвращает значение гипотенузы.
     * Числа должны быть больше 0. Если какое-либо значение
     * меньше 0, возращать 0.
     *
     * @param a должно быть больше 0.
     * @param b должно быть больше 0.
     * @return значение гипотенузы.
     */
    public static double findHypotenuse(double a, double b) {
        if(a < 0 || b < 0) {
            return 0d;
        }
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

    /**
     * Метод находит периметр треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return периметр треугольника.
     */
    public static double perimeter(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            return 0;
        }

        return a+b+c;
    }

    /**
     * Метод находит площадь треугольника.
     * Значения должны быть больше 0.
     *
     * @param a
     * @param b
     * @return площадь треугольника.
     */
    public static double area(double a, double b) {
        if(a>0&&b>0){
            double s=(a*b)/2;
            return s;
        }else{
            return 0;
        }
    }

    /**
     * Генерирует случайное число в заданных пределах.
     *
     * @param min минимальное значение.
     * @param max саксимальное значение.
     * @return сгенерированное число.
     */
    public static int generateNumberFromRange(int min, int max) {
            int y=max-min;
            return min+((int)(Math.random()*(y+1)));
    }

    /**
     * Считает сумму цифр числа.
     * Число может быть любое,
     * как и положительное так и отрицательное.
     *
     * @param number
     * @return сумма цифр.
     */
    public static long calculateSum(long number) {
        int y=0;
        if(number<0){
            y=1;
            number=number*-1;
        }else{
            y=0;
        }
        int sum=0;
        while (number>0){
            sum+=number%10;
            number/=10;
        }
        if(y==0){
            return sum;
        }else{
            return sum;
        }

    }

    /**
     * Посчитайте элемент последовательности Фибоначчи.
     * Первый и второй члены последовательности равны единицам,
     * а каждый следующий сумме двух предыдущих.
     *
     * @param till до какого элемента считать.
     * @return элемент последовательности.
     */
    public static int fibonacci(int till) {
        int a1=1;
        int a2=1;
        int f=0;
        for(int i=2;i<=till;i++){
            f=0;
            f=a1+a2;
            a1=a2;
            a2=f;
        }
        if(till<2){
            f=a1;
        }else if(till<0){
            f=1;
        }

        return f;
    }
    /**
     * "Счастливым" считается билетик у которого
     * сумма первых трёх цифр номера равна сумме последних
     * трёх цифр, как, например, в билетах с номерами 003102 или 567576.
     *
     * @param ticket должен быть от 1 до 999999
     * @return является ли билет счастливым.
     */
    public static boolean isHappy(long ticket) {
        int left=0;
        int right=0;
        for(int i=1;i<=6;i++){
            if (i<4){
                right+= ticket%10;
                ticket/=10;
            }
            if (i>=4){
                left+= ticket%10;
                ticket/=10;
            }
        }
        return left==right;
    }
}