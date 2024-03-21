import java.util.ArrayList;

public class Album{
   private String nome_album;
   private int ano_lancamento;
   private ArrayList<Musica> musicas = new ArrayList<Musica>();

   public Album(String nome_album, int ano_lancamento) {
      this.nome_album =  nome_album;
      this.ano_lancamento = ano_lancamento;
   }

   public void adicionarMusica(Musica musica){
      this.musicas.add(musica);
   }
}