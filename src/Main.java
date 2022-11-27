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

        //Task 1.3
        System.out.println("Задание 1.3");
        int year = 0;
        int birthRateOn1000= 17;
        int mortalityPer1000 = 8;
        int population = 12_000_000;
        while (year <10) {
            year += 1;
            population = population + population/1000*birthRateOn1000 + population/1000*mortalityPer1000;
            System.out.println("Год " +year +", численность населения составляет " +population);
        }

        //Task 2.1
        System.out.println("Задание 2.1");
        int savingVasilya = 15_000;
        int savingYear = 1;
        while (savingVasilya < 12_000_000) {
            savingYear +=1;
            savingVasilya += savingVasilya*0.07;
            System.out.println("Месяц " +savingYear +" сумма накоплений равна " +savingVasilya +" рублей");
        }



    }
}