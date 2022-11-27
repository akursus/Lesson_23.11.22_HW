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
    }
}