public class Dog {
    String name;

    public String getName(){
        return name;
    }

    public void setName(String dogName){
        this.name = dogName;
    }

    public Dog(String dogName1){
        this.name = dogName1;
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Lassie");
        myDog.setName("Cujo");
        System.out.println(myDog.getName());
    }


}
