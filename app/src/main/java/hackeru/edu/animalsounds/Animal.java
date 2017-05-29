package hackeru.edu.animalsounds;

/**
 * Created by hackeru on 29/05/2017.
 */

public class Animal {
    private final int imageResID;
    private final int soundResID;

    //Constructor
    public Animal(int imageResID, int soundResID) {
        this.imageResID = imageResID;
        this.soundResID = soundResID;
    }

    //getters only:
    public int getImageResID() {
        return imageResID;
    }

    public int getSoundResID() {
        return soundResID;
    }
}
