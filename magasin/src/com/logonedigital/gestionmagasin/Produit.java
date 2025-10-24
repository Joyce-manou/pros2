package com.logonedigital.gestionmagasin;
import java.util.Date;

public class Produit {


    private int identifiant;
    private String libele;
    private String marque;
    private double prix;
    private Date dateExpiration;

    public Produit() {
    }


    public Produit(int identifiant, String libele, String marque, double prix) {
        this.identifiant = identifiant;
        this.libele = libele;
        this.marque = marque;
        this.prix = prix;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public String getLibele() {
        return libele;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getMarque() {
        return marque;
    }

    public void setPrix() {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void afficher() {
        System.out.println("identifiant:" + identifiant + "; libele:" + libele + "; marque:" + marque + "; prix:" + prix);
    }

    public void setproduit1(double prix) {
        this.prix = prix;
    }


    public void afficher1() {
        System.out.println("nouveau produit lait :");
        System.out.println("identifiant:" + identifiant + "; libele:" + libele + "; marque:" + marque + "; prix:" + prix);
    }

    public void set2produit1(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void set2produit2(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void set2produit3(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libele='" + libele + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }

    public void afficher2() {
        System.out.println("identifiant:" + identifiant + "; libele:" + libele + "; marque:" + marque + "; prix:" + prix);
    }

    public void afficher3() {
        System.out.println("identifiant:" + identifiant + "; libele:" + libele + "; marque:" + marque + "; prix:" + prix + "; date d'expiration:" + dateExpiration);
    }


    public boolean comparer(Produit p) {
        if ((this.identifiant == p.identifiant) && (this.libele.equals(p.libele)) && (this.prix == p.prix)) {
        return true;
    }
    return false;

    }
    public boolean comparer (Produit p1 , Produit p2 ){
        if ((p1.identifiant== p2.identifiant) && (p1.libele.equals(p2.libele)) && (p1.prix == p2.prix))
        {
            return true;
        }
        return false;
    }
    public void setPrix(double prix) {
        if (prix < 0) {
            System.out.println("!!!!!!!!!! le prix ne peut pas être négatif !!!!!!!!");
            this.prix = 0;
        } else {
            this.prix = prix;
        }
    }

}










