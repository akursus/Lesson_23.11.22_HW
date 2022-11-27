public class Main {
    public static void main(String[] args) {
        //Task 1.1
        System.out.println("Задание 1.1");
        int contribution = 15_000;
        int accumulation = 0;
        int i = 0;
        while (accumulation<= 2_459_000) {
            i += 1;
            accumulation += contribution;
            accumulation += accumulation/100;
            System.out.println("Месяц " +i +" сумма накоплений равна " +accumulation +" рублей");
        }

        //Task 1.2
        System.out.println("Задание 1.2");
        int j = 0;
        while (j < 10) {
            j += 1;
            System.out.print(j + " ");
        }
        System.out.println();
        for (int k = 10; k >= 1; k--) {
            System.out.print(k + " ");
        }
        System.out.println();

    }
}