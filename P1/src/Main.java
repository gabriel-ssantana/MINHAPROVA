import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogador> participantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        participantes.add(new Jogador("Alane Dias"));
        participantes.add(new Jogador("Beatriz Reis"));
        participantes.add(new Jogador("Davi Brito"));
        participantes.add(new Jogador("Deniziane Ferreira"));
        participantes.add(new Jogador("Fernanda Bande"));
        participantes.add(new Jogador("Giovanna Lima"));
        participantes.add(new Jogador("Giovana Pitel"));
        participantes.add(new Jogador("Isabelle Nogueira"));
        participantes.add(new Jogador("Juninho"));
        participantes.add(new Jogador("Leidy Elin"));
        participantes.add(new Jogador("Lucas Henrique"));
        participantes.add(new Jogador("Lucas Luigi"));
        participantes.add(new Jogador("Lucas Pizane"));
        participantes.add(new Jogador("Marcus Vinicius"));
        participantes.add(new Jogador("Matteus Amaral"));
        participantes.add(new Jogador("Maycon Cosmer"));
        participantes.add(new Jogador("MC Bin Laden"));
        participantes.add(new Jogador("Michel Nogueira"));
        participantes.add(new Jogador("Nizam"));
        participantes.add(new Jogador("Raquele Cardozo"));
        participantes.add(new Jogador("Rodriguinho"));
        participantes.add(new Jogador("Thalyta Alves"));
        participantes.add(new Jogador("Vanessa Lopes"));
        participantes.add(new Jogador("Vinicius Rodrigues"));
        participantes.add(new Jogador("Wanessa Camargo"));
        participantes.add(new Jogador("Yasmin Brunet"));

        System.out.println("Votação para eliminação (digite sair para encerrar):");

        String voto;

        do {
            System.out.print("Em quem voce vota para sair da casa? ");
            voto = scanner.nextLine();
            if (!voto.equalsIgnoreCase("sair")) {
                contabilizarVoto(participantes, voto);
            }
        } while (!voto.equalsIgnoreCase("sair"));

        Jogador maisVotado = encontrarMaisVotado(participantes);
        System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertao, e o sertao virar mar, se eu conseguir dizer o que eu nunca vou conseguir dizer, aí tera chegado o dia em que eu vou conseguir te eliminar com alegria. Com " + maisVotado.getVotos() + " votos, e voce quem sai " + maisVotado.getNome());
    }

    private static void contabilizarVoto(ArrayList<Jogador> participantes, String voto) {
        for (Jogador jogador : participantes) {
            if (jogador.getNome().equalsIgnoreCase(voto)) {
                jogador.incrementaUmVoto();
                System.out.println("Voto computado para " + jogador.getNome());
                return;
            }
        }
        System.out.println("Nome de participante inválido. Voto não computado.");
    }

    private static Jogador encontrarMaisVotado(ArrayList<Jogador> participantes) {
        Jogador maisVotado = participantes.get(0);
        for (Jogador jogador : participantes) {
            if (jogador.getVotos() > maisVotado.getVotos()) {
                maisVotado = jogador;
            }
        }
        return maisVotado;
    }
}






