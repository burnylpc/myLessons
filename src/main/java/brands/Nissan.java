package brands;

public class Nissan implements Brand {

    @Override
    public String nameBrand() {
        return "Nissan";
    }

    @Override
    public String country() {
        return "Japan";
    }
}
