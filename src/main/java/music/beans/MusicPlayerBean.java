package music.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import music.IMusic;

@Component("musicPlayer")
public class MusicPlayerBean {

    private List<IMusic> musicList;

    @Autowired
    public MusicPlayerBean(List<IMusic> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (IMusic track : musicList) {
            track.play();
        }
    }

}