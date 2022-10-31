import java.security.PublicKey;
import java.util.Arrays;

public class Monster {

    public Monster(){

    }

    public class Vampire{
        public Vampire(){

        }
    }

    public class Werewolf{
        public Werewolf(){

        }
    }

    public static class Zombie{
        public Zombie(){

        }
    }

    public static void main(String[] args) {
        Monster zombie;
        Monster vampire;
        Monster werewolf;
        zombie = new Monster();
        werewolf = new Monster();
        vampire = new Monster();
        Monster[] monsters = {zombie, vampire, werewolf};
        System.out.println(Arrays.stream(monsters).toList().toString()); //Printing out the memory addresses of the classes
    }
}
