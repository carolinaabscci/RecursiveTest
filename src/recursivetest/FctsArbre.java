/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivetest;

/**
 *
 * @author Wolfy
 */
public class FctsArbre { //L'ensemble est statique puisque la recursivité est étudiée sous sa forme fonctionnelle !
    public static enum parcours {prefixe,infixe, postfixe};
    public static boolean estVide(Arbre a){
        boolean estVide = false;
        if (a == null){
            estVide = true;
        }
        return estVide;
    }
    
    public static void ajouterNoeud(){
        
    }
    
    public static void supprimerNoeud(){
        
    }
    
    public static void afficherArbre(Arbre a, parcours p) {
       
        if (a != null) {

            switch (p) {
                case prefixe:
                    System.out.print("-" + a.valeur + "-");
                    if (a.gauche != null) {
                        afficherArbre(a.gauche, p);
                    }
                    if (a.droite != null) {
                        afficherArbre(a.droite, p);
                    }
                    break;
                    
                case infixe:
                    if (a.gauche!=null){
                        afficherArbre(a.gauche,p);
                    }
                    System.out.print("-" + a.valeur + "-");
                    if (a.droite != null) {
                        afficherArbre(a.droite, p);
                    }
                    break;
                
                case postfixe:
                    if (a.gauche != null) {
                        afficherArbre(a.gauche, p);
                    }
                    if (a.droite != null) {
                        afficherArbre(a.droite, p);
                    }
                    System.out.print("-" + a.valeur + "-");
                    break;    
                 
            }
        }
    }

    
    public static int nbNiveaux(){
        return 0;
    }
    
    public static int nbNoeuds(Arbre a){
        return 0;
    }
    
    public static int nbFeuilles(){
        return 0;
    }
}
