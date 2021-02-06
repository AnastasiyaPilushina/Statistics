package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
//            sum = sum + sale;
            sum += sale;
        }
        return sum;
    }


    public int calculateAverage(int[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthWithMax(int[] sales) {
        int max = max(sales);
        int monthNumber = 0;
        int monthWithMax = 0;
        for (int sale :sales) {
            monthNumber++;
            if (sale == max) {
                monthWithMax = monthNumber;
            }
        }
        return monthWithMax;

            }

    public int monthWithMin(int[] sales) {
        int min = min(sales);
        int monthNumber = 0;
        int monthWithMin = 0;
        for (int sale :sales) {
            monthNumber++;
            if (sale == min) {
                monthWithMin = monthNumber;
            }
        }
        return monthWithMin;

    }


    public int monthCountLessThanAverage(int[] sales) {
        int average = calculateAverage(sales);
        int monthCount = 0;
        for (int sale : sales) {
           if (sale < average) {
               monthCount++;
           }
        }
        return monthCount;
        }

    public int monthCountMoreThanAverage(int[] sales) {
        int average = calculateAverage(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale > average) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int max(int[] sales) {
        int max = sales[0];
        for (int sale : sales){
            if (sale > max) {
                max =sale;
            }
        }
        return max;
    }

    public int min(int[] sales) {
        int min = sales[0];
        for (int sale : sales){
            if (sale < min) {
                min =sale;
            }
        }
        return min ;
    }

    }



