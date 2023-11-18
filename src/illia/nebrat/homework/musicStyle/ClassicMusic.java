package illia.nebrat.homework.musicStyle;

class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
    }
    @Override
    public void playMusic() {
        System.out.println("Playing classic music by " + name + "...");
    }
}