package com.example.arong;

import javafx.scene.control.*;

import java.awt.event.ActionEvent;

public class ManageExpensesController
{
    @javafx.fxml.FXML
    private TextField categoryField;
    @javafx.fxml.FXML
    private Button manageExpensesButton;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private Button saveExpenseButton;
    @javafx.fxml.FXML
    private Label validationMessageLabel;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField amountField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSaveExpense(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenManageExpenses(ActionEvent actionEvent) {
    }
}