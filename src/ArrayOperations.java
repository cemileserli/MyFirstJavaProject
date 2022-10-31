import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array1 = {3,3,87,56,1,87,3,2};
        ArrayOperations ao = new ArrayOperations();
        ao.copyArray(array1);


    }

    int[] copyArray(int[] array1){
        int[] array2;
        array2 = Arrays.copyOf(array1, array1.length);
        for(int i = 0; i < array2.length; i++){

            System.out.println(array2[i]);
        }

        return array2;
    }



}
