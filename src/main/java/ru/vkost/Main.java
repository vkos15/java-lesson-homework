package ru.vkost;

public class Main {

    static DanceCouple [] listDanceCouples1 = new DanceCouple[3];
    static DanceCouple [] listDanceCouples2 = new DanceCouple[4];


    public static void main(String[] args) {
        int countOfParticipants;

        listDanceCouples1[0]=new DanceCouple("Irina Ivanova","Sergey Petrov","adult");
        listDanceCouples1[1]=new DanceCouple("Maria Lebedeva","Ivan Romashkin","junior");
        listDanceCouples1[2]=new DanceCouple("Valentina Kulikova","Dmitry Kulikov","adult");

        listDanceCouples2[0]=new DanceCouple("Sveta","Sasha","senior");
        listDanceCouples2[1]=new DanceCouple("Mark","Ludmila","junior");
        listDanceCouples2[2]=new DanceCouple("Lusy","Mike","adult");
        listDanceCouples2[3]=new DanceCouple("Bob","Natasha","kids");

        listDanceCouples1[1].changeCategoryOfCouple(listDanceCouples1[1],"senior");


        DanceCompetition firstComp = new DanceCompetition("Russian Open Championship","15.05.2022",listDanceCouples1);
        DanceCompetition secondComp = new DanceCompetition("Hello Autumn","01.09.2021",listDanceCouples2);

        System.out.println("First competition " + firstComp.name+":");
        firstComp.printListOfParticipants(listDanceCouples1);

        System.out.println("Second competition " + secondComp.name+":");
        firstComp.printListOfParticipants(listDanceCouples2);

        int countOfParticipantsFirstCompetition= secondComp.getNumberOfParticipants(listDanceCouples1);
        int countOfParticipantsSecondCompetition= secondComp.getNumberOfParticipants(listDanceCouples2);
        System.out.println("Number Of participants in First Competition "+ countOfParticipantsFirstCompetition);
        System.out.println("Number Of participants in Second Competition "+ countOfParticipantsSecondCompetition);


    }







}
