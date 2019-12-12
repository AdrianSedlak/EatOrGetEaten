public class Unit {
    private String property;
    private int choice;
    private double stomache;

    public Unit(String prop){
        this.property = prop;
        this.choice = 0;
        this.stomache = 0;
    }

    public void setProperty(String prop){
        this.property = prop;
    }

    public void setChoice(int choice){
        this.choice = choice;
    }

    public String getProperty(){
        return this.property;
    }

    public void setStomache(double food){
        this.stomache = food;
    }

    public double getStomache(){
        return this.stomache;
    }

}
