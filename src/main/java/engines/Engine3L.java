package engines;

public class Engine3L implements Engine {

    @Override
    public String makeRotation() {
        return "350 km/h";
    }

    public String power() {
        return "190 h/p";
    }

    @Override
    public String toString(){
        return "Engine3L";
    }
}
