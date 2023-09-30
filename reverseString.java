public class reverseString {
    public static void rev(int idx, String str){
        if(idx==0){
            System.out.println(str.charAt(idx));//retrieve char at idx=0
            return ;
        }
        
        System.out.print(str.charAt(idx)); 
        rev(idx-1, str);  

    }
    public static void main(String[] args) {
        String str="Sreshta";
        rev(str.length()-1, str);
        
    }
    
}
