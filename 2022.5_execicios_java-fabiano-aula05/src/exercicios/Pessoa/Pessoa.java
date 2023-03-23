package exercicios.Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    public Pessoa(String nome, int idade, float peso, float altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
    }
    public void envelhecer(int anos) {
    this.idade += anos;
    if (this.idade < 21)
    crescer(0.05f);
    }
    public void engordar(float peso) {
    this.peso += peso;
    }
    public void emagrecer(float peso) {
    this.peso -= peso;
    }
    public void crescer(float altura) {
    this.altura += altura;
    }
      @Override
    public String toString() {
    return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" +
    altura + "]";
    }
   

    public static void main(String[] args) { 
    Pessoa a = new Pessoa("Geladeiratezudo", 16, 75, 18);
    System.out.println(a.toString());
    a.envelhecer(1);
    System.out.println(a.toString());
    a.envelhecer(1);
    System.out.println(a.toString());
    a.envelhecer(1);
    System.out.println(a.toString());
    a.envelhecer(1);
    System.out.println(a.toString());
  
    }
  }

    