package engines;

import engines.Engine;

public class Engine12V implements Engine {
    @Override
    public String makeRotation() {
        return "300km/h";
    }

    @Override
    public String toString(){
        return "Engine12V";
    }
}
