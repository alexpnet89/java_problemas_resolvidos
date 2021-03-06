package algorithms.warmup.plus_minus;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        float positivo = 0;
        float negativo = 0;
        float zero = 0;

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] > 0){
                positivo++;
            }
            if(arr[arr_i] < 0){
                negativo++;
            }

            if(arr[arr_i] == 0){
                zero++;
            }
        }

        System.out.println(positivo/arr.length);
        System.out.println(negativo/arr.length);
        System.out.println(zero/arr.length);

    }
}