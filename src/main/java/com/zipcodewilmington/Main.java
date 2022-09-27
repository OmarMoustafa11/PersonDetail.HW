package com.zipcodewilmington;

public class Main {
    public static void main(String[] args) {



        Person person1 = new Person ("Omar", "Moustafa");
        Person person2 = new Person ("Mike", "Moustafa");
        Person person3 = new Person ("Amira", "Elzalat");
        Person person4 = new Person ("Kareem", "AbdulJabbar");
        Person person5 = new Person ("Micheal", "Jackson");

        Person[] arrayName = {person1,person2,person3,person4,person5};
        PersonHandler person = new PersonHandler(arrayName);
        System.out.println(person.whileLoop());
        System.out.println(person.forLoop());
        System.out.println(person.forEachLoop());

       // System.out.println(new PersonHandler(arrayName).whileLoop);
    }
}

