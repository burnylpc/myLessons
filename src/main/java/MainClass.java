import Equipments.Equipment;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import brands.Mercedes;
import brands.Subaru;
import cars.*;
import engines.Engine12V;
import engines.Engine3L;
import engines.FSDEngine;
import models.Model;

import java.util.ArrayList;
import java.util.Random;

public class MainClass {

    public static void main(String[] args){

        Horn horn = new Horn();
        FancyMusic fancyMusic = new FancyMusic();
        MagicSparks magicSparks = new MagicSparks();

        Engine12V engine12V = new Engine12V();
        FSDEngine fsdEngine = new FSDEngine();

        Lambo lambo = new Lambo(fancyMusic, engine12V);
        Viper viper = new Viper(magicSparks, fsdEngine);

//        System.out.println(lambo.checkBeep());
//        System.out.println(lambo.checkSpeed());

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(lambo);
        carList.add(viper);

//        for (int i = 0; i < carList.size(); i++) {
//            System.out.println(carList.get(i).checkSpeed());
//            System.out.println(carList.get(i).checkBeep());
//        }



        //HOMEWORK

        Model forester = new Model(new Subaru(), "Forester");
        Equipment normal =  new Equipment(new Engine12V(), new FancyMusic(), 4, true);

        NewCar subaruForester = new NewSubaruForester(forester, normal);
        System.out.println(subaruForester.getName());


        Model mercedes = new Model(new Mercedes(), "Sprinter");
        Equipment comfort = new Equipment(new Engine3L(), new Horn(), 5, true);

        NewMercedesSprinter mercedesSprinter = new NewMercedesSprinter(mercedes, comfort);
        System.out.println(mercedesSprinter.getName());

        Random random = new Random();
        int randomNumberOfPeople = random.nextInt(99);
        System.out.println("Надо отвезти " + randomNumberOfPeople);

       int numberOfSeats = mercedesSprinter.NumberOfSeats();

        if (randomNumberOfPeople > numberOfSeats) {
            System.out.println("Нельзя посадить " + randomNumberOfPeople + " одновременно");
        } else {
            System.out.println("Поехали!");
        }




    }

}
