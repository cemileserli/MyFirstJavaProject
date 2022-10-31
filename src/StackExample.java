import java.util.Arrays;

public class StackExample {
    public static final int MAX_STACK_SIZE = 5;
    boolean full = false;
    boolean empty = true;
    String[] array1 = new String[MAX_STACK_SIZE];
    int pointer = 0;

    public static void main(String[] args) {
        StackExample se = new StackExample();
        System.out.println("Stack Capacity : " + se.capacityOfStack());
        System.out.println(se.pushToStack(null));
        System.out.println(se.pushToStack("1"));
        System.out.println(se.pushToStack("2"));
//        System.out.println(se.pushToStack("3"));
//        System.out.println(se.pushToStack("4"));
//        System.out.println(se.pushToStack("5"));
        System.out.println("Stack Size : " + se.sizeOfStack());
//        System.out.println("Stack Capacity : " + se.capacityOfStack());
//        System.out.println(se.pushToStack("6"));
//        System.out.println(se.pushToStack("7"));
//        System.out.println("Is Stack empty : " + se.isEmpty());
//
//        System.out.println("Is Stack FULL : " + se.isFull());
//        System.out.println("Stack Capacity : " + se.capacityOfStack());
        System.out.println(se.popFromStack());
//        System.out.println(se.popFromStack());
        System.out.println("Stack Size : " + se.sizeOfStack());
//        System.out.println(se.popFromStack());
//        System.out.println(se.pushToStack("0"));
//        System.out.println(se.pushToStack("1"));
//        se.removeAllFromStack();
//        System.out.println("Is Stack empty : " + se.isEmpty());
//        System.out.println("Is Stack FULL : " + se.isFull());
        se.showStackElements();

    }
    public boolean pushToStack(String newElement){
        if(!full){
            array1[pointer] = newElement;
            pointer++;
            empty=false;
            if(pointer == MAX_STACK_SIZE){
                full = true;
            }
            return true;
        }else {
            System.out.println("Stack is full, can not push new element");
            return false;
        }

    }

    public String popFromStack(){
        String lastItem = null;
        if(!empty){
            pointer--;
            array1[pointer] = null;
            full = false;
            lastItem = array1[pointer];
        }
        else {
            System.out.println("Array is empty so can not remove any element");
        }

        return lastItem;
    }

    public void removeAllFromStack(){
        Arrays.fill(array1, null);
        pointer = 0;
        full = false;
        empty = true;
    }

    public boolean isEmpty(){
        //return pointer == 0 ? true : false;
        return empty;
    }

    public boolean isFull(){
        //return pointer == MAX_STACK_SIZE ? true : false;
        return full;
    }

    public int sizeOfStack(){
        return pointer;
    }
    public int capacityOfStack(){
        return MAX_STACK_SIZE - pointer;
    }

    public void showStackElements(){
        System.out.println("***Elements in the Stack***");
        if(!empty){
            for(String b : array1){
                if(b!=null)
                    System.out.println(b);
            }
        }else {
            System.out.println("Nothing in the Stack");
        }

    }
}

