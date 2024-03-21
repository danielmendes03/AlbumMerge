import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Album album = new Album("Podium", 1997);

      for(int i = 1; i < 6; i++){
         Scanner input = new Scanner(System.in);
         
         System.out.print("Música "+i+": ");
         String nome_musica = input.nextLine();

         System.out.print("Artista: ");
         String artista = input.nextLine();

         System.out.print("Duração: ");
         int duracao = input.nextInt();

         System.out.println();

         Musica musica = new Musica(nome_musica, artista, duracao);

         album.adicionarMusica(musica);
      }
   }
}