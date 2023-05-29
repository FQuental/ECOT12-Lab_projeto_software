package br.edu.unifei.ecot12.mineweeper;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MineWeeper match = new MineWeeper();
        Scanner k = new Scanner(System.in);
        while(match.getEnd() != true){
            match.imprime();
            System.out.println("Write the line number: ");
            int li = k.nextInt();
            System.out.println("Write the colune number: ");
            int co = k.nextInt();
            
            match.defuse(li,co);
            match.imprime();
        }
    k.close();    
    }

}