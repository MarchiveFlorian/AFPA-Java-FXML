module fr.afpa {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.afpa to javafx.fxml;
    opens fr.afpa.Controllers to javafx.fxml;
    exports fr.afpa;
    exports fr.afpa.Controllers;
}
