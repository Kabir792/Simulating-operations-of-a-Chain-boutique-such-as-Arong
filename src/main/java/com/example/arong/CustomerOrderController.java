package com.example.arong;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;

public class CustomerOrderController
{
    @javafx.fxml.FXML
    private TableView cartTable;
    @javafx.fxml.FXML
    private Label taxAmountLabel;
    @javafx.fxml.FXML
    private TableColumn cartProductColumn;
    @javafx.fxml.FXML
    private Button confirmOrderButton;
    @javafx.fxml.FXML
    private Button calculateButton;
    @javafx.fxml.FXML
    private TableView productsTable;
    @javafx.fxml.FXML
    private TextField cvvField;
    @javafx.fxml.FXML
    private TextArea orderSummaryArea;
    @javafx.fxml.FXML
    private TextField phoneField;
    @javafx.fxml.FXML
    private Label finalAmountLabel;
    @javafx.fxml.FXML
    private TableColumn<CustomerOrder,Integer> cartQtyColumn;
    @javafx.fxml.FXML
    private TextField quantityField;
    @javafx.fxml.FXML
    private Label receiptNumberLabel;
    @javafx.fxml.FXML
    private TableColumn<CustomerOrder,Double> priceColumn;
    @javafx.fxml.FXML
    private Button addToCartButton;
    @javafx.fxml.FXML
    private TextField cardNumberField;
    @javafx.fxml.FXML
    private TableColumn<CustomerOrder,Integer> stockColumn;
    @javafx.fxml.FXML
    private Label orderStatusLabel;
    @javafx.fxml.FXML
    private Label discountLabel;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TextArea shippingAddressField;
    @javafx.fxml.FXML
    private TextField expiryField;
    @javafx.fxml.FXML
    private TableColumn<CustomerOrder,String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerOrder,Double> cartPriceColumn;
    @javafx.fxml.FXML
    private Label totalCostLabel;
    @javafx.fxml.FXML
    private Label validationMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        cartQtyColumn.setCellValueFactory(new PropertyValueFactory<>("qty"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        stockColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("product"));
        cartPriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    }

    @javafx.fxml.FXML
    public void handleCalculateOrder(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleConfirmOrder(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAddToCart(ActionEvent actionEvent) {
    }
}