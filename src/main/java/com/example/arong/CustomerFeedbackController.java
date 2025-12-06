package com.example.arong;

import javafx.scene.control.*;

import java.awt.event.ActionEvent;

public class CustomerFeedbackController
{
    @javafx.fxml.FXML
    private Button rateProductMenuButton;
    @javafx.fxml.FXML
    private TextField productNameField;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private ComboBox<Integer> ratingComboBox;
    @javafx.fxml.FXML
    private Button submitFeedbackButton;
    @javafx.fxml.FXML
    private Label validationMessageLabel;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextArea reviewTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        ratingComboBox.getItems().addAll(1, 2, 3, 4, 5);

    }

    @javafx.fxml.FXML
    public void handleSubmitFeedback(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenRateProduct(ActionEvent actionEvent) {
    }
}