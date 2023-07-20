 module com.example.krispy {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires mysql.connector.java;
    requires java.desktop;
    requires com.google.gson;


    opens com.example.krispy to javafx.fxml;
    exports com.example.krispy;
    exports com.example.krispy.Controllers;
    exports com.example.krispy.Controllers.Admin;
    exports com.example.krispy.Controllers.Client;
    exports com.example.krispy.Models;
    exports com.example.krispy.Views;
    opens com.example.krispy.Controllers to javafx.fxml;
}