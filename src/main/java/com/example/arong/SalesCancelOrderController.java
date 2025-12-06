package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class SalesCancelOrderController
{
    @javafx.fxml.FXML
    private TableColumn<OrderCancellation,String> orderIdColumn;
    @javafx.fxml.FXML
    private Button openCancelOrderButton;
    @javafx.fxml.FXML
    private TableColumn<OrderCancellation,String> customerColumn;
    @javafx.fxml.FXML
    private Button cancelOrderButton;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableView<OrderCancellation> pendingOrdersTable;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<OrderCancellation,Boolean> statusColumn;
    @javafx.fxml.FXML
    private TextField orderIdField;
    @javafx.fxml.FXML
    private TableColumn<OrderCancellation, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private Label validationMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleCancelOrder(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenCancelOrder(ActionEvent actionEvent) {
    }
}