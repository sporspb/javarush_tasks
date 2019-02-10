package com.javarush.task.task14.task1408;


class UkrainianHen extends Hen {
	@Override
	int getCountOfEggsPerMonth() {
		return 39;
	}

	@Override
	String getDescription() {
		return super.getDescription()+" Моя страна - "+ this.UKRAINE+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
	}
}