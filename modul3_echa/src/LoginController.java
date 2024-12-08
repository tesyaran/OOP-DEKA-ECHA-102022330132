import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField penggunaField; 

    @FXML
    private PasswordField sandiField; 

    @FXML
    public void masuk(ActionEvent event) { 
        String pengguna = penggunaField.getText();
        String sandi = sandiField.getText();

        if (pengguna.equals("echa102022330132") && sandi.equals("restoreecha")) {
            try {
                App.changeScene("inventory.fxml");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Kesalahan Login");
            alert.setHeaderText(null);
            alert.setContentText("Nama pengguna atau kata sandi salah!");
            alert.showAndWait();
        }
    }
}
