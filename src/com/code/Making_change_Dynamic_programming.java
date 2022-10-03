package com.code;

public class Making_change_Dynamic_programming {
    public static void main(String[] args) {
        int[] value={1,4,6};
        int C = 8;
        System.out.println ("The coin is needed to make "+ C + " money is "+
                making_change( value, C ));
    }
    public static int making_change(int[] value , int C){
        int[][] arr = new int[value.length+1][C+1];
        for (int i = 1; i <= value.length ; i++) {
            for (int j = 1; j <=C ; j++) {
                if( i == 1){
                    arr[i][j]=1+arr[i][j-value[i-1]];
                }
                else if(value[i-1] > j ){
                arr[i][j]= arr[i-1][j];
                }
                else{
                    arr[i][j]=Math.min(arr[i-1][j],1+arr[i][j-value[i-1]]);
                }
            }
        }
       /* for (int i = 0; i <=value.length; i++) {
            for (int j = 0; j <=C; j++) {
                System.out.print (arr[i][j]+ "    ");
            }
            System.out.println ();
        }*/
        return arr[value.length][C];
    }
}
