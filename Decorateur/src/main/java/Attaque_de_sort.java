public class Attaque_de_sort extends Attaque_Decorateur {
    public int bonus ;
    public Attaque_de_sort(Hero skill,int bonus) {
        super(skill);
        this.bonus = bonus;
    }
    @Override public void attaque()
    {
        skill.attaque();
        setAttaque_de_sort(skill);
    }
    @Override public int puissance()
    {
        return skill.puissance() + 30 +bonus ;

    }

    private void setAttaque_de_sort(Personnage skill)
    {
        // Display message whenever function is called
        System.out.println("-Attaque Spéciale : Eveil du  Dark Hold");
    }
}
