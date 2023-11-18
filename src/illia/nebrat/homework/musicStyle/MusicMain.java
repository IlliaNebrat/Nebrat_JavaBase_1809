package illia.nebrat.homework.musicStyle;

public class MusicMain {
    public static void main(String[] args) {
        MusicStyles[] bands = {new PopMusic("The Beatles"), new RockMusic("Led Zeppelin"), new ClassicMusic("Beethoven")};
        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }
}