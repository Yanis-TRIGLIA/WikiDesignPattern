public class Attaque_des_titans implements Animée {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void nom() {
        System.out.println(ANSI_RED+"Nom : Eren"+ANSI_RESET);
    }
    @Override
    public void form() {
        System.out.println(ANSI_RED+"Form : Titan Originel"+ANSI_RESET);
    }
    @Override
    public void prix() {
        System.out.println(ANSI_RED+"Prix : 700 €"+ANSI_RESET);
    }

}
