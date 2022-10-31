public class ArrayAsParameter {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 2;
        array1[1] = 4;
        array1[2] = 1;


        ArrayAsParameter arraytest = new ArrayAsParameter();
        arraytest.calculateArrayAverage(array1);

    }

    double calculateArrayAverage(int[] arrayList){
        double total = 0;

        for(int i : arrayList){
            total += i;
        }
        System.out.println("Average is : " + total/arrayList.length);
        return total/arrayList.length;
    }
}
