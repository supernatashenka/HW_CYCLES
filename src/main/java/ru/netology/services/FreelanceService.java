package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expense, int threshold) {
        int money = 0;
        int counter = 0;
        for (int month = 1; month <=12; month++) {
            if (money >= threshold) {
                money = (money - expense)/3;
                counter++;
            } else {
                money = money + income - expense;
            }
        }
        return counter;
    }
}
