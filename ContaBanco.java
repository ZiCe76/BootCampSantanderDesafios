
public class ContaBanco {

    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    public ContaBanco(int numero, String agencia, String nome, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void imprimirInformacoes() {
         System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é : R$" + saldo);
    }
}

    



    

