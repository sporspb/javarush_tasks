package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat TomCat = new Cat("Tom", 22,34);
        Dog SharikDog = new Dog("Sharick", 13, 78);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int age, weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }

    public static class Dog {
        String klichka;
        int age, power;

        public Dog(String klichka, int age, int power) {
            this.klichka = klichka;
            this.age = age;
            this.power = power;
        }
    }

    //напишите тут ваш код
}
