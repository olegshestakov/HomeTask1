package org.sourceit;

public class HomeTask1 {
    public static void main(String[] args) {
        System.out.println(isEven(1));
    }
    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number) {
        if(number>0) {
            boolean b = (number % 2 == 0 ? true : false);
            return b;
        }else{
            return false;
        }
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
        if((a>0)&&(b>0)){
            double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
            return c;
        }else{
            return 0;
        }
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
        if(a>0&b>0&c>0){
            double p= a+b+c;
            return p;
        }else{
            return 0;
        }
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
        if(min<max){
            int y=max-min;
            int g=min+((int)(Math.random()*(y+1)));
            return g;
        }else if(min>max){
            int y=min-max;
            int g=max+((int)(Math.random()*(y+1)));
            return g;
        }else{
            return min;
        }
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
        number=(number<0? number*-1:number);
        int sum=0;
        while (number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
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
        for(int i=3;i<=till;i++){
            f=0;
            f=a1+a2;
            a1=a2;
            a2=f;
        }
        if((till<3)&(till>0)){
            f=a1;
        }else if(till<0){
            f=0000;
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
        if(left==right){
            return true;
        }else{
            return false;
        }
    }
}