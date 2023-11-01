module JavaFX.Calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens org.example.controllers to javafx.fxml;
    exports org.example;
}