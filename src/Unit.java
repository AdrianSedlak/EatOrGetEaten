public class Unit {
    private String property;

    public static void main(String[] args) {

    }

    public void Unit(String prop){
        setProperty(prop);
    }

    public void setProperty(String prop){
        this.property = prop;
    }

    public String getProperty(){
        return this.property;
    }
}
