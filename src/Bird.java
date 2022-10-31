class Bird {
    public Bird() {
        // Instructions for creating a Bird go here:
    }

    public void move() {
        System.out.println("The bird flies away");
    }
}

class Flamingo extends Bird{
    public Flamingo(){
    }

    public static void main(String[] args) {
        Flamingo myFlamingo = new Flamingo();
        myFlamingo.move();
    }
}

class Penguin extends Bird{
    public Penguin(){
    }

    @Override
    public void move(){
        System.out.println("The penguin float away");
    }

    public static void main(String[] args) {
        Penguin myPenguin = new Penguin();
        myPenguin.move();
    }

}