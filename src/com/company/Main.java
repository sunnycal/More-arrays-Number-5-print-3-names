package com.company;

public class Main {

    public static void main(String[] args) {

        //create an array to store 3 names
        String [] names = new String[3];


        //populate array
        names[0] = "Manny";
        names[1] = "Moe";
        names[2] = "Jack";

//loop & print array
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index position" + i + " is " + names[i]);
        }

    }
}
