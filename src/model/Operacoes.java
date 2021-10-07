package model;

import java.util.Scanner;

public class Operacoes {
    Pessoa pen = new Pessoa();
    Scanner ler = new Scanner(System.in);

    public void formulario() {
        System.out.println("Digite o seu nome: ");
        pen.setNome(ler.nextLine());
        do {
            System.out.println("\nDigite o seu telefone: (Sugestão -> 051986219204 )");
            pen.setTelefone(ler.nextLine());
            if (pen.getTelefone().length() != 12) {
                System.out.println("Telefone inválido. Tente Novamente!");
            }
        } while (pen.getTelefone().length() != 12);

        boolean cpfValido = false;
        do {
            System.out.println("\nQual seu CPF ");
            pen.setCpf(ler.nextLine());
            if (ValidarCPF.isCPF(pen.getCpf()) == true) {
                cpfValido = true;
                System.out.println("\n" + ValidarCPF.imprimeCPF(pen.getCpf()));

            } else System.out.println("Erro, CPF invalido!!\n");

        } while (cpfValido != true);

        //IDADE
        do {

            System.out.println("Digite a sua idade: ");
            pen.setIdade(ler.nextInt());
            if (pen.getIdade() < 18) {
                System.out.println("Você não tem idade suficiente para alugar um carro");
            }
        } while (pen.getIdade() < 18);


        do {
            System.out.println("Escreva o limite do cartão: ");
            pen.setCartaoDeCredito(ler.nextInt());
            if (pen.getCartaoDeCredito() < 500) {
                System.out.println("Compra inválida, saldo insuficiente ");
            }
        } while (pen.getCartaoDeCredito() < 500);

    }

    public String menuDeVeiclo(){
        //MENU VEICLO
        int menuVeiclo;
        String carro = "Algo deu Errado";

        System.out.println("Escolha o seu carro:");
        System.out.println("\n1- Audi\n2- Tesla\n3- Ferrari\n4- Sair");
        menuVeiclo = ler.nextInt();

        switch (menuVeiclo) {
            case 1:
                System.out.println("\n1- Automatico\n2- Manual");
                int automotivo = ler.nextInt();

                switch (automotivo){
                    case 1:
                        System.out.println("\nCores disponpiveis\n1- Cinza\n2- preto\n3- Roxo");
                        int corCarroAutomatico = ler.nextInt();
                        switch (corCarroAutomatico){
                            case 1:
                                String automatico = "\nNome: Audi\nModelo: Automatico\nCor: Cinza";
                                pen.setVeiculo(automatico);
                                break;
                            case 2:
                                String manual = "\nNome: Audi\nModelo: Automatico\nCor: Preto";
                                pen.setVeiculo(manual);
                                break;
                            case 3:
                                String manuall = "\nNome: Audi\nModelo: Automatico\nCor: Roxo";
                                pen.setVeiculo(manuall);
                                break;
                            default:
                        }

                        break;
                    case 2:
                        System.out.println("\nCores disponpiveis\n1- Cinza\n2- preto\n3- Roxo");
                        int corCarroCorManual = ler.nextInt();
                        switch (corCarroCorManual){
                            case 1:
                                String automatico = "\nNome: Audi\nModelo: Manual\nCor: Cinza";
                                pen.setVeiculo(automatico);
                                break;
                            case 2:
                                String manual = "\nNome: Audi\nModelo: Manual\nCor: Preto";
                                pen.setVeiculo(manual);
                                break;
                            case 3:
                                String manuall = "\nNome: Audi\nModelo: Manual\nCpr: Roxo";
                                pen.setVeiculo(manuall);
                                break;
                            default:
                        }
                        break;
                    default:
                }
                //termina automotico de audi

                break;
            case 2:
                System.out.println("\n1- Automatico\n2- Manual");
                int automotivoTesla = ler.nextInt();
                switch (automotivoTesla){
                    case 1:
                        System.out.println("\nCores disponpiveis\n1- Branco\n2- Azul");
                        int corCarroBranco = ler.nextInt();
                        switch (corCarroBranco){
                            case 1:
                                String automatico = "\nNome: Tesla\nModelo: Automatico\nCor: Branco";
                                pen.setVeiculo(automatico);
                                break;
                            case 2:
                                String manual = "\nNome: Tesla\nModelo: Automatico\nCor: Azul";
                                pen.setVeiculo(manual);
                                break;
                            default:
                        }
                        break;
                    case 2:
                        System.out.println("\nCores disponpiveis\n1- Branco\n2- Azul\n3- Roxo");
                        int corCarroAzul = ler.nextInt();
                        switch (corCarroAzul){
                            case 1:
                                String automatico = "\nNome: Tesla\nModelo: Manual\nCor: Branco";
                                pen.setVeiculo(automatico);
                                break;
                            case 2:
                                String manual = "\nNome: Tesla\nModelo: Manual\nCor: Azul";
                                pen.setVeiculo(manual);
                                break;
                            case 3:
                                String manuall = "\nNome: Tesla\nModelo: Manual\nCor: Roxo";
                                pen.setVeiculo(manuall);
                                break;
                            default:
                        }
                        break;
                    default:
                }
                //termina automotico de audio
                break;
            case 3:
                System.out.println("\n1- Automatico\n2- Manual");
                int automotivoFerrari = ler.nextInt();
                switch (automotivoFerrari){
                    case 1:
                        System.out.println("\nCores disponpiveis\n1- Bege\n2- preto\n3- Roza");
                        int corCarroCorManual = ler.nextInt();
                        switch (corCarroCorManual){
                            case 1:
                                String automatico = "\nNome: Ferrari\nModelo: Manual\nCor: Bege";
                                pen.setVeiculo(automatico);
                                break;
                            case 2:
                                String manual = "\nNome: Ferrari\nModelo: Manual\nCor: Preto";
                                pen.setVeiculo(manual);
                                break;
                            case 3:
                                String manuall = "\nNome: Ferrari\nModelo: Manual\nCor: Roza";
                                pen.setVeiculo(manuall);
                                break;
                            default:
                        }
                        break;
                    case 2:
                        System.out.println("\nCores disponpiveis\n1- Bege\n2- preto\n3- Roza");
                        int corCarroCorAutomatico = ler.nextInt();
                        switch (corCarroCorAutomatico){
                            case 1:
                                String automatico = "\nNome: Ferrari\nModelo: Manual\nCor: Bege";
                                pen.setVeiculo(automatico);
                                break;
                            case 2:
                                String manual = "\nNome: Ferrari\nModelo: Manual\nCor: Preto";
                                pen.setVeiculo(manual);
                                break;
                            case 3:
                                String manuall = "\nNome: Ferrari\nModelo: Manual\nCor: Roza";
                                pen.setVeiculo(manuall);
                                break;
                            default:
                        }
                        break;
                    default:
                }
                //termina automotico de audi
                break;
            case 4:

                break;
            default:
        }

        return carro;
    }

    public String cidadeRetirarVeiculo(){
        System.out.println("Escolha o local de retirada do seu carro: ");
        System.out.println("\n1 - Canoas\n2 - Porto Alegre\n3 - Novo Hamburgo\n4 - Gramado");

        int retirada = ler.nextInt();
        String cidade = "Algo deu errado";

        do {

            switch (retirada){
                case 1:
                    String canoas = "Canoas";
                    pen.setCidade(canoas);
                    break;
                case 2:
                    String portoAlegre = "Porto Alegre";
                    pen.setCidade(portoAlegre);
                    break;
                case 3:
                    String novoHamburgo = "Novo Hamburgo";
                    pen.setCidade(novoHamburgo);
                    break;
                case 4:
                    String gramado = "Gramado";
                    pen.setCidade(gramado);
                    break;
                default:
                    break;

            }
            if (retirada <1 && retirada >4){
                System.out.println("Inválido, selecione novamente");
            }
        }while (retirada <1 && retirada >4);
        return pen.getCidade();
    }

    // Começa os calculos
    public double calcularDiaria(){

        System.out.println("Informe a quantidade de dias que deseja locar o carro: ");
        pen.setDia(ler.nextInt());

        double diaria = 189.34;
        pen.setValorDiario(diaria * pen.getDia());

        do {
            if (pen.getDia() <1 || pen.getDia() >30){
                System.out.println("O Período mínimo de locação é de uma diária de 24h!");
                System.out.println("O Período maximo de locação é de 30 diárias!");
            }
        }while (pen.getDia() <1 && pen.getDia() >30);

        return pen.getValorDiario();
    }

    public double calcularHoraExtra(){
        double dias = this.pen.getDia();
        double idade = this.pen.getIdade();

        System.out.println("\nDeseja adicionar hora Extra? (Pode apenas adicionar 1 hora a mais:\n24 Anos pra cima (Inclui R$122.34)\n18 á 23(Inclui R$ 134.25) \n1- Sim\n2- Não");
        int menu = ler.nextInt();
        switch (menu){
            case 1:

                if(idade >=24){
                    pen.setHorasExtras(pen.getValorDiario() + 122.34);
                }else if (idade >= 18 || idade <= 23){
                    pen.setHorasExtras(pen.getValorDiario() + 135.25);
                }

                break;
            case 2:
                System.out.println("\nSem Horas extras");
                break;
            default:
                break;
        }

        return pen.getHorasExtras();
    }

    public double calcularTaxa(){

        double idade = this.pen.getIdade();
        if( idade >=24){
            pen.setTaxa(pen.getValorDiario() * 0.12);
        }else if (idade <= 23){
            pen.setTaxa(pen.getValorDiario() * 0.15);
        }
        return pen.getTaxa();
    }

    public double calcularProtecao(){
        System.out.println("\nDeseja adicionar proteção completa? \n24 Anos pra cima (Inclui R$24.00/Diaria)\n18 á 23(Inclui R$ 32.00/diaria)\n1- Sim\n2- Não");
        double idade = this.pen.getIdade();

        int menu = ler.nextInt();
        switch (menu){
            case 1:

                if(idade >=24){
                    pen.setValorProtecao(pen.getDia() * 29);
                }else if (idade >= 18 || idade <= 23){
                    pen.setValorProtecao(pen.getDia() * 32);
                }

                break;
            case 2:
                System.out.println("\nSem proteção");
                break;
            default:
                break;
        }

        return pen.getValorProtecao();
    }

    public double calcularAcessorio(){
        System.out.println("\nVocê deseja obter o pacote de acessórios? Custo adicional de R$25,00 \n(Cadeira de Bebê, Assento de Elevacão, Proteção a pneus e vidros\n1- Sim\n2- Não)");
        int menu = ler.nextInt();

        switch (menu){
            case 1:
                pen.setValorAcessorio(25);

                break;
            case 2:
                System.out.println("Sem acessório.");
                break;
            default:
        }


        return pen.getValorAcessorio();
    }

    public void calcularTotal() {

        if (pen.getIdade() >= 24) {
            pen.setValorTotal(pen.getValorDiario() + pen.getTaxa() + pen.getHorasExtras() + pen.getValorProtecao() + pen.getValorAcessorio());
            System.out.println("\nValor total: " + pen.getValorTotal());
        } else if (pen.getIdade() >= 18 || pen.getIdade() <= 23) {
            pen.setValorTotal(pen.getValorDiario() + pen.getTaxa() + pen.getHorasExtras() + pen.getValorProtecao() + pen.getValorAcessorio());
            System.out.println("\nValor total: " + pen.getValorTotal());
        } else {
            System.out.println("\nOPS.. algo deu errado");
        }

            System.out.println("\nDeseja continuar a compra?\n1- Sim\n2- Não");
            int menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Compra realizada!\nValor R$"+pen.getValorTotal());
                    System.exit(0);
                    break;
                case 2:
                    System.out.println("\nMe fez de troucha e agora que cancelar a venda");
                    System.exit(0);
                    break;
                default:
            }

        }


    // Termina os calculos


    public String mostrarDados(){

        System.out.println("\nNome: "+pen.getNome()+
                "\nTelefone: "+pen.getTelefone()+
                "\nCPF: "+pen.getCpf()+
                "\nIdade: "+pen.getIdade()+
                "\ncartão: "+pen.getCartaoDeCredito()+
                "\n--------------------------------------------"+
                "\nSeu Veiclo: "+pen.getVeiculo()+
                "\nCidade de retirada: "+pen.getCidade()+
                "\nDias que vai alugar o veiculo: "+pen.getDia()+
                "\nValor horas Extras R$ "+pen.getHorasExtras()+
                "\nProteção: "+pen.getValorProtecao()+
                "\nAcessórios: "+pen.getValorAcessorio());

        return null;
    }
}