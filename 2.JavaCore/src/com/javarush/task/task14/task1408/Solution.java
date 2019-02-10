package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            return hen;
        }
    }
    abstract class Hen{
        abstract int getCountOfEggsPerMonth();
        String getDescription() {
            return "Я - курица";
        }
    }
    class RussianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 0;
        }

        @Override
        String getDescription() {
            return super.getDescription();
        }
    }

    class UkrainianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 0;
        }

        @Override
        String getDescription() {
            return super.getDescription();
        }
    }

    class MoldovanHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 0;
        }

        @Override
        String getDescription() {
            return super.getDescription();
        }
    }

    class BelarusianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 0;
        }

        @Override
        String getDescription() {
            return super.getDescription();
        }
    }

}
