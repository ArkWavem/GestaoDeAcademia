import models.Academia;
import models.Cliente;
import models.Instrutor;

public class Main {
    public static void main(String[] args) {

        Academia academia = new Academia("GYM Devil Fitness");

        Cliente cliente1 = new Cliente("Carlos Silva", 30, "Premium");
        Cliente cliente2 = new Cliente("Marina Souza", 25, "Básico");
        Cliente cliente3 = new Cliente("Renato Cariane", 48, "Premium++");

        Instrutor instrutor1 = new Instrutor("João Pereira", 40, "Musculção");
        Instrutor instrutor2 = new Instrutor("Ana Costa", 35, "Musculção");
        Instrutor instrutor3 = new Instrutor("Julio Balestrin", 49, "Educação Física");

        academia.adicionarPessoa(cliente1);
        academia.adicionarPessoa(cliente2);
        academia.adicionarPessoa(cliente3);

        academia.adicionarPessoa(instrutor1);
        academia.adicionarPessoa(instrutor2);
        academia.adicionarPessoa(instrutor3);

        academia.listarPessoas();
    }
}