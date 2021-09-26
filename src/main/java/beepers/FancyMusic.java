package beepers;

public class FancyMusic implements Beeper {
    @Override
    public String makeSound() {
        return "What is love? Baby dont hurt me";
    }

    @Override
    public String toString() {
        return "FancyMusic";
    }

    public String checkArtist(){
        return "Artist";
    }
}
