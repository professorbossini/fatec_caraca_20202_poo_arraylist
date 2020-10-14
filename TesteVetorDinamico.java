import java.util.Random;

public class TesteVetorDinamico {
  public static void main(String[] args) throws InterruptedException{
    VetorDinamico v = new VetorDinamico();
    Random gerador = new Random();
    while (true){
      int elemento = 1 + gerador.nextInt(6);
      v.adicionar(elemento);
      v.exibir();
      //catch or declare
      //Thread.sleep(3000);
      System.out.println("==========================================================");
    }
  }
}
