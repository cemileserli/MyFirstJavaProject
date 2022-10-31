public class FootballPlayer {
    int no;
    String name;
    boolean inPlay;
    int minutes;
    int numberOfGoals;
    public FootballPlayer(){

    }

    public void play(int minutesToPlay){
        minutes = minutes + minutesToPlay;
    }

    public void score(){
        numberOfGoals = numberOfGoals + 1;
    }
    public void score(int goalCount){
        numberOfGoals = numberOfGoals + goalCount;
    }
}
