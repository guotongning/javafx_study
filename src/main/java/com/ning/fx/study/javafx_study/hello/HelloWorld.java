package com.ning.fx.study.javafx_study.hello;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventTarget;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * hello world
 *
 * @author 郭桐宁
 * @date 2023-04-04
 */
public class HelloWorld extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        button.setText("点我");
        button.setOnAction(actionEvent -> {
            EventType<? extends ActionEvent> type = actionEvent.getEventType();
            System.out.println(type);
            Object source = actionEvent.getSource();
            EventTarget target = actionEvent.getTarget();
            System.out.println(actionEvent);
        });

        StackPane pane = new StackPane();
        pane.getChildren().add(button);
        Scene scene = new Scene(pane, 1280, 720);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
