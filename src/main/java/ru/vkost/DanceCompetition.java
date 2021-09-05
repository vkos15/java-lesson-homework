package ru.vkost;

import java.util.Date;

public class DanceCompetition {

    String name; //название турнира
    String date; // дата проведения турнира
   DanceCouple [] participants; //список участников

    public DanceCompetition(String name, String date, DanceCouple[] participants) {
        this.name = name;
        this.date = date;
        this.participants = participants;
    }

    //public  void printListOfParticipants(DanceCouple[] list){
    public  void printListOfParticipants(DanceCouple[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].firstPerson+" "+list[i].secondPerson+" "+list[i].category);
        }

    }


    public int getNumberOfParticipants(DanceCouple[] list){
        return list.length;

    }
}
