public class Bateau {
    private boolean horizontal;
    private Element[] element;
    public Bateau(int x, int y, boolean h,int taille) {
        horizontal=h;
        element=new Element[taille];
        if(horizontal){
            for(int i=0;i<taille;i++){
                element[i]=new Element(x+i,y);
            }
        }else{
            
    }
    

