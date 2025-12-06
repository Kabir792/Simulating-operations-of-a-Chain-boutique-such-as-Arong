package com.example.arong;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.time.LocalDate;

public class CustomerTrackOrderController
{
    @javafx.fxml.FXML
    private TableColumn<CustomerTrackOrder,String> orderIdColumn;
    @javafx.fxml.FXML
    private TextArea itemsTextArea;
    @javafx.fxml.FXML
    private Button trackOrderMenuButton;
    @javafx.fxml.FXML
    private TableColumn<CustomerTrackOrder, LocalDate> orderDateColumn;
    @javafx.fxml.FXML
    private TableView<CustomerTrackOrder> ordersTable;
    @javafx.fxml.FXML
    private TableColumn<CustomerTrackOrder,Double> orderTotalColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private Label estimatedDeliveryLabel;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private Button searchOrderButton;
    @javafx.fxml.FXML
    private TextField orderIdField;
    @javafx.fxml.FXML
    private Label detailOrderIdLabel;

    @javafx.fxml.FXML
    public void initialize() {
        orderDateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        orderTotalColumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
    }

    @javafx.fxml.FXML
    public void handleOpenTrackOrder(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSearchOrder(ActionEvent actionEvent) {
    }
}