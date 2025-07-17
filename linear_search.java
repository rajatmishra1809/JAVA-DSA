import java.util.*;
public class linear_search{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int x=sc.nextInt();
        int index=LinearSearch(arr,x);
        if(index!=-1){
            System.out.println("Element found at index "+index);
        }
        else {
            System.out.println("Element not found");
        }
    }
private static int LinearSearch(int arr[],int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;//not found
    }
}