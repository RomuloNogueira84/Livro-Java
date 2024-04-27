/**
 * CalculadoraDeEstoque
 */
// O conteudo aqui foi referente a variável.
public class CalculadoraDeEstoque {

  public static void main(String[] args) {
    double livroJava8 = 59.90;
    double livroTdd = 59.90;
    double somaDeLivros = livroJava8 + livroTdd;

    System.out.println(" A soma dos livros no estoque é: " + somaDeLivros);

    if (somaDeLivros < 150) {
      System.out.println("Seu estoque está precisando de abastecimento ");
    } else if (somaDeLivros >= 2000) {
      System.out.println("Estamos com os estoques muito abastados");
    } else {
      System.out.println("Seu estoque está com numeros satisfatórios");
    }

  }
}