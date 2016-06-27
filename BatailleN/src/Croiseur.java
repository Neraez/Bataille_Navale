public class Croiseur extends Bateau {
    
    public Croiseur(int x, int y, boolean h) {
        super(x,y,h,3);
    }
    public String toString(){
        return "croiseur"+super.toString();
    }
}
