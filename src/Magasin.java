public class Magasin {
        private int identifiant;
        private String adresse;
        private int capacite=5;
        private Produit[] eP;
        private int count=0;
        //constructeur vide de la classe
        public Magasin () {
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
            System.out.println("identifiant :"+identifiant);
            System.out.println("adresse :"+adresse);
            System.out.println("capacite du magasin :"+capacite);
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
}


