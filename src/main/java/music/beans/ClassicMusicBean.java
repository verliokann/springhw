package music.beans;

import org.springframework.stereotype.Component;

import music.IMusic;

@Component("ClassicMusicBean")
public class ClassicMusicBean implements IMusic {

    @Override
    public void play() {
        System.out.println("Classic music is playing");
    }

}