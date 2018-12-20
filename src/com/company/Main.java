package com.company;

public class Main {

    public static void main(String[] args) {
	    int[][] arr = {
		    {10,15,13,8},
		    {12,6,9,7},
		    {17,11,16,14}
	    };
	    
	    Position a = Successors.findPosition(7,arr);
	    System.out.println("Row of 7: " + a.row);
	    System.out.println("Column of 7: " + a.col);
    }
}
