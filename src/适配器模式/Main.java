package 适配器模式;

public class Main {
    public static void main(String[] args) {
        MyPlayer myPlayer = new MyPlayer();
        myPlayer.play("mp3", "h.mp3");

        myPlayer.play("avi", "me.avi");
    }
}
interface Player {
    public void play(String type, String fileName);
}

interface AudioPlayer {
    public void playAudio(String FileName);
}

interface VideoPlayer {
    public void playAudio(String FileName);
}

class MyAudioPlayer implements AudioPlayer {
    @Override
    public void playAudio(String FileName) {
        System.out.println("使用的格式" + FileName);
    }
}

class MyVideoPlayer implements VideoPlayer {

    @Override
    public void playAudio(String FileName) {
        System.out.println("使用的格式" + FileName);
    }
}

class MyPlayer implements Player {
    MyVideoPlayer myVideoPlayer = new MyVideoPlayer();
    MyAudioPlayer myAudioPlayer = new MyAudioPlayer();

    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("avi")) {
            myVideoPlayer.playAudio(fileName);
        } else if (type.equalsIgnoreCase("mp3")){
            myAudioPlayer.playAudio(fileName);
        }

    }

}