public class Main {
    public static void main(String[] args) {
        //Task 1.1
        System.out.println("Задание 1.1");
        int contribution = 15_000;
        int accumulation = 0;
        int i = 0;
        while (accumulation <= 2_459_000) {
            i += 1;
            accumulation += contribution;
            accumulation += accumulation / 100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation + " рублей");
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
        int birthRateOn1000 = 17;
        int mortalityPer1000 = 8;
        int population = 12_000_000;
        while (year < 10) {
            year += 1;
            population = population + population / 1000 * birthRateOn1000 + population / 1000 * mortalityPer1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        //Task 2.1, 2.2
        System.out.println("Задание 2.1, 2.2");
        int savingVasilya = 15_000;
        int savingMonth = 1;
        while (savingVasilya < 12_000_000) {
            savingMonth += 1;
            savingVasilya += savingVasilya * 0.07;
            if (savingMonth % 6 == 0) {
                System.out.println("Месяц " + savingMonth + " сумма накоплений равна " + savingVasilya + " рублей");
            }
        }

        //Task 2.3
        System.out.println("Задание 2.3");
        int savingVasilya2 = 15_000;
        int savingMonth2 = 1;
        while (savingVasilya2 < 25_000_000) {
            savingMonth2 += 1;
            savingVasilya2 += savingVasilya2 * 0.07;
            if (savingMonth2 % 6 == 0 && savingMonth2 <= 108) {
                System.out.println("Месяц " + savingMonth2 + " сумма накоплений равна " + savingVasilya2 + " рублей");
            }
        }

        //Task 2.4
        System.out.println("Задание 2.4");
        int firstFriday = 3;
        for (int dayInMonth = firstFriday; dayInMonth <= 31; dayInMonth += 7) {
            System.out.println("Сегодня пятница, " + dayInMonth + "-е число. Необходимо подготовить отчет.");
        }

        //Task 3.1
        System.out.println("Задание 3.1");
        int thisYear = 2022;
        int beforThisYear = thisYear - 200;
        int afterThisYear = thisYear + 100;
        for (j = 0; j <=afterThisYear; j += 79) {
            if (j >= beforThisYear) {
                System.out.println(j);
        }
            }

        //Task 3.2
        System.out.println("Задание 3.2");
        int two = 2;
        for (int k = 1; k <= 10; k++) {
            if (two*k <=20) {
                System.out.println(two+"*"+k+"="+two*k);
            }
        }
    }
    }