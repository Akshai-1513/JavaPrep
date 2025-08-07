package Practice.OOPs.Interface;

public class NiceCar {
    private Engine engine;
    private Media_player player;

    public NiceCar(){
        engine = new Power_Engine();
        player = new Cdplayer();
    }
    public void upgrade_engine(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void accelerate(){
        engine.accelerate();
    }

    public void start_music(){
        player.start();
    }
    public void stop_music(){
        player.stop();
    }
}
