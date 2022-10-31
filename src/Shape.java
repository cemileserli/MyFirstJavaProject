public class Shape {
    int numSides;

    Shape() {
        //System.out.println("I am a Shape");
    }
    Shape(int numSides){
        this.numSides = numSides;
    }
}
//Triangle is subclass of Shape
class Triangle extends Shape {
    Triangle() {
        //System.out.println("I am a Triangle");
        super(3); //pushing a static parameter to super
    }

    Triangle(int numSides){
        super(numSides); //pushing a dynamic parameter to super
    }



    public static void main(String[] args) {
        //Shape sp = new Shape();
        //Triangle tr = new Triangle();
        Triangle tr = new Triangle();
        Shape sp = new Shape(4);
        Triangle tr1 = new Triangle(5);
        System.out.println(sp.numSides);
        System.out.println(tr.numSides);
        System.out.println(tr1.numSides);
    }

}