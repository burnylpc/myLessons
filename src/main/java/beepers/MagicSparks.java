package beepers;

public class MagicSparks implements Beeper {

    @Override
    public String makeSound() {
        return "Ololo";
    }

    @Override
    public String toString() {
        return "MagicSparks";
    }
}
