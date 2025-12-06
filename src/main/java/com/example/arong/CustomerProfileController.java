package com.example.arong;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CustomerProfileController
{
    @javafx.fxml.FXML
    private Button saveProfileButton;
    @javafx.fxml.FXML
    private PasswordField newPasswordField;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private Button editProfileButton;
    @javafx.fxml.FXML
    private TextArea addressArea;
    @javafx.fxml.FXML
    private Label validationMessageLabel;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField phoneField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSaveProfile(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenEditProfile(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }
}