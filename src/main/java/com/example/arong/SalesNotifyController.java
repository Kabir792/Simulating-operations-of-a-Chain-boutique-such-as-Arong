package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class SalesNotifyController
{
    @javafx.fxml.FXML
    private TableColumn<OrderrNotification,Long> orderIdColumn;
    @javafx.fxml.FXML
    private TableColumn<OrderrNotification, LocalDate> orderDateColumn;
    @javafx.fxml.FXML
    private TableView<OrderrNotification> ordersTable;
    @javafx.fxml.FXML
    private Label customerPhoneLabel;
    @javafx.fxml.FXML
    private Label customerEmailLabel;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Label currentStatusLabel;
    @javafx.fxml.FXML
    private Label ordersMessageLabel;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<OrderrNotification,String> customerNameColumn;
    @javafx.fxml.FXML
    private TableColumn<OrderrNotification,Boolean> statusColumn;
    @javafx.fxml.FXML
    private Button sendUpdateButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSendUpdate(ActionEvent actionEvent) {
    }
}