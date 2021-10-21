package main;

import model.Folheto;
import model.FolhetoFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicativo {

    public static void main(String[] args) {
        int opt = 1;
        Scanner in = new Scanner(System.in);
        ArrayList<Folheto> folhetos = new ArrayList<>();
        Folheto folheto;
        do {
            System.out.println("1 - Criar novo folheto\n2 - Mostrar folhetos disponiveis\n0 - Sair");
            opt = Integer.parseInt(in.nextLine());
            switch (opt) {
                case 1:
                    System.out.println("Digite o nome, largura, altura, imagem e quantidade dos folhetos separados por enter");
                    folheto = FolhetoFactory.getFolhetoTemplate(in.nextLine(),
                            Float.parseFloat(in.nextLine()),
                            Float.parseFloat(in.nextLine()),
                            in.nextLine(),
                            Integer.parseInt(in.nextLine()));
                    folhetos.add(folheto);
                    break;
                case 2:
                    for(Folheto aux:folhetos) {
                        System.out.println(aux.toString());
                    }
            }


        } while (opt != 0);
    }
}
