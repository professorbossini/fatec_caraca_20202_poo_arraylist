public class VetorDinamicoGenerico <T> {
  private int capacide;
  private int quantidade;
  private T [] elementos;

  public void adicionar (T e){

  }
}




class TesteVetorDinamicoGenerico{

  public static void main(String[] args) {
    VetorDinamicoGenerico <String> strings = new VetorDinamicoGenerico<>();
    VetorDinamicoGenerico <Item> itensDoJogo = new VetorDinamicoGenerico<>();
    VetorDinamicoGenerico <Girafa> girafasDoJogo = new VetorDinamicoGenerico<>();
  }
}

class Item{
  String nome;
  double durabilidade;
}

class Girafa{
  private double altura;
}