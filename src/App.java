public class App {
    public static void main(String[] args){

        Queen queenB = new Queen (2,4);
        Queen queenW = new Queen(4, 6); 

        QueenCanAttack(queenW.r, queenW.c, queenB.r, queenB.c);
    
    }
    public static void QueenCanAttack(int wr, int wc , int br , int bc) {
        if (wr == br){
            System.out.println("Can attack");
        }
 
        else if (wc == bc){
            System.out.println("Can attack");
        }
    
        else if ((wr - br) == (wc - bc)){
            System.out.println("Can attack");
        }
    
        else{
            System.out.println("Can't attack");
        }
    }
}
class Queen {
    int r;
    int c;
    Queen(int r,int c){
        this.r = r;
        this.c = c ;
        position(this.r, this.c);

    }
    public void position (int r, int c){
        if (r<0){
                System.out.println ("Queen position must have positive row." );
            }
        else if (r > 7){ 
                System.out.println ("Queen position must have row <=7.");
            }
        else if (c<0){
                System.out.println ("Queen position must have positive column.");
            }
        else if (c > 7){
                System.out.println ("Queen position must have column <+7.");
            }
        else{
        }
    }
}