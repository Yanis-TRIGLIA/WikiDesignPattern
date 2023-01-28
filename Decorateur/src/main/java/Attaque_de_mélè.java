public class Attaque_de_mélè extends  Attaque_Decorateur {
    public Attaque_de_mélè(Hero skill) {
        super(skill);
    }
    @Override public void attaque()
    {
        skill.attaque();
        setAttaque_de_mélè(skill);
    }
    @Override public int puissance()
    {
        return skill.puissance() + 94 ;

    }

    private void setAttaque_de_mélè(Personnage skill)
    {
        // Display message whenever function is called
        System.out.println("-Attaque Spéciale : Epée du witcher");
    }
}
