import java.util.Scanner;
public class selectionsort {
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


static void Selectionsort(int [] array){
    for(int i=0;i<array.length-1;i++){
        int smallest = i;
        for(int j=i+1;j<array.length;j++){
            if(array[smallest]>array[j]){
                smallest = j;
            }
        }
        int temp = array[smallest];
        array[smallest]= array[i];
        array[i] = temp;

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
    Selectionsort(array);
    sc.close();
}
}

