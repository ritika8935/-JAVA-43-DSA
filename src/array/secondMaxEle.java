package array;

public class secondMaxEle {
    public static void main(String[] args) {
        int arr[]={6,7,2,10,56,90,0,3,5};
        int max1,max2;
        max1=max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("second max number is: "+max2);
    }
}
