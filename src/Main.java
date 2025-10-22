//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gut
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args) throws Exception {
        Produit produit = new Produit();


        Produit produit1 = new Produit(1021,"lait","delice",0);



        Produit produit2 = new Produit(2510,"yaourt","vitalait",0);



        Produit produit3 = new Produit(3250,"tomate","sicam",1200);

        produit1.afficher();
        produit2.afficher();
        produit3.afficher();

        produit1.setproduit1(0.700);
        produit1.afficher1();

        System.out.println("produits modifier:");
        produit2.setPrix();
        produit1.afficher2();
        produit2.afficher2();


        System.out.println (produit1.toString());
        System.out.println (produit2.toString());
        System.out.println (produit3.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("d/MM/yyyy");
        Date maDate = sdf.parse("1/01/2026");

        Date dateExpiration = sdf.parse("1/01/2026");


        produit1.set2produit1(maDate);
        produit2.set2produit2(maDate);
        produit3.set2produit3(maDate);


        System.out.println("Produits avec leur date d’expiration :");
        produit1.afficher3();
        produit2.afficher3();
        produit3.afficher3();


    }
}