package Assignment1;

public class Qn4 {
    /**
     * 
     * @Question 
     * Write a method reverse() that takes a string as
     * an argument and returns a string that contains the same 
     * sequence of characters as the argument string but in
     * reverse order
     */

    public static String reverse(String arg){
        int n = arg.length() / 2;
        char arr[] = arg.toCharArray();

        for(int i=0;i<n;i++){
            char temp = arr[i];
            arr[i] = arr[arg.length() - i - 1];
            arr[arg.length() - i - 1] = temp;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
     
    System.out.println(reverse("Tenet")); // expected teneT
      
    }
}
