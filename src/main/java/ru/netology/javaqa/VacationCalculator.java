package ru.netology.services;

public class VacationCalculator {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // Счетчик месяцев отдыха
        int money = 0; // Количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money -= expenses; // Тратим на расходы
                money /= 3; // Тратим на отдых
                count++; // Увеличиваем счетчик месяцев отдыха
            } else {
                money += income; // Зарабатываем деньги
                money -= expenses; // Тратим на повседневные нужды
            }
        }
        return count; // Возвращаем количество месяцев отдыха
    }
}