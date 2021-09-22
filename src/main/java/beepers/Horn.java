import beepers.Beeper;

public class Horn implements Beeper {

    @Override
    public String makeSound() {
        String s = "Horn sound";
        return s;
    }
}
