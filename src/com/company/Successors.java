package com.company;

public class Successors {

    public static Position findPosition(int[][] arr, int num)
    {
        for( int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] == num)
                {
                    return new Position(i,j);
                }
            }
        }
        return null;
    }
    
    public static Position[][] getSuccessorArray(int[][] arr)
    {
        Position[][] intArr = new Position[arr.length][arr[0].length];
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                intArr[i][j] = findPosition(arr,arr[i][j]+1);
            }
        }
        return intArr;
    }
}
