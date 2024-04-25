public class TiposPrimitivos {
public static void main(String[] args) {
  
  int numero = 4;
  int outroNumeroIgual = numero;
  numero = numero + 5;

  System.out.println(numero);
  System.out.println(outroNumeroIgual);

  int numero1 = 256;
  int numero2 = 128;
  int repetindoNumero1 = numero1;
  numero1 = numero1 + numero2 + 7 + repetindoNumero1;

  System.out.println(numero1);
  System.out.println(numero2);
  System.out.println(repetindoNumero1);
}
}
