package com.javarush.task.task14.task1408;


class BelarusianHen extends Hen {
	@Override
	int getCountOfEggsPerMonth() {
		return 12;
	}

	@Override
	String getDescription() {
		return super.getDescription()+" Моя страна - "+ this.BELARUS+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
	}
}