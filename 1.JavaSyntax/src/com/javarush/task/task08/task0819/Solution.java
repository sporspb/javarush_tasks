package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
	    cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
	    Set<Cat> catSet = new HashSet<Cat>();
	    for (int i = 0; i < 3; i++) {
	    	catSet.add(new Cat());

	    }

        return catSet;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
	    cats.forEach(s -> System.out.println(s));
    }

    // step 1 - пункт 1
	public static class Cat{};
}
