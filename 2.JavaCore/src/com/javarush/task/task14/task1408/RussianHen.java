package com.javarush.task.task14.task1408;


class RussianHen extends Hen {
	@Override
	int getCountOfEggsPerMonth() {
		return 84;
	}

	@Override
	String getDescription() {
		return super.getDescription()+" Моя страна - "+ this.RUSSIA+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
	}
}