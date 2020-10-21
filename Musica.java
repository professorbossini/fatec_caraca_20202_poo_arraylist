
public class Musica implements  Comparable <Musica>{
  private String titulo;
  private int avaliacao;
  public Musica (String titulo){
    this.titulo = titulo;
  }
  public String getTitulo() {
    return titulo;
  }

  public void setAvaliacao(int avaliacao) {
    this.avaliacao = avaliacao;
  }

  @Override
  public int compareTo(Musica outra) {
    if (this.avaliacao < outra.avaliacao)
      return -1;
    if (this.avaliacao > outra.avaliacao)
      return 1;
    return 0;
  }

  @Override
  public String toString() {
    return String.format(
      "Título: %s, Avaliação: %d", 
      titulo, avaliacao
    );    
  }
}
