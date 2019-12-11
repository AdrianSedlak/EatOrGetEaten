import java.util.ArrayList;
import java.util.Random;

public class Battlefield {
    private static ArrayList<Unit>Fighters;
    private static ArrayList<Integer>choices;
    private static int food;

    public static void main(String[] args) {
        Battlefield(20, 10);
        choices();
        evaluation();
    }

    public static void Battlefield(int eat, int fighters){
        for (int i = 0; i < fighters; i++){
            Unit unit = new Unit("Neutral");
            Fighters.add(unit);
        }
        food = eat;
    }

    public static void choices(){
        Random rand = new Random();
        for (int i = 0; i < Fighters.size(); i++){
            Fighters.get(i).setChoice(rand.nextInt(food));
        }
    }

    public static void evaluation(){
        int count = 1;
        for (int i = 0; i < choices.size(); i++)
        {
            for (int j = i; j < choices.size() - 1 ; j++)
            {

                if(choices.get(j) == choices.get(j+1))
                    count = count + 1;
            }
            System.out.println(choices.get(i) + "occurse" + count);
        }
    }
}
