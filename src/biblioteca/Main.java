package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locacao locacao =new Locacao();
        Scanner scan = new Scanner(System.in);

        byte op =0;

        do {
            System.out.println("Escolha uma opção abaixo\n" +
                    "[1] - Cadastrar funcionário\n" +
                    "[2] - Cadastrar usuário\n" +
                    "[3] - Cadastrar livro\n" +
                    "[4] - Mostrar todos os dados do cadastro\n" +
                    "[5] - Ir para locação \n" +
                    "[0] - Sair\n" +
                    "Digite aqui a opção: ");

            op = scan.nextByte();

            switch (op){
                case 1:
                    System.out.println("Cadastrando funcionario");

                    System.out.println("Digite seu nome: ");
                    locacao.getObjFuncionario().setNome(scan.next());
                    System.out.println(locacao.getObjFuncionario().getNome());
                    break;
                    
                case 2:
                    System.out.println("Cadastrando usuario");
                    break;
                case 3:
                    System.out.println("Cadastrando Livro");
                    break;
                case 4:
                    System.out.println("Mostrar dados de cadastro");
                    break;
                case 5:
                    System.out.println("Indo para locação");
                    break;
                default:
                    System.out.println("Digite uma opcao valida");

            }
        }while(op != 0);

    }
}
