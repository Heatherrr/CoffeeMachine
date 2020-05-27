package com.company;

import java.util.Scanner;

public class Bosh extends MachineParts implements Coffeemachine {

    @Override
    public void setWater(int water) {
        super.setWater(water);
    }

    @Override
    public int getWater(int i) {
        return super.getWater(i);
    }

    @Override
    public void calcWater() {
        int getWater = 2000;
        int getCoffee = 400;
        Scanner scanner = new Scanner(System.in);
        while (getWater >= 0) {
            int input = scanner.nextInt();

            if (input == 1) {
                getWater = getWater;
                System.out.println("Остаток воды: " + getWater);
                getCoffee = getCoffee;
                System.out.println("Остаток кофе: " + getCoffee);
            } else if (input == 2) {
                getWater -= 400;
                System.out.println("Американо готов.\nОстаток воды: " + getWater);
                getCoffee -= 45;
                System.out.println("Остаток в кофе: " + getCoffee);
            } else if (input == 3) {
                getWater -= 500;
                System.out.println("Эспрессо готов.\nОстаток воды: " + getWater);
                getCoffee -= 55;
                System.out.println("Остаток кофе: " + getCoffee);
            } else if (input == 4) {
                getWater -= 600;
                System.out.println("Двойной эспрессо готов.\nОстаток воды: " + getWater);
                getCoffee -= 65;
                System.out.println("Остаток кофе: " + getCoffee);
            } else if (input == 5) {
                getWater = 2000;
                System.out.println("Остаток воды: " + getWater);
            } else if (input == 6) {
                getCoffee = 400;
                System.out.println("Остаток кофе: " + getCoffee);
            } else {
                System.out.println("Вы ввели недействительное значение!");
            }

            if(getWater <= 0) {
                System.out.println("Заполните бак с водой!");
                //break;
            }

            if(getCoffee <= 0) {
                System.out.println("Заполните бак с кофе!");
                //break;
            }
        }
    }

    @Override
    public void setCoffee(int coffee) {
        super.setCoffee(coffee);
    }

    @Override
    public int getCoffee() {
        return super.getCoffee();
    }

    @Override
    public void calcCoffee() {

    }

    @Override
    public void mInfo() {
        System.out.println("Информация о кофемашине Bosch:\nСтрана производитель: Германия.\nОбъем бака воды: 2000 мл.\nОбъем бака кофе: 400 мл.");
    }
}
