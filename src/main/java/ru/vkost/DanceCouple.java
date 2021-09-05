package ru.vkost;

public class DanceCouple {
    String firstPerson; //имя партнера
    String secondPerson; //имя партнерши
    String category; //категория пары

    public DanceCouple(String firstPerson, String secondPerson, String category) {
        this.firstPerson = firstPerson;
        this.secondPerson = secondPerson;
        this.category = category;
    }

    public void changeCategoryOfCouple (DanceCouple couple, String newCategory){
        couple.category=newCategory;
    }
}




