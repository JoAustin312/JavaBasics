package com.sparta.ja;

//Written by Josh
public class App 
{
    public static void main( String[] args ) {
        int timeOfDay = 21;
        String welcomeMessage = greeting(timeOfDay);
        System.out.println(welcomeMessage);
    }

    public static String greeting(int timeOfDay) {
        String message = "";
        if (timeOfDay >= 1 && timeOfDay < 12 ){
            message = "Good Morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            message = "Good Afternoon!";
        } else if (timeOfDay > 18 && timeOfDay <= 24){
            message = "Good Evening!";
        } else {
            message = "Not a valid time of day";
        }
        return message;
    }
}
