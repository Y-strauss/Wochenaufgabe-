public class minMax {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Keine Argumente gefunden");
            return; }
        try {
           
            findMinMax(args);
        } catch (NumberFormatException e) {
            
            System.out.println("Fehler");
        }}
    
    public static void findMinMax(String[] args ) throws NumberFormatException {
        
        int min = Integer.parseInt(args[0]);
        int max = min;

        
        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            min = Math.min(min. num);
            max = Math.max(max, num);
        }
    
        System.out.println(min);
        System.out.println(max); }
}

