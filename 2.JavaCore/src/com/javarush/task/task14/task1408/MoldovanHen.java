package com.javarush.task.task14.task1408;


class MoldovanHen extends Hen {
	@Override
	int getCountOfEggsPerMonth() {
		return 45;
	}

	@Override
	String getDescription() {

		return super.getDescription()+" Моя страна - "+ this.MOLDOVA+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
	}
}