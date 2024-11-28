package ru.netology.javaqa.timetablemvn.services;

public class TimetableService {

  public int calc(int income, int expenses, int threshold) {

    int money = +income;
    int count = 0;
    for (int month = 0; month < 12; month++) {
      if (money >= threshold) {
        count++;
        int expensesHoliday = money - (((money - expenses) / 300) * 100); // расходы на отдых
        money = money - (expensesHoliday + expenses);
      } else {
        money = (money - expenses) + income;
      }
    }
    return count;
  }
}

