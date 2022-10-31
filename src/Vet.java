public class Vet {
    public Vet(){
    }

    public void getCheckUp(Animal patient){

    }



    public static void main(String[] args) {
        Vet catDoctor = new Vet();
        //Animal myCat = new Cat();
        Animal myCat = new Cat();
        catDoctor.getCheckUp(myCat);
    }
}
