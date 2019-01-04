package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name, address, color;
    private int age, weight;

    public void initialize(String name) {
        this.name = name;
        this.age = 5;
        this.color = "some";
        this.weight = 4;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.color = "some";
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "some";
        this.weight = 4;
    }

    public void initialize(int weight, String color) {
        this.age = 5;
        this.color = color;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 5;
        this.color = color;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
