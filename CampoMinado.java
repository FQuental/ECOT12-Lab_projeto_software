import java.util.Random;

public class CampoMinado {
    public static final int TOTAL_BOMBAS=10;
    private char gabarito[][]= new char[10][10];
    private char visual[][]= new char[10][10];
    private int jogadas;
    private boolean fimJogo;

    public CampoMinado(){
        jogadas = 10;
        fimJogo = false;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                visual[i][j] = '?';
                gabarito[i][j] = ' ';
            }
        }
        Random r = new Random();
        for(int i=0; i < TOTAL_BOMBAS; i++){
            int l=r.nextInt(10);
            int c=r.nextInt(10);
            if(gabarito[l][c]==' '){

            gabarito[l][c]='*';
            }else {
                i--;
            }
        }
    }
    public void imprime(){
        for(int i=0; i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print("["+visual[i][j]+"]");
            }
            System.out.println();
        }
    }

    public boolean getFimJogo(){
        return fimJogo;
    }
    public int getJogadas(){
        return jogadas;
    }

    public void desarme(int l, int c){
        if(fimJogo!=true){
           if(visual[l][c]=='?'){
            visual[l][c]=gabarito[l][c];
            jogadas++;
            if(jogadas==90){
                fimJogo=true;
            }
            if(visual[l][c]=='*'){
                fimJogo=true;
            }

           }
        }
    }

}
