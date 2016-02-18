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
