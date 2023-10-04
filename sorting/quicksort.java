import java.util.Scanner;

public class quicksort  
{  
    
int partition (int a[], int start, int end)  
{  
    int pivot = a[end]; 
    int i = (start - 1); 
     
  
    for (int j = start; j <= end - 1; j++)  
    {  
        
        if (a[j] < pivot)  
        {  
            i++; 
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
        }  
    }  
    int t = a[i+1];  
    a[i+1] = a[end];  
    a[end] = t;  
    return (i + 1);  
}  
  


static void inputarray(int [] array){
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<array.length; i++){  
    array[i] = sc.nextInt();
}
}

void quick(int a[], int start, int end) 
{  
    if (start < end)  
    {  
        int p = partition(a, start, end);   
        quick(a, start, p - 1);  
        quick(a, p + 1, end);  
    }  
}  
  
 
void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int m = sc.nextInt();  
    int  a [] = new int[m];
    System.out.println("Enter the array: ");
    inputarray(a);  
    int n = a.length;  
    System.out.println("\nBefore sorting array elements are - ");  
    quicksort q1 = new quicksort();  
    q1.printArr(a, n);  
    q1.quick(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are - ");  
    q1.printArr(a, n);  
    System.out.println();  
    sc.close();
    }  
}  
