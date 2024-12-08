import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.input.MouseEvent;

public class InventoryController {

    @FXML
    private TableView<Album> tableView;
    @FXML
    private TableColumn<Album, String> columnJudulAlbum; 
    @FXML
    private TableColumn<Album, String> columnPenyanyi;  
    @FXML
    private TableColumn<Album, Integer> columnTotalLagu; 
    @FXML
    private TableColumn<Album, Integer> columnTersedia; 

    @FXML
    private TextField judulAlbumField; 
    @FXML
    private TextField penyanyiField;  
    @FXML
    private TextField totalLaguField; 
    @FXML
    private TextField tersediaField;  
    @FXML
    private TextField dipinjamField;  

    @FXML
    private Button tambahButton;   
    @FXML
    private Button perbaruiButton; 
    @FXML
    private Button hapusButton;    

    @FXML
    private void tambahAlbum() { 
        try {
            String judulAlbum = judulAlbumField.getText();
            String penyanyi = penyanyiField.getText();
            int totalLagu = Integer.parseInt(totalLaguField.getText());
            int tersedia = Integer.parseInt(tersediaField.getText());
            int dipinjam = Integer.parseInt(dipinjamField.getText());

            if (judulAlbum.isEmpty() || penyanyi.isEmpty()) {
                throw new IllegalArgumentException("Judul album dan penyanyi tidak boleh kosong.");
            }

            Album albumBaru = new Album(judulAlbum, penyanyi, totalLagu, tersedia, dipinjam);
            tableView.getItems().add(albumBaru);

            clearFields();
            showAlert(AlertType.INFORMATION, "Album berhasil ditambahkan", "Album " + judulAlbum + " berhasil ditambahkan!");

        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "Kesalahan dalam input data", "Silahkan cek data yang anda masukkan");
        } catch (IllegalArgumentException e) {
            showAlert(AlertType.ERROR, "Kesalahan dalam input data", e.getMessage());
        }
    }

    @FXML
    private void perbaruiAlbum() { // updateAlbum -> perbaruiAlbum
        try {
            Album albumDipilih = tableView.getSelectionModel().getSelectedItem();
            if (albumDipilih == null) {
                showAlert(AlertType.WARNING, "Tidak ada pilihan", "Pilih album untuk diperbarui.");
                return;
            }

            String judulAlbum = judulAlbumField.getText();
            String penyanyi = penyanyiField.getText();
            int totalLagu = Integer.parseInt(totalLaguField.getText());
            int tersedia = Integer.parseInt(tersediaField.getText());
            int dipinjam = Integer.parseInt(dipinjamField.getText());

            if (judulAlbum.isEmpty() || penyanyi.isEmpty()) {
                throw new IllegalArgumentException("Judul album dan penyanyi tidak boleh kosong.");
            }

            albumDipilih.setJudulAlbum(judulAlbum);
            albumDipilih.setPenyanyi(penyanyi);
            albumDipilih.setTotalLagu(totalLagu);
            albumDipilih.setTersedia(tersedia);
            albumDipilih.setDipinjam(dipinjam);
            showAlert(AlertType.INFORMATION, "Album berhasil diperbarui", "Album " + judulAlbum + " berhasil diperbarui!");
            
        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "Kesalahan dalam input data", "Silahkan cek data yang anda masukkan");
        } catch (IllegalArgumentException e) {
            showAlert(AlertType.ERROR, "Kesalahan dalam input data", e.getMessage());
        }
    }

    @FXML
    private void hapusAlbum() { 
        try {
            Album albumDipilih = tableView.getSelectionModel().getSelectedItem();
            if (albumDipilih == null) {
                showAlert(AlertType.WARNING, "Tidak ada pilihan", "Pilih album untuk dihapus.");
                return;
            }

            tableView.getItems().remove(albumDipilih);
            String judulAlbum = albumDipilih.getJudulAlbum();
            showAlert(AlertType.INFORMATION, "Album berhasil dihapus", "Album " + judulAlbum + " berhasil dihapus!");
        } catch (Exception e) {
            showAlert(AlertType.ERROR, "Error", "Terjadi kesalahan ketika menghapus album.");
        }
    }

    @FXML
    private void sewaAlbum() { 
        try {
            Album albumDipilih = tableView.getSelectionModel().getSelectedItem();
            if (albumDipilih == null) {
                showAlert(AlertType.WARNING, "Tidak ada pilihan", "Pilih album untuk disewa.");
                return;
            }

            if (albumDipilih.getTersedia() > 0) {
                albumDipilih.setTersedia(albumDipilih.getTersedia() - 1);
                albumDipilih.setDipinjam(albumDipilih.getDipinjam() + 1);
                showAlert(AlertType.INFORMATION, "Album berhasil disewa", "Album " + albumDipilih.getJudulAlbum() + " berhasil disewa!");
            } else {
                showAlert(AlertType.WARNING, "Tidak ada salinan tersedia", "Tidak ada salinan tersisa dari album yang dipilih.");
            }

        } catch (Exception e) {
            showAlert(AlertType.ERROR, "Error", "Terjadi kesalahan ketika menyewa album.");
        }
    }

    private void showAlert(AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearFields() {
        judulAlbumField.clear();
        penyanyiField.clear();
        totalLaguField.clear();
        tersediaField.clear();
        dipinjamField.clear();
    }

    @FXML
    private void handleTableRowClick(MouseEvent event) {
        Album albumDipilih = tableView.getSelectionModel().getSelectedItem();
        if (albumDipilih != null) {
            judulAlbumField.setText(albumDipilih.getJudulAlbum());
            penyanyiField.setText(albumDipilih.getPenyanyi());
            totalLaguField.setText(String.valueOf(albumDipilih.getTotalLagu()));
            tersediaField.setText(String.valueOf(albumDipilih.getTersedia()));
            dipinjamField.setText(String.valueOf(albumDipilih.getDipinjam()));
        }
    }

    @FXML
    public void initialize() {
        columnJudulAlbum.setCellValueFactory(cellData -> cellData.getValue().judulAlbumProperty());
        columnPenyanyi.setCellValueFactory(cellData -> cellData.getValue().penyanyiProperty());
        columnTotalLagu.setCellValueFactory(cellData -> cellData.getValue().totalLaguProperty().asObject());
        columnTersedia.setCellValueFactory(cellData -> cellData.getValue().tersediaProperty().asObject());
    }
}
