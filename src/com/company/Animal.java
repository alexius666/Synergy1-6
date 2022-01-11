package com.company;

public class Animal {
    String animalKind;
    String animalVoice;

    public Animal(String animalKind, String animalVoce) {
        this.animalKind=animalKind;
        this.animalVoice=animalVoce;
    }

public void Voice() {
        System.out.println(this.animalKind+": "+this.animalVoice);
}
}