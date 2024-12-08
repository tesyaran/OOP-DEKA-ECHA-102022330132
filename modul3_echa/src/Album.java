import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Album {
    private final StringProperty judulAlbum;   // albumName -> judulAlbum
    private final StringProperty penyanyi;    // artist -> penyanyi
    private final IntegerProperty totalLagu;  // total -> totalLagu
    private final IntegerProperty tersedia;   // available -> tersedia
    private final IntegerProperty dipinjam;   // rented -> dipinjam

    public Album(String judulAlbum, String penyanyi, int totalLagu, int tersedia, int dipinjam) {
        this.judulAlbum = new SimpleStringProperty(judulAlbum);
        this.penyanyi = new SimpleStringProperty(penyanyi);
        this.totalLagu = new SimpleIntegerProperty(totalLagu);
        this.tersedia = new SimpleIntegerProperty(tersedia);
        this.dipinjam = new SimpleIntegerProperty(dipinjam);
    }

    public String getJudulAlbum() {
        return judulAlbum.get();
    }

    public void setJudulAlbum(String judulAlbum) {
        this.judulAlbum.set(judulAlbum);
    }

    public StringProperty judulAlbumProperty() {
        return judulAlbum;
    }

    public String getPenyanyi() {
        return penyanyi.get();
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi.set(penyanyi);
    }

    public StringProperty penyanyiProperty() {
        return penyanyi;
    }

    public int getTotalLagu() {
        return totalLagu.get();
    }

    public void setTotalLagu(int totalLagu) {
        this.totalLagu.set(totalLagu);
    }

    public IntegerProperty totalLaguProperty() {
        return totalLagu;
    }

    public int getTersedia() {
        return tersedia.get();
    }

    public void setTersedia(int tersedia) {
        this.tersedia.set(tersedia);
    }

    public IntegerProperty tersediaProperty() {
        return tersedia;
    }

    public int getDipinjam() {
        return dipinjam.get();
    }

    public void setDipinjam(int dipinjam) {
        this.dipinjam.set(dipinjam);
    }

    public IntegerProperty dipinjamProperty() {
        return dipinjam;
    }
}
