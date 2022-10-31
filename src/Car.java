public class Car {
    public String color;
    private int speed;
    public boolean fourWheel;

    Person owner;

    public Car(String color, int speed) {
        // Variables color and speed accessible here
    }

    public Car() {

    }

    public void drive(boolean fourWheel) {
        // Variables color and speed accessible here
        fourWheel = true;
    }

    public String getInfo(){
        String info = "Car Info : Color " + color + ", FourWheel : " + fourWheel;
        if (owner != null)
            info += " And its owner is " + owner.firstName + " " + owner.lastName;
        else
            info += " And does not have an owner!";
        return info;
    }


    public static void main(String[] args) {
        Car ferrari = new Car("red", 200);
        System.out.println(ferrari.color);
        System.out.println(ferrari.speed);
        System.out.println(ferrari.fourWheel); // This will throw an error
    }
}
