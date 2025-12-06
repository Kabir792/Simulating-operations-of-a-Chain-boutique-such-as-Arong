module com.example.arong {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.arong to javafx.fxml;
    exports com.example.arong;
}