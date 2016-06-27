// Déclaration du package
package BATAILLENAVALE;

// class Element
public class Element {
    private int abcisse;
    private int ordonnee;
    private String etat;
    
    // grille
    public Element(int i, int j) {
        abcisse=i;
        ordonnee=j;

	// état de base
        etat="intact";
    }

    public int getabcisse(){
        return abcisse;
    }

    public int getordonnee(){
        return ordonnee;
    }

    // changement d'état : intacte > abimé ; abimé > détruit
    public void touche(int i , int j) {
    if(abcisse==i && ordonnee==j) {
        if(etat=="intact"){
            etat="abime";
        }else if(etat=="abime")
            etat="detruit";
        }
    }


    public void avancer(int i,int j){
        if((i>=-1) && (i<=1) && (j>=-1) && (j<=1)){
            abcisse+=i;
            ordonnee+=j;
        }
    }

    // récupère la variable etat
    public String getEtat(){
        return etat;
    }

    // On affiche l'état du bateau
    public String toString() {
        String s="";
        if(etat=="intact"){
            s="i";
        }else{
            if(etat=="abime"){
                s="a";
            }else{
                s="d";
            }
            
        }
        return s;
    }
     
}
