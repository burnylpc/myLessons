package brands;

public class Mercedes implements Brand {

    @Override
    public String nameBrand() {
        return "Mercedes-Benz";
    }

    @Override
    public String country() {
        return "Germany";
    }
}
