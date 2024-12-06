package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VacationCalculatorTest {
    @Test
    public void testCaseTheFirst() {
        VacationCalculator service = new VacationCalculator();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;

        assertEquals(expected, actual);
    }
        @Test
    public void testCaseTheSecond() {
        VacationCalculator service = new VacationCalculator();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;

        assertEquals(expected, actual);
    }
}