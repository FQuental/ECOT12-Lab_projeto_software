import java.util.*;

public class CampoMinado {

    public CampoMinado(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j<10; j++){
                visual[i][j] = '?';
                game[i][j] = ' ';
            }
        }
    }

    public int getDefuse() {
        return defuse;
    }
    public void setDefuse(int defuse) {
        this.defuse = defuse;
    }
    public void setEnd(boolean end) {
        this.end = end;
    }

    private char[][] visual = new char[10][10];
    private char[][] game = new char[10][10];
    public boolean end;
    public int defuse;



    public static void main(String[] args) throws Exception {
        CampoMinado match = new CampoMinado();
        match.startGame();


        
    }
}
