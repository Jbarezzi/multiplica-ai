import java.util.Scanner;

public class MultiplicaAi {
  public static void main(String[] args) throws Exception {
    Integer initialValue = 1;

    Scanner input = new Scanner(System.in);
    System.out.println("Digite um número para receber sua tabuada:");
    Integer userInt = Integer.parseInt(input.next());

    System.out.println("Tabela de multiplicação de " + userInt);

    while(initialValue <= 10) {
      Integer result = userInt * initialValue;
      System.out.println(result);
      initialValue++;
    }
  }
}
