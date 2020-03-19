package music.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("computer")
public class ComputerBean {

    private MusicPlayerBean musicPlayer;

    @Autowired
    public ComputerBean(MusicPlayerBean musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void playMusic() {
        musicPlayer.playMusic();
    }

}