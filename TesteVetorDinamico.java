import java.util.Random;

public class TesteVetorDinamico {
  public static void main(String[] args) throws InterruptedException{
    VetorDinamico v = new VetorDinamico();
    Random gerador = new Random();
    for (int i = 0; i < 10; i++){
      v.adicionar(gerador.nextInt(6) + 1);
    }
    while (true){
      double oQueFazer = gerador.nextDouble();
      if (oQueFazer <= 0.35){
        int elemento = 1 + gerador.nextInt(6);
        v.adicionar(elemento);
      }
      else{
        v.remover();
      }
      v.exibir();
      //catch or declare
      Thread.sleep(2000);
      System.out.println("==========================================================");
    }
  }
}
