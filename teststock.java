public class teststock {
    public static void main(String[] args) {
        // Création du stock (capacité initiale 5 mais dynamique grâce à ArrayList)
        stock stock = new stock(5);

        // Création d'ordinateurs
        ordinateur o1 = new ordinateur("Dell", "Inspiron", "Intel i5", 8, 512);
        ordinateur o2 = new ordinateur("HP", "Pavilion", "AMD Ryzen 7", 16, 1024);
        ordinateur o3 = new ordinateur("Apple", "MacBook Air", "M2", 8, 256);

        // Ajout dans le stock
        stock.ajouterordinateur(o1);
        stock.ajouterordinateur(o2);
        stock.ajouterordinateur(o3);

        // Affichage du stock
        stock.afficherstock();
        System.out.println("Nombre d'ordinateurs dans le stock : " + stock.getNbOrdinateur());

        // Recherche
        System.out.println("\nRecherche de HP Pavilion :");
        ordinateur recherche = stock.rechercherordinateur("HP", "Pavilion");
        if (recherche != null) {
            recherche.afficherinfo();
        } else {
            System.out.println("Ordinateur non trouvé !");
        }

        // Suppression
        System.out.println("\nSuppression de Dell Inspiron...");
        stock.supprimerordinateur("Dell", "Inspiron");

        // Affichage après suppression
        stock.afficherstock();
        System.out.println("Nombre d'ordinateurs dans le stock : " + stock.getNbOrdinateur());
    }
}
