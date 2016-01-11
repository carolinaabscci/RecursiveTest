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
public class TestAlgo {
    public static void main(String[] args) {
        
        //Création de l'arbre suivant :
        //     5
        //   8  12
        //     4  3
             
        Arbre t2 = new Arbre(12,new Arbre(4),new Arbre(3));
        Arbre tree = new Arbre(5,new Arbre(8),t2);
        
        //affichage sous forme infixe
        System.out.println("Arbre par résolution infixe");
        FctsArbre.afficherArbre(tree, FctsArbre.parcours.infixe);
        System.out.println();
        System.out.println();
        
        //test algo  exercice 7.15
        System.out.println("Algo exercice 7.15 (avec x = 3");
        TestAlgo test = new TestAlgo();

        System.out.println(test.lesAsc(tree, 3));
        
    }
    
    
    //J'ai utilisé les string comme séquence
    public String lesAsc(Arbre arbreBin, int x){ 

        if (arbreBin != null) {
            if (arbreBin.valeur == x) {
                return Integer.toString(x);
            } 
            else{
                if (arbreBin != null && lesAsc(arbreBin.gauche, x) != "") {
                    return (Integer.toString(arbreBin.valeur) + "-" + lesAsc(arbreBin.gauche, x));
                }
                else{
                    if (arbreBin != null && lesAsc(arbreBin.droite, x) != "") {
                        return (Integer.toString(arbreBin.valeur) + "-" + lesAsc(arbreBin.droite, x));
                    }
                    else {
                        return "";
                    }
                }
            }
        }
        else {
            return "";
        }
        
    }
}
