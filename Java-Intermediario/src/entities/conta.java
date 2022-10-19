package entities;

public class conta {
    private int conta;
    private String titular;
    private double saldo;

    public conta(String titular, int conta, double saldo) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return this.conta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositoSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void saqueSaldo(double saldo) {
        this.saldo -= saldo;
    }
}