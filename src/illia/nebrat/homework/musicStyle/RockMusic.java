package illia.nebrat.homework.musicStyle;

class RockMusic extends MusicStyles {
    public RockMusic(String name) {
        super(name);
    }
    @Override
    public void playMusic() {
        System.out.println("Playing rock music by " + name + "...");
    }
}
