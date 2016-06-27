public class Escorteur extends Bateau {
    
    /** Creation de l'instance Escorteur */
    public Escorteur(int x, int y, boolean h) {
        super(x,y,h,2);
    }
    public String toString(){
        return "escorteur"+super.toString();
    }
    
}
