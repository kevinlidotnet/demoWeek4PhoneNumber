module com.example.demoweek4phonenumber {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.demoweek4phonenumber to javafx.fxml;
    exports com.example.demoweek4phonenumber;
}