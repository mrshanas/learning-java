package Assignment1;

public class Qn2 {
    public static boolean eq(int arr1[],int arr2[]){
        boolean isTrue=false;
        if(arr1.length == arr2.length){
            for(int i = 0;i < arr1.length;i++){
                isTrue = (arr1[i] == arr2[i]) ? true : false;
            }
            return isTrue;
        }else{
            return isTrue;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {3,6,8};
        int arr2[] = {3,6,7};
        System.out.println(eq(arr1, arr2));
    }
}
