import java.util.ArrayList;

public class Battlefield {
    private ArrayList<Unit>Figthers;
    private int food;

    public void Battlefield(int eat, int fighters){
        for (int i = 0; i < fighters; i++){
            Unit unit = new Unit("Neutral");
            Figthers.add(unit);
        }
        this.food = eat;
    }

    public void battle(){

    }
}
