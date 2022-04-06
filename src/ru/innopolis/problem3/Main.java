public class Main {
    public static void main(String[] args) {

    }
}

interface MediaPlayer {
    void playMp4();
}

interface AudioPlayer {
    void playMp3();
}

class MediaAdapter implements MediaPlayer {
    private Audio audio;

    public MediaAdapter(Audio audio) {
        this.audio = audio;
    }

    public void playMp4() {
        audio.playMp3();
    }
}

class Media implements MediaPlayer {
    public void playMp4() {
    }
}

class Audio implements AudioPlayer {
    public void playMp3() {
    }
}

class PlayerDevice {
    void playMp4(MediaPlayer player) {
        player.playMp4();
    }
}