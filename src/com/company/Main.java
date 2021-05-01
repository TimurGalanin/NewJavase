package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final double STEPS_IN_SPAN =10;
	final double STEPS_IN_FLORE =2;

	double floor, liveInStep;
	double result;

        Scanner input = new Scanner(System.in);
        System.out.println("это программа расчтывает секунду доп.секунд жизни ");

        System.out.print("ведите этаж, на который вы хотите взобраться ");
        floor= input.nextDouble();

        System.out.print("Сколько секунд даёт одна ступенка: ");
        liveInStep = input.nextDouble();

        result = liveInStep * STEPS_IN_SPAN * STEPS_IN_FLORE * floor;

        System.out.println("ваша жизнь увеличиться на " + result + "секунд");
    }

}
