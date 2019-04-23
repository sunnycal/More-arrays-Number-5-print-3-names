package com.company;


public class ex6 {

    public static void main(String[] args) {
//declare array to hold below values
        int[] scores = new int[9];
        {
//populate array

            scores[0] = 2;
            scores[1] = 5;
            int[] scores2 = {2, 5, 9, 0, 2,1, 8, 5, 4};

            /* loop the array */
            for (int i = 0; i <= scores2.length; i++) {
            if (scores2[i] == 5)
                System.out.println(i);

                System.out.println("The number at index position " + i + " is " + scores2[i]);
            }

            }
    }
}