/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.practice8;
import java.util.Scanner;
/*A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 
10 servings in the bag and that a serving equals 300 calories. This program lets the 
user enter the number of cookies he or she actually ate and then reports the number of total 
calories consumed*/
public class PRACTICE8 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOfCookiesConsumed;
        int numberOfServings = 10;
        int totalNumberOfCookies = 40;
        double caloriesPerServing = 300;
        int numberOfCookiesPerServing = totalNumberOfCookies/numberOfServings;
        double caloriesPerCookie = caloriesPerServing/numberOfCookiesPerServing;
        
        System.out.println("Enter the amount of cookies you consumed: ");
        numberOfCookiesConsumed = keyboard.nextInt();
        
        double caloriesTakenByConsumer = numberOfCookiesConsumed*caloriesPerCookie;
        
        System.out.println("CaloriesConsumed: " + caloriesTakenByConsumer);
        
        
        
    }
}
