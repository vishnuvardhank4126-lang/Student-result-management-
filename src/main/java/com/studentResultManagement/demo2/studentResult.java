package com.studentResultManagement.demo2;

public class studentResult {

    // Method 1: Calculate total marks
    public int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    // Method 2: Calculate average marks
    public double calculateAverage(int m1, int m2, int m3) {
        return calculateTotal(m1, m2, m3) / 3.0;
    }

    // Method 3: Calculate grade
    public String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}