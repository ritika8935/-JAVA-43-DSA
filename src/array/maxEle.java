package array;

public class maxEle {
    public static void main(String[] args) {
        int arr[]={6,7,2,10,56,90,0,3,5};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max Number is: "+max);
    }
}
