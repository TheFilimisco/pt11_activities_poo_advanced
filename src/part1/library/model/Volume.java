package part1.library.model;

public class Volume extends Work{
    private short numberVolume;

    public Volume(String title, String reference, String author, short numberPages, short numberVolume) {
        super(title, reference, author, numberPages);
        this.numberVolume = numberVolume;
    }

    public short getNumberVolume() {
        return numberVolume;
    }

    public void setNumberVolume(short numberVolume) {
        this.numberVolume = numberVolume;
    }

    @Override
    public String toString() {
        return "Volume{" +
                "numberVolume=" + numberVolume +
                "} " + super.toString();
    }
}
