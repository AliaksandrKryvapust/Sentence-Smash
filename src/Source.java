public class Source {
    public static void main(String[] args) {
    String [] str = new String[] { "Bilal", "Djaghout" };
        System.out.println(smash(str).equals("Bilal Djaghout"));
    }
    public static String smash(String... words) {
            return String.join(" ", words);
        }
    }

