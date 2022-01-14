package com.company;

public class HomeAnimal <T extends Animal & Run & Speak>{

    T obj;

    HomeAnimal(T obj){
        this.obj = obj;
    }

    T getObj() {
        return obj;
    }


    void showType() {System.out.println("The type of the generic variable T is: " + obj.getClass().getName());}

    void Test(){
        System.out.println("Where is my sausage");
        obj.Run();
        obj.Speak();
    }
}
