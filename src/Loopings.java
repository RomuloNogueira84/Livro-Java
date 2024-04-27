public class Loopings {
  public static void main(String[] args) {
    double soma = 0;
    int contador = 0;
    while (contador < 35) {
      double valorDoLivro = 59.99;
      soma = soma + valorDoLivro;
      // soma += valorDoLivro;
      // codigo mais enxuto usando o operador de atribuição.+=
      contador = contador + 1;
      // tambem poderiamos ter usado o operador unario aqui no caso ++. ficaria
      // contador++
    }
    System.out.println("O total de nosso estoque é " + soma);

    if (soma < 150) {
      System.out.println("O estoque está muito baixo");
    } else if (soma >= 2000) {
      System.out.println("Seus estoque está abastecido");
    } else {
      System.out.println("Seu estoque está bom");
    }

  }
}
