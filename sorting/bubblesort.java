import java.util.Scanner;
public class bubblesort{


static void printarray(int [] array){
    for(int i = 0;i<array.length;i++){
        System.out.print(array[i]+"\t");
    }
}

static void inputarray(int [] array){
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<array.length; i++){  
    array[i] = sc.nextInt();
    
}
}

static void Bubblesort(int [] array){
    for(int i=0;i<array.length-1;i++){
        for(int j=0;j<array.length-i-1;j++){
            if(array[j]>array[j+1]){
                int temp = array[j+1];
                array[j+1] = array[j];
                array[j] = temp;
            }
        }
    }
    printarray(array);
}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array --->");
    int n = sc.nextInt();
    int  array [] = new int[n];
    System.out.println("Enter the array --->");
    inputarray(array);
    Bubblesort(array);
    sc.close();
    
}
}
