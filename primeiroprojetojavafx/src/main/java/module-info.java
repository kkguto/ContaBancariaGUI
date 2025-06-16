module br.com.descompila {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.descompila to javafx.fxml;
    exports br.com.descompila;
}
