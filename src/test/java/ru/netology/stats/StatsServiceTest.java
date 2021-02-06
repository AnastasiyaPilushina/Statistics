package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void Sum() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 180;

        int actual = service.sum(sales);

        assertEquals(expected, actual);
    }



    @Test
    void calculateAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 15;

        int actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMax() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 8;

        int actual = service.monthWithMax(sales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnMonthWithMin() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 9;

        int actual = service.monthWithMin(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldReturnMonthWithLessThanAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 5;

        int actual = service.monthCountLessThanAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMoreThanAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expected = 5;

        int actual = service.monthCountMoreThanAverage(sales);

        assertEquals(expected, actual);
    }


}

