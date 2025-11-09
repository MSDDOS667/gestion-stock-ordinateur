import java.util.ArrayList;

public class stock {
    private ArrayList<ordinateur> ordinateurs;
    private int nbOrdinateur;
    public stock() {
        this.nbOrdinateur=nbOrdinateur;
        ordinateurs = new ArrayList<>();
    }

    public stock(int nbOrdinateur) {
    }

    public void ajouterordinateur(ordinateur ordinateur) {
        ordinateurs.add(ordinateur);
    }
    public void afficherstock() {
        for( ordinateur o : ordinateurs) {
            o.afficherinfo();
        }
    }
    public ordinateur rechercherordinateur(String marque, String modele) {
        for (ordinateur o : ordinateurs) {
            if (o.getMarque().equalsIgnoreCase(marque) &&
                    o.getModele().equalsIgnoreCase(modele)) {
                return o;
            }
        }
        return null; // non trouvé
    }

    // Suppression d'un ordinateur (le premier trouvé)
    public void supprimerordinateur(String marque, String modele) {
        ordinateur o = rechercherordinateur(marque, modele);

        if (o != null) {
            ordinateurs.remove(o);
            nbOrdinateur--; // Mise à jour du compteur
            System.out.println("Ordinateur supprimé avec succès !");
        } else {
            System.out.println("Ordinateur non trouvé dans le stock.");
        }
    }

    // Getter du nombre d'ordinateurs
    public int getNbOrdinateur() {
        return nbOrdinateur;
    }

          }










