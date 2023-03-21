package br.edu.unifei.ecot12.mineweeper;
import MineWeeper;

public class App {
    public static void main(String[] args) throws Exception {
        MineWeeper match = new MineWeeper();
        while(getEnd()!= true){
            match.imprime();
            match.defuse();
        }
    }

}