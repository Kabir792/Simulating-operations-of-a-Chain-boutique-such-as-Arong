package com.example.arong;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.time.LocalDate;

public class PendingPaymentsController
{
    @javafx.fxml.FXML
    private TextField dueDateField;
    @javafx.fxml.FXML
    private Button markClearedButton;
    @javafx.fxml.FXML
    private TextField invoiceIdField;
    @javafx.fxml.FXML
    private TableColumn<PendingPayment,Double> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<PendingPayment,String> invoiceIdColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField amountField;
    @javafx.fxml.FXML
    private TextField supplierField;
    @javafx.fxml.FXML
    private TableView<PendingPayment> pendingInvoicesTable;
    @javafx.fxml.FXML
    private TableColumn<PendingPayment, LocalDate> dueDateColumn;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<PendingPayment,Boolean> statusColumn;
    @javafx.fxml.FXML
    private Button pendingPaymentsButton;
    @javafx.fxml.FXML
    private TableColumn<PendingPayment,String> supplierColumn;

    @javafx.fxml.FXML
    public void initialize() {
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        invoiceIdColumn.setCellValueFactory(new PropertyValueFactory<>("invoiceId"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("isCleared"));
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenPendingPayments(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleMarkAsCleared(ActionEvent actionEvent) {
    }
}