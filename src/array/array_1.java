package array;

public class array_1 {
    public static void main(String[] args) {
       int arr[]={89,76,90};
       update(arr);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
}
