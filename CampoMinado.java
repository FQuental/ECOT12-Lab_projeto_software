package 03-Lists.lab01.class;
import java.util.*;

public class CampoMinado {

    static int TOTAL_DE_BOMBAS = 10;
    private char[][] visual = new char[10][10];
    private char[][] game = new char[10][10];
    private boolean final;
    private int jogadas;

    public CampoMinado(){
        final = false;
        jogadas = 10;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j<10; j++){
                visual[i][j] = '?';
                game[i][j] = ' ';
            }
        }
    }

    public imrpime(){

    }

    public desarme(int i, int j){

    }

    getfinal(){

    }

    



    public static void main(String[] args) throws Exception {
        CampoMinado match = new CampoMinado();
        match;


        
    }
}
