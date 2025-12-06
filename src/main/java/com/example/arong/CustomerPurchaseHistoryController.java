package com.example.arong;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class CustomerPurchaseHistoryController
{
    @javafx.fxml.FXML
    private TableColumn<Customer,Long> orderIdColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer,Integer> itemsColumn;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Customer,Boolean> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<Customer,Integer> totalColumn;
    @javafx.fxml.FXML
    private TableView<Customer> purchaseHistoryTable;
    @javafx.fxml.FXML
    private TableColumn<Customer, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private Button purchaseHistoryButton;

    @javafx.fxml.FXML
    public void initialize() {
        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderid"));
        itemsColumn.setCellValueFactory(new PropertyValueFactory<>("items"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @javafx.fxml.FXML
    public void handleOpenPurchaseHistory(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }
}