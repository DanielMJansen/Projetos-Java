/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExElevador;

/**
 *
 * @author danie
 */
public class Elevador {

    int andaratual, totalandares, capacidade, pessoas;

    public Elevador(int totalandares, int capacidade) {
        this.totalandares = totalandares;
        this.capacidade = capacidade;
        this.pessoas = 0;
        this.andaratual = 0;
    }

    public int getAndaratual() {
        return andaratual;
    }

    public void setAndaratual(int andaratual) {
        this.andaratual = andaratual;
    }

    public int getTotalandares() {
        return totalandares;
    }

    public void setTotalandares(int totalandares) {
        this.totalandares = totalandares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public void Inicializa() {
        if (andaratual == 0) {
            System.out.println("Elevador em funcionamento, contendo " + pessoas + " pessoas dentro, no terreo");
        } else {
            System.out.println("Elevador em funcionamento, contendo " + pessoas + " pessoas dentro, no andar " + andaratual);
        }
    }

    public void Entra(int addpessoa) {
        if (addpessoa > (getCapacidade() - getPessoas())) {
            System.out.println("Capacidade maxima atingida");
        } else {
            setPessoas(getPessoas() + addpessoa);
            System.out.println("Entraram " + addpessoa + " pessoas no elevador. Atualmente estao presentes " + getPessoas() + " pessoas no elevador.");
        }
    }

    public void Sai(int removepessoa) {
        if (removepessoa > getPessoas() || (getPessoas() - removepessoa) < 0) {
            System.out.println("Erro! Nao e possivel sairem mais pessoas do que estao dentro do Elevador.");
        } else {
            setPessoas(getPessoas() - removepessoa);
            System.out.println("Foram removida(s) " + removepessoa + " pessoa(s) do elevador. Atualmente estao presentes " + getPessoas() + " pessoas no elevador." );
        }

    }

    public void Sobe(int quantidade) {
        if ((getAndaratual() + quantidade) > getTotalandares()) {
            System.out.println("Erro! O elevador nao pode subir acima do seu ultimo andar.");
        } else {
            setAndaratual(getAndaratual() + quantidade);
            System.out.println("O elevador se encontra no" + getAndaratual() + " andar" );
        }
    }

    public void Desce(int quantidade) {
        if ((getAndaratual() - quantidade) < 0) {
            System.out.println("Erro! O elevador nao pode descer abaixo do terreo");
        } else {
            setAndaratual(getAndaratual() + quantidade);
            System.out.println("O elevador se encontra no" + getAndaratual() + " andar" );
        }
    }

}
