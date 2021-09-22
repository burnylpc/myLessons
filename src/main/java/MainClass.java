public class MainClass {

    public static void main(String[] args){

        Horn horn = new Horn();
        Engine12V engine12V = new Engine12V();
        Lambo lambo = new Lambo(horn, engine12V);

        System.out.println(lambo.checkBeep());
        System.out.println(lambo.checkSpeed());
    }

}
