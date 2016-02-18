package ph.edu.dlsu.OlivePress;

import ph.edu.dlsu.Olive.Olive;

import java.util.ArrayList;

public class OlivePress {
    public void getOil(ArrayList<Olive> olives){

        int oil = 0;

        for (Olive olive : olives){
            oil += olive.crush();
        }
        System.out.println("You got " + oil + " units of oil");
    }
}
