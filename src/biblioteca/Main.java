package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locacao locacao = new Locacao();
        Scanner scan = new Scanner(System.in);

        byte op = 0;

        do {
            System.out.println("\n=============================================");
            System.out.println("            SISTEMA DE BIBLIOTECA           ");
            System.out.println("=============================================");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("[1] - Cadastrar Funcionário");
            System.out.println("[2] - Cadastrar Usuário");
            System.out.println("[3] - Cadastrar Livro");
            System.out.println("[4] - Mostrar Todos os Dados do Cadastro");
            System.out.println("[5] - Ir para Locação");
            System.out.println("[0] - Sair");
            System.out.print("Digite a opção desejada: ");

            op = scan.nextByte();
            System.out.println("=============================================");

            switch (op) {
                case 1:
                    System.out.println("Cadastrando Funcionário...");
                    System.out.print("Digite o nome do funcionário: ");
                    locacao.getObjFuncionario().setNome(scan.next());
                    System.out.print("Digite o CPF do funcionário: ");
                    locacao.getObjFuncionario().setCpf(scan.nextLong());
                    System.out.print("Digite o cargo do funcionário: ");
                    locacao.getObjFuncionario().setChapa(scan.next());
                    System.out.println("Funcionário cadastrado com sucesso!\n");
                    break;
                case 2:
                    System.out.println("Cadastrando Usuário...");
                    System.out.print("Digite o nome do usuário: ");
                    locacao.getObjUsuario().setNome(scan.next());
                    System.out.print("Digite o código do usuário: ");
                    locacao.getObjUsuario().setCodigo(scan.nextInt());
                    System.out.print("Digite o CPF do usuário: ");
                    locacao.getObjUsuario().setCpf(scan.nextLong());
                    System.out.println("Usuário cadastrado com sucesso!\n");
                    break;
                case 3:
                    System.out.println("Cadastrando Livro...");
                    System.out.print("Digite o título do livro: ");
                    scan.nextLine();
                    locacao.getObjLivro().setTitulo(scan.nextLine());

                    System.out.print("Digite o gênero do livro: ");
                    locacao.getObjLivro().setGenero(scan.nextLine());

                    System.out.print("Digite o autor do livro: ");
                    locacao.getObjLivro().setAutor(scan.nextLine());
                    System.out.println("Livro cadastrado com sucesso!\n");
                    break;
                case 4:
                    System.out.println("Mostrando Dados do Cadastro...");
                    System.out.println("Funcionalidade em desenvolvimento...\n");
                    break;
                case 5:
                    System.out.println("Indo para a locação...");
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.\n");
            }
        } while (op != 0);
    }
}