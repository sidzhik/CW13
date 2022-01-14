package com.company;

import com.company.HomeAnimal;

public class Main {

    public static void main(String[] args) {
        Dog Lucky = new Dog();
        Cat Marfa = new Cat();

        HomeAnimal<Dog> nr1 = new HomeAnimal<>(Lucky);
        HomeAnimal<Cat> nr2 = new HomeAnimal<>(Marfa);

        nr1.showType();
        nr1.getObj();
        nr1.Test();

        nr2.showType();
        nr2.getObj();
        nr2.Test();


    }
}
