module com.example.anthonybrown {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.anthonybrown to javafx.fxml;
    exports com.example.anthonybrown;
}