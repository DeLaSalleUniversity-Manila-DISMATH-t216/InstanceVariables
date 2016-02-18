# InstanceVariables

![jcinsanity](Screenshot 001.PNG)
![jcinsanity](Screenshot 002.PNG)
![jcinsanity](Screenshot 003.PNG)




~~~
package ph.edu.dlsu;

import ph.edu.dlsu.Olive.Olive;
import ph.edu.dlsu.OlivePress.OlivePress;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Olive> olives = new ArrayList<Olive>();

        Olive olive;

        olive = new Olive();
        System.out.println(olive.name);
        olives.add(olive);

        olive = new Olive();
        System.out.println(olive.name);
        olives.add(olive);

        olive = new Olive();
        System.out.println(olive.name);
        olives.add(olive);


        OlivePress press = new OlivePress();
        press.getOil(olives);
    }
}

~~~

~~~
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

~~~

~~~
package ph.edu.dlsu.Olive;

public class Olive {

    public String name = "KALAMATA";
    public String flavor = "Grassy";
    public long color = 0x000000;
    private int oil = 3;

    public int crush(){
        System.out.println("Ouch!");
        return oil;
    }
}

~~~
