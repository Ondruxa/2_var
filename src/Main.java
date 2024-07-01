public class Main {
    public static void main(String[] args) {
        // task1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog "+dog);
        System.out.println("cat "+cat);
        System.out.println("paper "+paper);
        System.out.println();

        //task2
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println("dog "+dog);
        System.out.println("cat "+cat);
        System.out.println("paper "+paper);
        System.out.println();

        //task3
        var dogTask3 = dog-3.5;    //обьявил новую переменную dogTask3 так как возникает конфликт типа переменной int и double
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println("dog "+dogTask3);
        System.out.println("cat "+cat);
        System.out.println("paper "+paper);
        System.out.println();

        //task4
        var friend = 19;
        System.out.println("friend "+friend);
        friend = friend+2;
        System.out.println("friend "+friend);
        friend = friend/3;
        System.out.println("friend "+friend);
        System.out.println();

        //task5
        var frog = 3.5;
        System.out.println("frog "+frog);
        frog = frog*10;
        System.out.println("frog "+frog);
        frog = frog/3.5;
        System.out.println("frog "+frog);
        frog = frog+4;
        System.out.println("frog "+frog);
        System.out.println();


        //task6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1+weightBoxer2;
        var differenceWeight = weightBoxer2-weightBoxer1;
        System.out.println("Общая масса двух боксеров "+ totalWeight);
        System.out.println("Разница между массами "+ differenceWeight);
        System.out.println();

        //task7
        System.out.println("Остаток от деления масс "+ weightBoxer2 % weightBoxer1);
        System.out.println();



        //task8
        //task8.1
        var totalHours = 640;
        var hoursPerWorker = 8;
        var workers = totalHours/hoursPerWorker;
        System.out.println("Всего работников в компании — " +workers+ " человек");
        //task8.2
        var newWorkers = workers+94;
        var newHoursPerWorker = totalHours/newWorkers;
        System.out.println("Если в компании работает " +newWorkers+ " человек, то всего " +newHoursPerWorker+ " часов работы может быть поделено между сотрудниками");

    }
}