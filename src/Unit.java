public class Unit {
    private String property;
    private int choice;
    private int stomache;

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
}
