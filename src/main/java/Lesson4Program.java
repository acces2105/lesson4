public class Lesson4Program {
    public static void main(String[] args) {
        System.out.println("Квадра́тный ко́рень из числа a (корень 2-й степени) — число x, \n" +
                "дающее a при возведении в квадрат: x ⋅ x = a. \n" +
                "Равносильное определение: квадратный корень из числа a — решение уравнения \n" +
                "x2(в квадрате) = a. (x^{2}=a) \n" +
                "Операция вычисления значения квадратного корня из числа a называется \n " + "" +
                "«извлечением квадратного корня» из этого числа.");

        // возведение числа
        double vozvedenie = vozvedenie (5);
        System.out.println("Возведение числа в квадратный корень =" + vozvedenie);

        // извлечение корня
        double izvlechenie = izvlechenie (5, vozvedenie);
        System.out.println("Извлечение корня =" + izvlechenie);
        //Scanner Scanner = new Scanner(System.in);
        //String vozvedenie = scanner.nextDouble();
        //System.out.println("Извлечение корня =" + izvlechenie);
    }

    public static double vozvedenie (double arg1) {
        double result = arg1 * arg1;
        return result;
    }
    public static double izvlechenie (double arg1, double vozvedenie) {
        double result1 = vozvedenie / arg1;
        return result1;
    }
}
