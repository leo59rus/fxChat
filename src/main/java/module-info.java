module ru.gb.fxjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.fxjava to javafx.fxml;
    exports ru.gb.fxjava;
}