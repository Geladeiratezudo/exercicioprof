package exercicios.Conta;

public class Conta {
    

private int numero;
private String nome;
private float saldo;
public Conta(int numero, String nome, float saldo)
{
this.numero = numero;
this.nome = nome;
this.saldo = saldo;
}
public Conta(int numero, String nome)
{
this.numero = numero;
this.nome = nome;
this.saldo = 0.0f;
}
public void setNome(String nome) {
this.nome = nome;
}
public void deposito(float valor) {
this.saldo += valor;
}
public void saque(float valor) {
if (this.saldo >= valor) {
this.saldo -= valor;
}
}
@Override
public String toString() {
return "Conta [numero=" + numero + ", nome=" + nome + ", saldo=" + saldo + "]";
}
public static void main(String[] args) {
Conta j = new Conta(123, "geladeira", 70.0f);
System.out.println(j.toString());
j.setNome("biel");
j.deposito(70);
System.out.println(j.toString());
j.saque(210);
System.out.println(j.toString());
}
}