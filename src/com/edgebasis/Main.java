package com.edgebasis;

public class Main {

    static int[] arr = new int[] {0,0,0,2,0,3,0,4,0,6};

    public static void main(String[] args) {
	// write your code here
        int tempVal;
        int lastNonZero=0;
        for(int i =0; i< arr.length; i++){
            int counter=i;
            lastNonZero = i;
            if(arr[i]==0)
            {



                for(int j =lastNonZero+1; j<arr.length;j++)
                {
                    if(arr[j]!=0){
                        tempVal=arr[j];
                        arr[j]=arr[i];
                        arr[i]=tempVal;
                        lastNonZero=j;
                    }
                }


             }

        }



        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);

        }

    }




}
