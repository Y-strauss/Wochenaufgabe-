public class reverse {
    public static void main(String[] args) {
        // Überprüfen, ob Argumente vorhanden sind
        if (args.length > 0) {
            // Argumente in umgekehrter Reihenfolge durchlaufen und ausgeben
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.println(args[i]);
            }
        }
    }
}
