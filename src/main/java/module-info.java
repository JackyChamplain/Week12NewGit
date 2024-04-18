module com.example.week12newgit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week12newgit to javafx.fxml;
    exports com.example.week12newgit;
}