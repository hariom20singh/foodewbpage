import java.util.Scanner;
public class insertionsort {
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


static void Insertionsort(int [] array){
    for (int i = 1; i < array.length; i++) {
        int current  = array[i];
        int j = i-1;
        while(j>=0 && current<array[j]){
            array[j] = array[j+1];
            j--;
        }
        array[j+1] = current;
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
    Insertionsort(array);
    sc.close();
    
}
}

