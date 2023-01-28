public abstract class Attaque_Decorateur implements Personnage{

    protected  Hero skill;


    public Attaque_Decorateur(Hero skill) {
        this.skill = skill;
    }
    public void attaque() {
        skill.attaque();
    }

    @Override
    public int puissance() {
        return skill.puissance();
    }
}

