package com.company;

public class Dog extends Animal implements Run,Speak{


    @Override
    public void Speak () {System.out.println("Scoo-bi-doo-bi-doo");}
    public boolean Run() {return true;}

}
