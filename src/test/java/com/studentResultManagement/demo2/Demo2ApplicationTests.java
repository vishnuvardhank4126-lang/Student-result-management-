package com.studentResultManagement.demo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Demo2ApplicationTests {

    studentResult result = new studentResult();

    @Test
    void testCalculateTotal() {
        int total = result.calculateTotal(80, 90, 70);
        assertEquals(240, total);
    }

    @Test
    void testCalculateAverage() {
        double average = result.calculateAverage(80, 90, 70);
        assertEquals(80.0, average);
    }

    @Test
    void testCalculateGrade() {
        String grade = result.calculateGrade(80);
        assertEquals("B", grade);
    }
}