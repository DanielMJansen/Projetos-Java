package Case2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 4.00f, 500f);
        int x;
        do{
        System.out.println("A quantidade atual de " + bomba.getTipocombustivel() + " em tanque e de " + bomba.getQntcombustivel() + ".");
        System.out.println("O valor atual por litro e de R$ " + bomba.getValorlitro() + ".");
        System.out.println("Voce deseja alterar o combustivel, alterar o valor do combustivel, alterar a quantidade total em bomba, abastecer veiculo por valor, alterar veiculo por quantidade, ou sair do programa?\n1 - Alterar tipo de combustivel\n2 - Alterar valor do combustivel\n3 - Alterar quantidade total\n4 - Abastecer por valor\n 5 - Abastecer por quantidade\n 6 - Sair");
        x = leitor.nextInt();
        switch (x) {
            case 1:
                bomba.alterarCombustivel();
                System.out.println("Combustivel alterado para " + bomba.getTipocombustivel());
                break;
            case 2:
                System.out.println("Indique o novo valor de combustivel: ");
                bomba.alterarValor(leitor.nextFloat());
                break;
            case 3:
                System.out.println("Indique a nova quantidade de combustivel na bomba: ");
                bomba.alterarQuantidadeCombustivel(leitor.nextFloat());
                break;
            case 4:
                System.out.println("Digite o valor que deseja abastecer: ");
                bomba.AbastecerPorValor(leitor.nextFloat());
                break;
            case 5:
                System.out.println("Digite a quantidade que deseja abastecer: ");
                bomba.AbastecerPorLitro(leitor.nextFloat());
                break;
            case 6:
                break;
        }
        }while (x != 6);
    }
}
