package Practice.OOPs.Interface;

public class Cdplayer implements Media_player{
    @Override
    public void stop() {
        System.out.println("The media player is stopped");
    }

    @Override
    public void start() {
        System.out.println("The media player is started.");
    }
}
