package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код

    private String name, address, color;
    private int age, weight;

    public Cat(String name) {
        this.name = name;
        this.age = 5;
        this.color = "some";
        this.weight = 4;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.color = "some";
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "some";
        this.weight = 4;
    }

    public Cat(int weight, String color) {
        this.age = 5;
        this.color = color;
        this.weight = weight;
    }

    public Cat(int weight, String color, String address) {
        this.age = 5;
        this.color = color;
        this.weight = weight;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
