public class Attaque_distance extends Attaque_Decorateur {

    public Attaque_distance(Hero skill) {
        super(skill);
    }
    @Override public void attaque()
    {
        skill.attaque();
        setAttaque_distance(skill);
    }
    @Override public int puissance()
    {
        return 15;

    }

    private void setAttaque_distance(Personnage skill)
    {
        // Display message whenever function is called
        System.out.println("-Attaque Spéciale : Fléche percutantes des bois");
    }

}

