package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SalesCreateOrderController
{
    @javafx.fxml.FXML
    private TableColumn<salesOrder,Integer> orderQtyColumn;
    @javafx.fxml.FXML
    private TableView<salesOrder> orderItemsTable;
    @javafx.fxml.FXML
    private TableColumn<salesOrder,String> orderLineTotalColumn;
    @javafx.fxml.FXML
    private Button confirmOrderButton;
    @javafx.fxml.FXML
    private Button calculateButton;
    @javafx.fxml.FXML
    private Label subtotalLabel;
    @javafx.fxml.FXML
    private TableView<salesOrder> productsTable;
    @javafx.fxml.FXML
    private Button addToOrderButton;
    @javafx.fxml.FXML
    private TextArea orderSummaryArea;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<salesOrder,Double> productPriceColumn;
    @javafx.fxml.FXML
    private Label totalLabel;
    @javafx.fxml.FXML
    private Label discountLabel;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private Button createOrderButton;
    @javafx.fxml.FXML
    private TableColumn<salesOrder,String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn<salesOrder,String> orderProductColumn;
    @javafx.fxml.FXML
    private TextField customerIdField;
    @javafx.fxml.FXML
    private TextField quantityField;
    @javafx.fxml.FXML
    private TableColumn<salesOrder,Integer> productStockColumn;
    @javafx.fxml.FXML
    private Label validationMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleAddProductToOrder(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleConfirmOrder(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCalculateTotals(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenCreateOrder(ActionEvent actionEvent) {
    }
}