public class Magasin_de_figurine {
    private Animée DragonBallZ;

    private Animée attaque_des_titans;

    private Animée Naruto ;

    private Animée OnePiece ;

    public Magasin_de_figurine(){
        DragonBallZ= new DragonBallZ();
        attaque_des_titans= new Attaque_des_titans();
        Naruto= new Naruto();
        OnePiece= new OnePiece();
    }
    public void vente_figurine_DragonBallZ(){
        DragonBallZ.nom();
        DragonBallZ.prix();
        DragonBallZ.form();
    }
    public void vente_figurine_attaque_des_titans(){
        attaque_des_titans.nom();
        attaque_des_titans.prix();
        attaque_des_titans.form();
    }
    public void vente_figurine_Naruto(){
        Naruto.nom();
        Naruto.prix();
        Naruto.form();
    }
    public void vente_figurine_OnePiece(){
        OnePiece.nom();
        OnePiece.prix();
        OnePiece.form();
    }
}