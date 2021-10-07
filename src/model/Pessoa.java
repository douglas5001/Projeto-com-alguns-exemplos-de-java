package model;

public class Pessoa {

    private String nome;
    private int idade;
    private int dia;
    private double valorDiario;
    private double valorProtecao;
    private double valorHoraExtra;
    private double valorAcessorio;
    private double valorTotal;
    private double taxa;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getValorAcessorio() {
        return valorAcessorio;
    }

    public void setValorAcessorio(double valorAcessorio) {
        this.valorAcessorio = valorAcessorio;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public double getValorProtecao() {
        return valorProtecao;
    }

    public void setValorProtecao(double valorProtecao) {
        this.valorProtecao = valorProtecao;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    private double horasExtras;
    public double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(double valorDiario) {
        this.valorDiario = valorDiario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String cpf;

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    private String telefone;
    private String veiculo = "Algo deu errado";

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private double CartaoDeCredito = 500;
    private String cidade = "Algo deu Errado";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public double getCartaoDeCredito() {
        return CartaoDeCredito;
    }

    public void setCartaoDeCredito(double cartaoDeCredito) {
        CartaoDeCredito = cartaoDeCredito;
    }
}