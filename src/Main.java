import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hello world!");
    // Задача 1.
        System.out.println();
        System.out.println("Задача 1.");
        int dog = 8;
        short cat = 1;
        long apple = 35;
        byte item = 38;
        char ascii = 38;
        double weight = 70.5;
        boolean dogIsGreat = dog > 11;
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(apple);
        System.out.println(item);
        System.out.println(ascii);
        System.out.println(dogIsGreat);
        System.out.println(weight);


        // Задача 2.
        System.out.println();
        System.out.println("Задача 2.");
        double boxer1 = 78.2;
        double boxer2 = 82.7;

        double boxersAllWeights = boxer1 + boxer2;
        double boxerDiff = boxer2 - boxer1;
        System.out.println("общий вес двух бойцов: " + boxersAllWeights + "кг.");
        System.out.println("разниц между весами бойцов: " + boxerDiff + "кг.");

        // Задача 3.
        System.out.println();
        System.out.println("Задача 3");
        int bananasWeight = 80;
        int milkWeight = 105;
        int iceWeight = 100;
        int eggs = 70;
        int totalWeightGram = bananasWeight * 5 + milkWeight * 2 + eggs * 4 + iceWeight * 2;
        int totalWeightKg = totalWeightGram / 1000;
        System.out.println("вес (количество грамм) такого спорт-завтрака: " + totalWeightGram + "г.");
        System.out.println("вес (количество кг) такого спорт-завтрака: " + totalWeightKg + "кг.");

        // Задача 4.
        System.out.println();
        System.out.println("Задача 4.");
        int throwOffWeight1 = 250;
        int throwOffWeight2 = 500;

        int dayThrowOffWeight1 = 7 * 1000 / throwOffWeight1;
        int dayThrowOffWeight2 = 7 * 1000 / throwOffWeight2;

        System.out.println("сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм : " + dayThrowOffWeight1 + "дней .");
        System.out.println("сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм : " + dayThrowOffWeight2 + "дней .");

        int avgDaysThrowOffWeight = (dayThrowOffWeight1 + dayThrowOffWeight2) / 2;
        System.out.println("в среднем потребуется : " + avgDaysThrowOffWeight + "дней.");

        // Задача 5.
        System.out.println();
        System.out.println("Задача 5.");

    int salaryMasha =  67760;
    int salaryDenis = 83690;
    int salaryCristina = 76230;

        double raisingSalaryMasha =  salaryMasha * 0.1;
        double raisingSalaryDenis = salaryDenis * 0.1;
        double raisingSalaryCristina = salaryCristina * 0.1;

        double incomeSalaryMasha =  salaryMasha + raisingSalaryMasha;
        double incomeSalaryDenis = salaryDenis + raisingSalaryDenis;
        double incomeSalaryCristina = salaryCristina + raisingSalaryCristina;

        double incomeYearMasha = (incomeSalaryMasha - salaryMasha) * 12;
        double incomeYearDenis = (incomeSalaryDenis - salaryDenis) * 12;
        double incomeYearCristina = (incomeSalaryCristina - salaryCristina) * 12;

        System.out.println("Маша теперь получает " + incomeSalaryMasha + " рублей.  Годовой доход вырос на " + incomeYearMasha + " рублей");
        System.out.println("Денис теперь получает " + incomeSalaryDenis + " рублей.  Годовой доход вырос на " + incomeYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + incomeSalaryCristina + " рублей.  Годовой доход вырос на " + incomeYearCristina + " рублей");
    }
}