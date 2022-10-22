package Sem2.Homework;

import java.util.logging.Logger;

public class task2 {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4 ,7, 0};
        sortBubble(arr);
    }

    public static void sortBubble(int[] arr){
        Logger logger = Logger.getAnonymousLogger();
        int currentSize = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < currentSize - 1; j++) {
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
            currentSize --;
            logArray(arr,logger);
        }
    }

    public static void logArray(int[] arr, Logger logger){
        StringBuilder logString = new StringBuilder();
        logString.append("[");
        for (int i = 0; i < arr.length-1; i++) {
            logString.append(arr[i]+" ");
        }
        logString.append(arr[arr.length-1]+"]");
        logger.info(logString.toString());
    }

}
