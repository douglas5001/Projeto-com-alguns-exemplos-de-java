package view;

import model.Operacoes;
import model.Pessoa;
import model.ValidarCPF;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Operacoes opera = new Operacoes();
        Pessoa pen = new Pessoa();
        opera.formulario();
        opera.menuDeVeiclo();
        opera.cidadeRetirarVeiculo();
        opera.calcularDiaria();
        opera.calcularHoraExtra();
        opera.calcularProtecao();
        opera.calcularAcessorio();


        int menuPrincipal;
        do {
            System.out.println("\n1- Mostrar dados do cliente: " + "\n2- Valor total a pagar: "+"\n3- "+"\n4- "+"\n5- "+"\n6- ");
            menuPrincipal = ler.nextInt();
            switch (menuPrincipal) {

                case 1:
                    opera.mostrarDados();

                    break;
                case 2:
                    opera.calcularTotal();
                    break;

                default:
            }//fecha o menu
            System.out.println("<<------------SELCIONE OUTRA OPÇÂO-------------->>");
        } while (menuPrincipal != 3);


    }

}