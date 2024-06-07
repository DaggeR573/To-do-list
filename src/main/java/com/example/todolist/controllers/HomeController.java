package com.example.todolist.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;

public class HomeController {

    Popup newPopup = new Popup();

    @FXML
    Button firstButton;



    public void dragWindow (DragEvent event)
    {
        EventHandler <ActionEvent> clickConfirm = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent)
            {
                newPopup.isShowing().
            }
        };
    }


    public void printButton (MouseEvent event)
    {





        VBox body = new VBox();

        HBox column1 = new HBox();
        HBox column2 = new HBox();
        HBox column3 = new HBox();

        TextField newTaskName = new TextField("Pole tekstowe");

        TextArea newTaskDescription = new TextArea();

        Label labelName = new Label("Label");
        Label labelDescription= new Label();

        Button confirm = new Button("Potwierdź");

        EventHandler <ActionEvent> clickConfirm = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent)
            {
                newPopup.hide();
            }
        };

        column1.getChildren().add(labelName);
        column1.getChildren().add(newTaskName);
        body.getChildren().add(column1);
        body.getChildren().add(column2);
        body.getChildren().add(column3);
        body.getChildren().add(labelDescription);
        body.getChildren().add(newTaskDescription);
        body.getChildren().add(confirm);


        confirm.setOnAction(clickConfirm);


        newPopup.getContent().add(body);
        if (!newPopup.isShowing())
        {
            newPopup.show(((Node) event.getSource()).getScene().getWindow());

        }


    }
}
