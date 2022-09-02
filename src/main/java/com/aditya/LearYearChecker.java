/*
 * Author Name: Aditya Chaurasia
 * Date: 02-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

public class LearYearChecker {
    public static void main(String[] args) {

        // Create an object of the class
        LearYearChecker learYearChecker = new LearYearChecker();
        learYearChecker.isLeapYear(2012);

        // print the result
        System.out.println(learYearChecker.isLeapYear(2012));

    }
        /*
         * This method checks if the given year is a leap year.
         *
         * @param year the year to check for leap year.
         * @return true if the year is a leap year, false otherwise.
         */
        public boolean isLeapYear(int year) {
            return year % 4 == 0;
        }
}
