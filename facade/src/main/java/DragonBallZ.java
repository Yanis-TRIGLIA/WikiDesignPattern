public class DragonBallZ implements Animée {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void nom() {
        System.out.println(ANSI_RED+"Nom : SonGoku"+ANSI_RESET);
    }
    @Override
    public void form() {
        System.out.println(ANSI_RED+"Form : ssj1"+ANSI_RESET);
    }
    @Override
    public void prix() {
        System.out.println(ANSI_RED+"Prix : 600 €"+ANSI_RESET);
    }

}
