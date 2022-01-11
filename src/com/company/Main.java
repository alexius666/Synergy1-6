package com.company;

public class Main {
    public static void main(String[] args) {
        String[] animalArray = new String[]{"Кошка","Мяу","Собака","Гав","Корова","Му",
            "Черепаха","Шшш","Гусь","Га","Утка","Кря","Лев","Ррр"};
        int len=animalArray.length;

    for(int i=0; i<len; i++) {
        Animal someAnimal = new Animal(animalArray[i],animalArray[++i]);
        someAnimal.Voice();
    }
    }
}
