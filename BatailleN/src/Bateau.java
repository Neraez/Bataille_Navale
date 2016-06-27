//Classe bateau
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
        	for(int i=0;i<taille;i++){
                element[i]=new Element (x,y+i);
            }
        }
    }
    public void avancer(int x,int y){
        for(int i=0;i<element.length;i++){
            element[i].avancer(x,y);
        }
    }
    public void touche(int x, int y){
        for(int i=0;i<element.length;i++){
            element[i].touche(x,y);
        }
    }
    public boolean estdetruit(){
        boolean res=true;
        int i=0;
        while((i<element.length)&&res){
            res=(res)&&(element[i].getEtat()=="detruit");
            i++;
        }
        return res;
    }
    public String toString(){
        String s="("+element[0].getabcisse()+","+element[0].getordonnee()+")";
        for(int i=0;i<element.length;i++)
            s+=element[i].toString();
        return s;
    		}
	}
    

