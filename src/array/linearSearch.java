package array;

public class linearSearch {
    public static void main(String[] args) {
        int arr[]={7,9,4,10,89,39,0,4,6};
        int key=10;
        int index=linearsearch(arr,key);
        if(index==-1){
            System.out.println("Not Found!");
        }else{
            System.out.println("index at "+index);
        }


    }
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
