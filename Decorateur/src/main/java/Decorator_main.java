import java.util.concurrent.TimeUnit;
public class Decorator_main   {

    public static void main(String[] args) throws InterruptedException {
        //Test attaque de base
        Mechant bowser = new Mechant(170,"Bowser");

        Personnage mario = new Hero();

        System.out.println("Personnage : Mario ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Liste d'attaque : \n");
        TimeUnit.SECONDS.sleep(1);
        mario.attaque();
        System.out.println("-Niveau de puissance :");
        System.out.println(mario.puissance());

        System.out.println("Mario vs Bowser\n");
        System.out.println("Combat en cours.....");
        TimeUnit.SECONDS.sleep(7);
        int pv_after_0;
        pv_after_0 =bowser.getPv() - mario.puissance();
        System.out.println("Combat terminer");
        System.out.println("il reste "+pv_after_0+" point de vie a Bowser \n");
        if(pv_after_0<= 0){
            System.out.println("C'est gagner\n");
        }
        else{
            System.out.println("C'est perdu\n");
        }
        TimeUnit.SECONDS.sleep(1);

        //Test attaque a distance
        Mechant sauron = new Mechant(170,"Sauron");

        Personnage Legolas = new Attaque_distance(new Hero());

        System.out.println("Personnage : Legolas ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Liste d'attaque : \n");
        TimeUnit.SECONDS.sleep(1);
        Legolas.attaque();
        System.out.println("-Niveau de puissance :");
        System.out.println(Legolas.puissance());

        System.out.println("Legolas vs Sauron\n");
        System.out.println("Combat en cours.....");
        TimeUnit.SECONDS.sleep(7);
        int pv_after;
        pv_after =sauron.getPv() - Legolas.puissance();
        System.out.println("Combat terminer");
        System.out.println("il reste "+pv_after+" point de vie a Sauron \n");
        if(pv_after<= 0){
            System.out.println("C'est gagner\n");
        }
        else{
            System.out.println("C'est perdu\n");
        }
        TimeUnit.SECONDS.sleep(1);

        //Test attaque de sort
        Mechant Thanos = new Mechant(210,"Thanos");

        Personnage Strange = new Attaque_de_sort(new Hero(),60);

        System.out.println("Personnage : Docteur Strange ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Liste d'attaque : \n");
        TimeUnit.SECONDS.sleep(1);
        Strange.attaque();
        System.out.println("-Niveau de puissance :");
        System.out.println(Strange.puissance());

        System.out.println("Strange vs Thanos\n");
        System.out.println("Combat en cours.....");
        TimeUnit.SECONDS.sleep(7);
        int pv_after_2;
        pv_after_2 =Thanos.getPv() - Strange.puissance();
        System.out.println("Combat terminer");
        System.out.println("il reste "+pv_after_2+" point de vie a Thanos");
        if(pv_after_2<= 0){
            System.out.println("C'est gagner\n");
        }
        else{
            System.out.println("C'est perdu\n");
        }
        TimeUnit.SECONDS.sleep(1);

        //Test attaque de mélè
        Mechant Eredin = new Mechant(100,"Eredin");

       Personnage Geralt = new Attaque_de_mélè(new Hero());

        System.out.println("Personnage : Geralt ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Liste d'attaque : \n");
        TimeUnit.SECONDS.sleep(1);
        Geralt.attaque();
        System.out.println("-Niveau de puissance :");
        System.out.println(Geralt.puissance());

        System.out.println("Geralt vs Eredin\n");
        System.out.println("Combat en cours.....");
        TimeUnit.SECONDS.sleep(7);
        int pv_after_3;
        pv_after_3 =Eredin.getPv() - Geralt.puissance();
        System.out.println("Combat terminer");
        System.out.println("il reste "+pv_after_3+" point de vie a Eredin");
        if(pv_after_3<= 0){
            System.out.println("C'est gagner\n");
        }
        else{
            System.out.println("C'est perdu\n");
        }

    }
}