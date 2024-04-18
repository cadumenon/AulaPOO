package Models;

public class ContaBancaria {

    private String numeroDaConta;

    private String nomeDoTitular;

    private double saldo;

    public ContaBancaria() {

    }

    public ContaBancaria(String numeroDaConta, String nomeDoTitular, double saldo) {

        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    public void Depositar(double valor) {

        saldo += valor;
        System.out.println("deposito de R$" + valor + "Realizado com sucesso");
    }

    public void Sacar(double valor) {
        if (valor > saldo) {
            System.out.println("saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("saque realizado com sucesso!");
        }
    }
        public void Extrato () {
            System.out.println("Extrato da conta:");
            System.out.println("Nome do titular" + nomeDoTitular);
            System.out.println("Numero da conta:" + numeroDaConta);
            System.out.println("saldo da conta" + saldo);
        }

    }


