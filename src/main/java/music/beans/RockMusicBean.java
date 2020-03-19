package music.beans;

import org.springframework.stereotype.Component;

import music.IMusic;

@Component("RockMusicBean")
public class RockMusicBean implements IMusic {

    @Override
    public void play() {
        System.out.println("Rock music is playing");
    }

}