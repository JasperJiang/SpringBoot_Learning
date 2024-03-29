package com.example.demo.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Java7 calculate
 */
@Profile("Java7")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java7 calculate");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        CalculateService calculateService = new Java7CalculateService();

        System.out.println(calculateService.sum(1, 2, 3, 4, 5));
    }
}
