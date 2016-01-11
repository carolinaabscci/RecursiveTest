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
public class Arbre {
    public int valeur=-9999;
    public Arbre gauche;
    public Arbre droite;
    
    public Arbre (){
        this.gauche = null;
        this.droite = null;
    }

    public Arbre (int valeur){
        this.gauche = null;
        this.droite = null;
        this.valeur = valeur;
    }
    
    public Arbre (Arbre gauche, Arbre droite){
        this.droite = droite;
        this.gauche = gauche;
    }
    
    public Arbre (int valeur,Arbre gauche, Arbre droite){
        this.droite = droite;
        this.gauche = gauche;
        this.valeur=valeur;
    }
    
    public void setGaucheDroite(Arbre gauche, Arbre droite){
        this.gauche = gauche;
        this.droite = droite;
    }
    
   
    
}
