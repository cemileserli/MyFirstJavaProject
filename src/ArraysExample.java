public class ArraysExample {
    public ArraysExample() {
    }

    public static void main(String[] args) {
        String[] bandInstruments = {"bass", "guitar", "electric keyboard", "drums"};
        System.out.println("before bandInstruments[2] : " + bandInstruments[2]);
        bandInstruments[2] = "melodica";
        System.out.println("after bandInstruments[2] : " + bandInstruments[2]);
        System.out.println("bandInstruments length : " + bandInstruments.length);

        String[] quartetInstruments = new String[4];
        quartetInstruments[0] = "violin";
        quartetInstruments[1] = "violin";
        quartetInstruments[2] = "viola";
        quartetInstruments[3] = "cello";

        System.out.println("quartetInstruments : ");
        for(int i = 0; i < quartetInstruments.length; i++){

            System.out.println(quartetInstruments[i]);
        }
    }
}
