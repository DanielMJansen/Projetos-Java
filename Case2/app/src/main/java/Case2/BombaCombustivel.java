package Case2;

import java.util.Scanner;

public class BombaCombustivel {

    String tipocombustivel;
    float valorlitro;
    float qtdcombustivel;

    Scanner leitor = new Scanner(System.in);
    
    public BombaCombustivel(String tipocombustivel, float valorlitro, float qtdcombustivel){
        this.tipocombustivel = tipocombustivel;
        this.valorlitro = valorlitro;
        this.qtdcombustivel = qtdcombustivel;
    }

    public String getTipocombustivel() {
        return tipocombustivel;
    }

    public void setTipocombustivel(String tipocombustivel) {
        this.tipocombustivel = tipocombustivel;
    }

    public float getValorlitro() {
        return valorlitro;
    }

    public void setValorlitro(float valorlitro) {
        this.valorlitro = valorlitro;
    }

    public float getQntcombustivel() {
        return qtdcombustivel;
    }

    public void setQntcombustivel(float qtdcombustivel) {
        this.qtdcombustivel = qtdcombustivel;
    }

    public void AbastecerPorLitro(float quantidade) {
        float qtdatual = getQntcombustivel();
        if (quantidade <= 0) {
            System.out.println("Quantidade digitada incorretamente.");
        } else {
            float valortotal = (quantidade * valorlitro);
            System.out.println("Para abastecer " + quantidade + " litros de " + getTipocombustivel() + " custarao " + valortotal + " reais. Voce deseja prosseguir? 1 - Sim/2 - Não");
            char valida = leitor.next().charAt(0);
            if (valida == 'S' || valida == '1') {
                alterarQuantidadeCombustivel(qtdatual - quantidade);
                System.out.println("Voce abasteceu.");
            } else {
                System.out.println("Voce nao abasteceu.");
            }
        }
    }
    
    public void AbastecerPorValor(float valor) {
        float valorlitro = getValorlitro();
        float qtdatual = getQntcombustivel();
        if (valor <= valorlitro) {
            System.out.println("Valor digitado incorretamente.");
        } else {
            float quantidade = (valor/valorlitro);
            float valortotal = (quantidade * valorlitro);
            System.out.println("Para abastecer " + quantidade + " litros de " + getTipocombustivel() + " custarao " + valortotal + " reais. Voce deseja prosseguir? 1 - Sim/2 - Não");
            char valida = leitor.next().charAt(0);
            if (valida == 'S' || valida == '1') {
                alterarQuantidadeCombustivel(qtdatual - quantidade);
                System.out.println("Voce abasteceu.");
            } else {
                System.out.println("Voce nao abasteceu.");
            }
        }
    }

    public void alterarQuantidadeCombustivel(float quantidade) {
        if (quantidade > 0){
            System.out.println("A quantidade anterior de combustivel era de " + getQntcombustivel() + " litros.");
            float qtdatual = getQntcombustivel();
            setQntcombustivel(quantidade);
            System.out.println("A quantidade atual de combustivel e de " + getQntcombustivel() + " litros.");
        }
    }
    
    public void alterarCombustivel() {
        if (tipocombustivel == "Gasolina"){
            setTipocombustivel("Alcool");
        }else{
            setTipocombustivel("Gasolina");
        }
    }
    
    public void alterarValor(float valor) {
        if (valor > 0){
            setValorlitro(valor);
        }else{
            System.out.println("Valor incorreto.");
        }
    }
    
}
