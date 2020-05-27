package com.company;

public interface Coffeemachine {
    String menu =
            "1. Показать текущий объем воды и кофе \n" +
            "2. Приготовить “Американо” \n" +
            "3. Приготовить “Эспрессо” \n" +
            "4. Приготовить “Двойной эспрессо” \n" +
            "5. Заполнить бак с водой \n" +
            "6. Заполнить бак с кофе \n" +
            "7. Информация \n" +
            "8. Выключить кофемашину";

    void calcWater();

    void calcCoffee();

    void mInfo ();
}
