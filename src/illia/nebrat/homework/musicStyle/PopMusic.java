package illia.nebrat.homework.musicStyle;

class PopMusic extends MusicStyles {
    public PopMusic(String name) {
        super(name);
    }
    @Override
    public void playMusic() {
        System.out.println("Playing pop music by " + name + "...");
    }
}