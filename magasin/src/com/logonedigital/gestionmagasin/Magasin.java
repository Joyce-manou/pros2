package com.logonedigital.gestionmagasin;
public class Magasin {
        private int identifiant;
        private String adresse;
        private int capacite=5;
        private Produit[] eP;
        private int count=0;
        //constructeur vide de la classe
        public Magasin () {
            this.identifiant=0;
            this.adresse="adresse non specifiee";
            this.capacite=5;
            this.eP=new Produit[capacite];
            this.count=0;
        }
        //constructeur parametre
        public Magasin(int identifiant,String adresse)
        {
            this.identifiant=identifiant;
            this.adresse=adresse;
            this.eP=new Produit[capacite];
        }

        public void ajouter(Produit p)
        {
            if(count>=capacite)
            {
                System.out.println("vous ne pouvez plus ajouter de produits");
            }else
            {
                eP[count]=p;
                count++;
                System.out.println("produit ajouter avec succes");
            }
        }



        public void afficher()
        {
            System.out.println("===== caracteristiques du magasin =====");
            System.out.println("identifiant :"+identifiant);
            System.out.println("adresse :"+adresse);
            System.out.println("capacite maximal du magasin :"+capacite);
            for(int i=0;i<count;i++){
                eP[i].afficher();
            }
        }

        public void setIdentifiant(int identifiant) {
            this.identifiant = identifiant;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
        }

        public void setCapacite(int capacite) {
            this.capacite = capacite;
        }

        public int getIdentifiant() {
            return identifiant;
        }

        public String getAdresse() {
            return adresse;
        }

        public int getCapacite() {
            return capacite;
        }

    public void afficherProduitsNomEtPrix() {
        System.out.println("===== prix et nom des produits ===== :");
        if (count == 0) {
            System.out.println("Aucun produit dans le magasin pour l'instant.");
        } else {
            for (int i = 0; i < count; i++) {
                String nom = eP[i].getLibele();
                double prix = eP[i].getPrix();


                System.out.println("nom:" + nom + " prix: " + prix );
            }
        }

    }
    public int getNombreTotalProduits() {
        return count;

    }


public boolean rechercherProduit(Produit p) {

    for (int i = 0; i < count; i++) {
        if (eP[i].comparer(p)) {
            return true;
        }
    }
    return false;
}
public boolean supprimerProduit(Produit p) {
    for (int i = 0; i < count; i++) {
        if (eP[i].comparer(p)) {
            for (int j = i; j < count - 1; j++) {
                eP[j] = eP[j + 1];
            }
            count--;
            System.out.println("Produit supprimé avec succès !");
            return true;
        }
    }
    System.out.println("Produit introuvable !");
    return false;
}


}


