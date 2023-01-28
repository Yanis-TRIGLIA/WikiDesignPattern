public class OnePiece implements Animée {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    @Override
    public void nom() {
        System.out.println(ANSI_RED+"Nom : Luffy"+ANSI_RESET);
    }
    @Override
    public void form() {
        System.out.println(ANSI_RED+"Form : Gear 4"+ANSI_RESET);
    }
    @Override
    public void prix() {
        System.out.println(ANSI_RED+"Prix : 400 €"+ANSI_RESET);
    }

}
