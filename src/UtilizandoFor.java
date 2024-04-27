public class UtilizandoFor {
  public static void main(String[] args) {
    double soma = 0;
    for (double i = 0; i < 35; i++) {
      soma += 59.99;
    }
    System.out.println("O total deste estoque é " + soma);

    for (int i = 0; i <= 10; i++) {
      if (i == 7) {
        continue;
      }
      System.out.println(i);
    }

    for (int i = 0; i <= 10; i++) {
      if (i == 7) {
        break;
      }
      System.out.println(i);
    }

  }
}
