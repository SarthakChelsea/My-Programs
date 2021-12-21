package com;
import java.util.*;
public class TwoD_Array {
    public static void main(String args[]){
        int marks[][]= new int[3][4];
        //int[][] numbers=new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                marks[i][j]=sc.nextInt();
            }

           }
        int x=6;

         for(int i=0;i< marks.length;i++){
                    for(int j=0;j<4;j++){
                        if(x==marks[i][j]) {
                            System.out.print(" Index Position = " + "row:" + i + " column:" + j);
                            break;
                        }
                    }
                    System.out.println();
              }


    }
}
