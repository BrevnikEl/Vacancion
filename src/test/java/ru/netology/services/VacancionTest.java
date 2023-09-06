package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VacancionTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacancion.csv")
    public void testCashVacancion(int expected, int income, int expenses, int threshold) {
        Vacancion service = new Vacancion();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}