public class Hero implements Personnage {

    @Override
    public void attaque()
    {
        System.out.println("-Attaque de base: coup de poing");
    }
    public int puissance(){
        int p = 6;
        return p;
    }
}