package array;

import java.util.*;

public class searchingEle {
    public static void main(String[] args) {
        int arr[]={8,9,5,10,67,4,2,0};
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key :-");
        key=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Found At: "+i);
                System.exit(0);
            }
        }
        System.out.println("Not Found!");
    }
}
