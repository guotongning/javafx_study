module com.ning.fx.study.javafx_study {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ning.fx.study.javafx_study to javafx.fxml;
    exports com.ning.fx.study.javafx_study;

    opens com.ning.fx.study.javafx_study.hello to javafx.fxml;
    exports com.ning.fx.study.javafx_study.hello;
}