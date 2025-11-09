public class ordinateur {
    private String modele;
    private String processeur;
    private String marque;
    private int ram;
    private int stockage;

    public ordinateur
    (String modele, String processeur, String marque, int ram, int stockage) {
        this.modele = modele;
        this.processeur = processeur;
        this.marque = marque;
        this.ram = ram;
        this.stockage = stockage;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getProcesseur() {
        return processeur;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStockage() {
        return stockage;
    }

    public void setStockage(int stockage) {
        this.stockage = stockage;
    }
    public void afficherinfo(){
        System.out.println("Modele : "+modele);
        System.out.println("Processeur : "+processeur);
        System.out.println("Marque : "+marque);
        System.out.println("Ram : "+ram);
        System.out.println("Stockage : "+stockage);
    }
}

