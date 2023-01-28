import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern_utilisateur{
    private static int article;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001B[34m";


    public static void main(String args[]) throws NumberFormatException, IOException{
        do{
            Magasin_de_figurine mag=new Magasin_de_figurine();
            System.out.println("Choisir un article parmis la liste suivante pour avoir des information");
            System.out.println(ANSI_BLUE+"1-Dragon Ball Z"+ANSI_RESET);
            System.out.println(ANSI_BLACK+"2-Naruto"+ANSI_RESET);
            System.out.println(ANSI_GREEN+"3-OnePiece"+ANSI_RESET);
            System.out.println(ANSI_PURPLE+"4-L'attaque des titans"+ANSI_PURPLE);

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            article=Integer.parseInt(br.readLine());


            if (article == 1){
                mag.vente_figurine_DragonBallZ();
            }
            else if(article == 2){
                mag.vente_figurine_Naruto();
            }
            else if(article == 3){
                mag.vente_figurine_OnePiece();
            }

            else if(article == 4){
                mag.vente_figurine_attaque_des_titans();
            }


        }while(article !=1 ||article !=2 || article !=3 || article !=4);
    }
}