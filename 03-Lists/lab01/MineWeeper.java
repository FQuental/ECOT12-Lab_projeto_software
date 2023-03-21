package br.edu.unifei.ecot12.mineweeper;

import java.util.Random;

public class MineWeeper {
    static int TOTAL_BOMBS = 10;
    private char[][] visual = new char[10][10];
    private char[][] game = new char[10][10];
    private boolean end;
    private int moves;

    public MineWeeper(){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                visual[i][j] = '?';
                game[i][j] = ' ';
            }
        }
        Random r = new Random();
        for(int i=0; i< TOTAL_BOMBS; i++){
            int li = r.nextInt(10);
            int cj = r.nextInt(10);
            if(game[li][cj] == ' '){
               game[li][cj] = '*'; 
            }else{
                i--;
            }
        }
    }

    public void imprime(){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.println("["+visual[i][j]+"]");
            }
            System.out.println();
        }
    }

    public boolean getEnd(){
        return end;
    }
    public int getMoves(){
        return moves;
    }

    public void defuse(int line, int colune){
        if(end != true){
            if(visual[line][colune] == '?'){
                visual[line][colune] = game[line][colune];
                moves++;
                if(moves == 90){
                    end = true;
                }
                if(visual[line][colune] == '*'){
                    end = true;
                }
            }
        }
    }



}
