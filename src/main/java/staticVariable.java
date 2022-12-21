public class staticVariable {

    static String name1;
    static String name2;
    static double coins;
    public static final String newWorld = "grandpas' fantacy park! ";//constatnt variable

      void detailsOfKids(String nameA, String nameB, int totalcoins) {
         coins = totalcoins;
         name1 = nameA;
         name2 = nameB;

         System.out.println(name1 + " " + "&" + " " + name2 + " " + "welcome to" + " " + newWorld);

     }
}
