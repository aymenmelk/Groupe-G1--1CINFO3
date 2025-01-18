package aymen;

public class InversrChaine {
    public static void main(String[] args) {
        String chaine = "hi aymen";
        String chaineInversee = inverserRecursivement(chaine);
        System.out.println("Chaîne inversée : " + chaineInversee);
    }

    public static String inverserRecursivement(String chaine) {
        if (chaine.isEmpty()) {
            return chaine;
        }
        return inverserRecursivement(chaine.substring(1)) + chaine.charAt(0);
    }
}
