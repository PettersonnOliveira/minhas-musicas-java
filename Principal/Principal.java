package Minhasmusicas.Principal;

import Minhasmusicas.modelos.MinhasPreferidas;
import Minhasmusicas.modelos.Musicas;
import Minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Nova Sorte");
        minhaMusica.setCantor("Filipe Ret");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Podpah");
        meuPodcast.setApresentador("Igão e Mitico");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
