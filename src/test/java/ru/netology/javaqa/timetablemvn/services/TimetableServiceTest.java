package ru.netology.javaqa.timetablemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TimetableServiceTest {

  @Test
  public void testIncome10k() {
    TimetableService service = new TimetableService();
    int income = 10_000;
    int expenses = 3000;
    int threshold = 20_000;
    int expected = 3;
    int actual = service.calc(income, expenses, threshold);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  public void testIncome100k() {
    TimetableService service = new TimetableService();
    int income = 100_000;
    int expenses = 60_000;
    int threshold = 150_000;
    int expected = 2;
    int actual = service.calc(income, expenses, threshold);
    Assertions.assertEquals(expected, actual);
  }
}
