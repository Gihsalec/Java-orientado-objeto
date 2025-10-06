package audio.de.principal;

import audio.de.modelos.MinhasPreferidas;
import audio.de.modelos.Musica;
import audio.de.modelos.Podcast;

public class Principal {
    public static void main(String[] args){
        Musica minhaMusica =  new Musica();
        minhaMusica.setTitulo("Golden");
        minhaMusica.setArtista("HUNTR/X");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 900; i++) {
            minhaMusica.curte();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("DeByte");
        meupodcast.setHost("BRKsEDU");

        for (int i = 0; i < 1000; i++) {
            meupodcast.reproduz();
        }
        for (int i = 0; i < 200; i++) {
            meupodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meupodcast);
        preferidas.inclui(minhaMusica);
    }
}
