package ru.vkost;

public class Main {

    public static void main(String[] args) {

        DanceCouple[] listDanceCouples1 = new DanceCouple[3]; //массив пар для первого турнира
        DanceCouple[] listDanceCouples2 = new DanceCouple[4];  //массив пар для второго турнира

        listDanceCouples1[0] = new DanceCouple("Irina Ivanova", "Sergey Petrov", "adult");
        listDanceCouples1[1] = new DanceCouple("Maria Lebedeva", "Ivan Romashkin", "junior");
        listDanceCouples1[2] = new DanceCouple("Valentina Kulikova", "Dmitry Kulikov", "adult");

        listDanceCouples2[0] = new DanceCouple("Sveta", "Sasha", "senior");
        listDanceCouples2[1] = new DanceCouple("Mark", "Ludmila", "junior");
        listDanceCouples2[2] = new DanceCouple("Lusy", "Mike", "adult");
        listDanceCouples2[3] = new DanceCouple("Bob", "Natasha", "kids");

        //поменяли категорию пары
        listDanceCouples1[1].changeCategoryOfCouple(listDanceCouples1[1], "senior");

        //создаем два объекта - соревнование
        DanceCompetition firstComp = new DanceCompetition("Russian Open Championship", "15.05.2022", listDanceCouples1);
        DanceCompetition secondComp = new DanceCompetition("Hello Autumn", "01.09.2021", listDanceCouples2);

        //выводим информацию о первом турнире
        System.out.println("First competition " + firstComp.name + " " + firstComp.date + ":");
        firstComp.printListOfParticipants(listDanceCouples1);

        //выводим информацию о втором турнире
        System.out.println("\nSecond competition " + secondComp.name + " " + secondComp.date + ":");
        firstComp.printListOfParticipants(listDanceCouples2);

        //получаем количество участников
        int countOfParticipantsFirstCompetition = secondComp.getNumberOfParticipants(listDanceCouples1);
        int countOfParticipantsSecondCompetition = secondComp.getNumberOfParticipants(listDanceCouples2);

        //выводим количество участников
        System.out.println("Number Of participants in First Competition " + countOfParticipantsFirstCompetition);
        System.out.println("Number Of participants in Second Competition " + countOfParticipantsSecondCompetition);


    }


}
