public class Mechant {
    public int pv ;
    public String Nom;

    public Mechant(int pv, String nom) {
        this.pv = pv;
        Nom = nom;
    }

    public int getPv() {
        return pv;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    @Override
    public String toString() {
        return "Mechant{" +
                "pv=" + pv +
                ", Nom='" + Nom + '\'' +
                '}';
    }
}