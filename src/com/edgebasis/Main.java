package com.edgebasis;

public class Main {

    static int[] arr = new int[] {0,2,3,0,4,0,6};

    public static void main(String[] args) {
	// write your code here
        int tempVal = 0;

        for(int i =0; i< arr.length; i++){
            int counter=i;

            if(arr[i]==0)
            {


                while(arr[counter]==0 && (counter)<arr.length-1) {
                    counter++;
                }
                tempVal=arr[counter];
                arr[counter]=arr[i];
                arr[i]=tempVal;
             }

        }



        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);

        }

    }




}
