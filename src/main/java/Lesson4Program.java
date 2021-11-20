public class Lesson4Program {
    public static void main(String[] args) {
        System.out.println("Условие задания курса: Необходимо вычислить квадратный корень числа, не используя \n" +
                "готовую реализации метода Math.sqrt, а полагаясь на простые арифметические операции");

        // извлечение корня с помощью цикла

        double n = 4;
        for (double i = 1; i < 1000; i++) {
            if (i * i == n)
                System.out.println("Корень числа n = " + (i));
        }


    }

}
