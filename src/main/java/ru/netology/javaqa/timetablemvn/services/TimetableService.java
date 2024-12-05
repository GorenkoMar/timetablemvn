package ru.netology.javaqa.timetablemvn.services;

public class TimetableService {

  public int calc(int income, int expenses, int threshold) {

    int money = 0;
    int count = 0;
    for (int month = 0; month < 12; month++) {
      if (money >= threshold) {
        count++;
        money = (money - expenses) / 3;
      } else {
        money = (money - expenses) + income;
      }
    }
    return count;
  }
}

