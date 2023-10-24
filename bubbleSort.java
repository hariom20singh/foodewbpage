mport java.util.Arrays;

//In buble sort we repaetedly compare two adjacent elemenets and swap them if they are in wrong order
//In buble the biggest element will be at its right position

public class bubblesort {

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static int[] bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;

            for(int j=1;j<arr.length-i;j++){    //j<n-i since the elements i elements at the end are already sorted
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped=true;
                }
            }
            if(!swapped){
                return arr;
            }
        }

        return arr;
    }
    public static void main(String args[]){
        int[] arr={15,65,74,15,23,10};
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after bubble sort");
        arr=bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
