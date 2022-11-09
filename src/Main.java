public class Main {
    public static void main(String[] args) {



        //exercise1
        //task1
        var dog = 8.0;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);

         //task2
        dog = dog+4;
        System.out.println (dog);
        cat = cat+4;
        System.out.println (cat);
        paper = paper+4;
        System.out.println (paper);

        //task3
        dog = dog-3.5;
        System.out.println (dog);
        cat = cat-1.6;
        System.out.println (cat);
        paper = paper-7639;
        System.out.println (paper);




        //exercise2
        //task4
        var friend = 19;
        System.out.println (friend);
        friend = friend+2;
        System.out.println (friend);
        friend = friend/7;
        System.out.println (friend);

        //task5
        var frog = 3.5;
        System.out.println (frog);
        frog = frog*10;
        System.out.println (frog);
        frog = frog/3.5;
        System.out.println (frog);
        frog = frog+4;
        System.out.println (frog);


        //exercise3
        //task6
        var theWeightABoxerOne = 78.2;
        var theWeightABoxerTwo = 82.7;
        var theTotalWeightOfBoxers = theWeightABoxerOne+theWeightABoxerTwo;
        System.out.println ("Общий вес двух боксеров " + theTotalWeightOfBoxers + " кг! ");
        var theBoxersWeightDifference = theWeightABoxerOne -  theWeightABoxerTwo;
        System.out.println (" Разница между весом боксеров " + theBoxersWeightDifference + " кг! ");

        //task7
        var boxersWeightDifference  = theWeightABoxerTwo- theWeightABoxerOne;
        System.out.println ("Вес второго боксера больше на " + boxersWeightDifference + " кг! ");
        var overload = theWeightABoxerTwo % theWeightABoxerOne ;
        System.out.println(" Разница в весе боксеров " + overload + "кг!");

        //task8
        var totalHours = 640;
        System.out.println (totalHours);
        var hoursPerWorker = 8;
        System.out.println (hoursPerWorker);
        var amountOfWorkers = totalHours/hoursPerWorker;
        System.out.println ( "Всего работников в компании " + amountOfWorkers );
        var moreWorker = 94;
        System.out.println(moreWorker);
        var increasedNumberOfWorkers = amountOfWorkers + moreWorker;
        System.out.println(increasedNumberOfWorkers);
        var newPerWorker = totalHours/increasedNumberOfWorkers;
        System.out.println( " Если в компании работает " + increasedNumberOfWorkers + " человека, то всего " + newPerWorker + " часа работы может быть поделено между сотрудниками " );



































    }
}