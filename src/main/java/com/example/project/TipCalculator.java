package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        double tip;
        double totalBill;
        double personCostWithoutTip;
        double tipPerPerson;
        double totalCostPerPerson;
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        tip = Math.round(((percent / 100.0) * cost) * 100.0) / 100.0; // I learned how to round here https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        result.append("Total tip: $" + tip + "\n");
        totalBill = Math.round((tip + cost) * 100.0) / 100.0;
        result.append("Total Bill with tip: $" + totalBill + "\n");
        personCostWithoutTip = Math.round((cost / people) * 100.0) / 100.0;
        result.append("Per person cost before tip: $" + personCostWithoutTip + "\n");
        tipPerPerson = Math.round((tip / people) * 100.0) / 100.0;
        result.append("Tip per person: $" + tipPerPerson + "\n");
        totalCostPerPerson = Math.round(((cost * ((percent / 100.0) + 1)) / people) * 100.0) / 100.0;
        result.append("Total cost per person: $" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
