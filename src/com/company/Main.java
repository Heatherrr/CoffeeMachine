package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println ("Введите значение 1 или 2, пожалуйста!\n" +
				"1 - кофемашина Samsung\n" +
				"2 - кофемашина Bosch");
		int coffeemachinetype = 0;
		while (coffeemachinetype !=3 ) {
			Scanner sc = new Scanner(System.in);
			coffeemachinetype = sc.nextInt();
			switch (coffeemachinetype) {
				case 1:
					System.out.println("Samsung menu: \n" + Coffeemachine.menu);
					break;
				case 2:
					System.out.println("Bosch menu: \n" + Coffeemachine.menu);
					break;
				default:
					System.out.println("Choose coffeemachine 1 or 2, please!");
					System.exit(0);
			}
			break;
		}


		int menu = 0;
		while (menu !=9 ) {
			Scanner sc = new Scanner(System.in);
			menu = sc.nextInt();
			Coffeemachine m;
			if (coffeemachinetype == 1) {
				m = new Samsung();
			} else {
				m = new Bosh();
			}

			switch (menu) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					m.calcWater();
					//m.calcCoffee();
					break;
				case 7:
					m.mInfo();
					break;
				case 8:
					System.exit(0);
				default:
					System.out.println ("Вы ввели недействительное значение!");

			}
		}
	}
}