import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class AppAvaliacaoMusicas {
  public static void main(String[] args) {
    //classe interna anônima
    List <Musica> musicas = new ArrayList<>(){
      public String toString() {
        return super.toString().replace('[', '\0').replace(']', '\0');
      }
    };
    String menu = "1-Inserir Música\n2-Avaliar Música\n3-Ver Lista Ordenada\n0-Sair";
    int opcao;
    do{
      opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch (opcao){
        case 1:
          String tituloInserir = JOptionPane.showInputDialog("Qual música deseja incluir?");
          musicas.add(new Musica(tituloInserir));
          JOptionPane.showMessageDialog(null, String.format(
                  "Música %s inserida com sucesso!", tituloInserir
          ));
          break;
        case 2:
          String tituloAvaliar = JOptionPane.showInputDialog("QUal música deseja avaliar?");
          Musica m = null;
          for (int i = 0; i < musicas.size(); i++){
            if (musicas.get(i).getTitulo().equals(tituloAvaliar)){
              m = musicas.get(i);
              int av = Integer.parseInt(JOptionPane.showInputDialog("Qual a avaliação para ela?"));
              m.setAvaliacao(av);
              break;
            }
          }
          JOptionPane.showMessageDialog(null, 
            m == null ? 
            "Música não encontrada" : 
            String.format("Música %s avaliada com sucesso", tituloAvaliar)
          );
          break;
        case 3:
          Collections.sort(musicas, Collections.reverseOrder());
          //JOptionPane.showMessageDialog(null, musicas);
          StringBuilder sb = new StringBuilder ("");
          for (Musica musica : musicas){
            sb.append(musica.toString()).append("\n");
          }
          JOptionPane.showMessageDialog(null, sb.toString());
          break;
        case 0:
          JOptionPane.showMessageDialog(null, "Até mais ver");
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida");
          break;
      }
    }while (opcao != 0);
  }
}
