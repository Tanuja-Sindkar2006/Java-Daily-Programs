package interfaces;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Photo captured using smartphone camera.");
    }

    public void playMusic() {
        System.out.println("Playing music on smartphone.");
    }
}

public class SmartPhoneDemo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.takePhoto();
        phone.playMusic();
    }
}
