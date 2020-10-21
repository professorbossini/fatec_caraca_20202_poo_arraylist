public class VetorDinamicoString{
  private int quantidade;
  private int capacidade;
  private String [] elementos;

  public VetorDinamicoString (){
    this.quantidade = 0;
    this.capacidade = 4;
    this.elementos = new String [this.capacidade];
  }

  public boolean estaVazio (){
    return this.quantidade == 0;  
  }

  public boolean estaCheio (){
    if (this.quantidade >= this.capacidade){
      return true;
    }
    else{
      return false;
    }
  }

  public void adicionar (String e){
    //esta cheio?
      //se estiver redimensiona
    //adicionar
    if (this.estaCheio())
      //this.aumentarCapacidade();
      this.redimensionar(2);
    this.elementos[this.quantidade] = e;
    this.quantidade++;

    /*if (!estaCheio()){
      this.elementos[this.quantidade] = e;
      this.quantidade++;
    }*/
  }

  public void remover (){
    if (!this.estaVazio()){
      this.quantidade--;
      if (this.capacidade > 4 && this.quantidade <= this.capacidade / 4){
        //this.reduzirCapacidade();
        this.redimensionar(0.5);
      }
    }
  }

  public void exibir (){
    System.out.printf("Qtde: %d, Cap: %d\n", this.quantidade, this.capacidade);
    for (int i = 0; i < this.quantidade; i++){
      System.out.print(this.elementos[i] + " ");
    }
    System.out.println();
  }

  private void redimensionar (double fator){
    String [] aux = new String [(int)(this.capacidade * fator)]; // 8 * 2.0 == 16.0 8 * 0.5 = 4.0
    for (int i = 0; i < this.quantidade; i++){
      aux[i] = this.elementos[i];
    }
    this.elementos = aux;
    this.capacidade *= fator;
  }

  /*
   * private void reduzirCapacidade(){ int [] aux = new int [this.capacidade / 2];
   * for (int i = 0; i < this.quantidade; i++){ aux[i] = this.elementos[i]; }
   * this.elementos = aux; this.capacidade /= 2; } private void aumentarCapacidade
   * (){ int [] aux = new int[this.capacidade * 2]; /*aux[0] = this.elementos[0];
   * aux[1] = this.elementos[1]; //cópia manual //averigue o funcionamento do
   * método arraycopy da classe System for (int i = 0; i < this.quantidade; i++){
   * aux[i] = this.elementos[i]; } this.elementos = aux; this.capacidade *= 2; }
   */ 
}
