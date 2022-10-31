public class Cat extends Animal{
    //instance fields
    String noise = "meow";
    int numLives = 9;

    public Cat(){
        System.out.println("Constractor");
    }

    public void speak(){
        System.out.println(noise);
    }

    public String toString(){
        return "The cat with " + numLives + " lives says " + noise;
    }

    public Cat(String animalNoise){
        this.noise = animalNoise;
    }
    public static void main(String[] args) {
        Cat homeCat = new Cat();
        System.out.println(homeCat.noise);
        Cat bigCat = new Cat("roar");
        System.out.println(bigCat.noise);

        Cat myCat = new Cat("meww");
        myCat.speak();
        System.out.println(myCat.toString());
    }
}
