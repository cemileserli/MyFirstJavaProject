public class TestCarOwner {
    public static void main(String[] args) {


        Car mercedes = new Car();
        mercedes.color = "Green";
        mercedes.fourWheel = true;


        Person zeynep = new Person();
        zeynep.firstName = "Zeynep";
        zeynep.lastName = "Pekcaglayan";
        zeynep.tckn = 1;

        mercedes.owner = zeynep;
        zeynep.vehicle = mercedes;

        System.out.println(mercedes.getInfo());


    }
}
