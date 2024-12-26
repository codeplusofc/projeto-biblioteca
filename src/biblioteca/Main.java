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
                    break;
                    
                case 2:
                    System.out.println("Cadastrando usuario");
                    System.out.println("Digite o seu nome");
                    locacao.getObjUsuario().setNome(scan.next());
                    System.out.println("Digite o seu codigo");
                    locacao.getObjUsuario().setCodigo(scan.nextInt());
                    System.out.println("Digite o seu cpf");
                    locacao.getObjUsuario().setCpf(scan.nextLong());
                    System.out.println("DADOS DO USUARIO");
                    System.out.println(locacao.getObjUsuario().toString());
                    break;

                case 3:
                    System.out.println("Cadastrando Livro");

                    System.out.println("Digite o titulo");
                    scan.nextLine();
                    locacao.getObjLivro().setTitulo(scan.nextLine());

                    System.out.println("Digite o genero");
                    locacao.getObjLivro().setGenero(scan.nextLine());

                    System.out.println("Digite o autor");
                    locacao.getObjLivro().setAutor(scan.nextLine());
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
