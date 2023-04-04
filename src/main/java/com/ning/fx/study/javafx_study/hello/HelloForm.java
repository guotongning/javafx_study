package com.ning.fx.study.javafx_study.hello;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * form表单 hello world
 *
 * @author 郭桐宁
 * @date 2023-04-04
 */
public class HelloForm extends Application {
    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25, 25, 25, 25));

        Text text = new Text("Welcome");
        text.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        pane.add(text, 0, 0, 2, 1);

        Text accountText = new Text();
        Label account = new Label("account");
        pane.add(account, 0, 1);
        TextField textField = new TextField();
        textField.setOnAction(action -> accountText.setText(((TextField) action.getSource()).getText()));
        pane.add(textField, 1, 1);

        Label password = new Label("password");
        pane.add(password, 0, 2);
        PasswordField passwordField = new PasswordField();
        pane.add(passwordField, 1, 2);

        Text toast = new Text();
        pane.add(toast, 1, 6);

        Button btn = new Button("登录");
        btn.setOnAction(action -> {
            toast.setFill(Color.RED);
            toast.setText(String.format("你好呀~ 你输入了[%s]", accountText.getText()));
        });
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(btn);
        pane.add(hBox, 1, 4);

        Scene scene = new Scene(pane, 1280, 720);
        stage.setScene(scene);

        stage.setTitle("JavaFX Welcome");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
