package Abstraction_Packages_ExceptionHandling.Interfaces.live;

import Abstraction_Packages_ExceptionHandling.Interfaces.music.Playable;
import Abstraction_Packages_ExceptionHandling.Interfaces.music_string.Veena;
import Abstraction_Packages_ExceptionHandling.Interfaces.music_wind.Saxophone;

public class Test {

    public static void main(String[] args) {


        Veena veena = new Veena();
        veena.play();


        Saxophone saxophone = new Saxophone();
        saxophone.play();


        Playable p1 = new Veena();
        Playable p2 = new Saxophone();


        p1.play();
        p2.play();

    }
}