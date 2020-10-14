public class VetorDinamico{
  private int quantidade;
  private int capacidade;
  private int [] elementos;

  public VetorDinamico (){
    this.quantidade = 0;
    this.capacidade = 4;
    this.elementos = new int [this.capacidade];
  }

  public boolean estaCheio (){
    if (this.quantidade >= this.capacidade){
      return true;
    }
    else{
      return false;
    }
  }

  public void adicionar (int e){
    //esta cheio?
      //se estiver redimensiona
    //adicionar
    if (this.estaCheio())
      this.aumentarCapacidade();
    this.elementos[this.quantidade] = e;
    this.quantidade++;

    /*if (!estaCheio()){
      this.elementos[this.quantidade] = e;
      this.quantidade++;
    }*/
  }

  public void exibir (){
    System.out.printf("Qtde: %d, Cap: %d\n", this.quantidade, this.capacidade);
    for (int i = 0; i < this.quantidade; i++){
      System.out.print(this.elementos[i] + " ");
    }
    System.out.println();
  }




  private void aumentarCapacidade (){
    int [] aux = new int[this.capacidade * 2];
    /*aux[0] = this.elementos[0];
    aux[1] = this.elementos[1];*/
    //cópia manual
    //averigue o funcionamento do método arraycopy da classe System
    for (int i = 0; i < this.quantidade; i++){
      aux[i] = this.elementos[i];
    }
    this.elementos = aux;
    this.capacidade *= 2;
  }

  

}