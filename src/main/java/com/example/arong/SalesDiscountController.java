package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SalesDiscountController
{
    @javafx.fxml.FXML
    private TableColumn<SalesDiscount,Double> lineTotalColumn;
    @javafx.fxml.FXML
    private TextField promoCodeField;
    @javafx.fxml.FXML
    private Label originalTotalLabel;
    @javafx.fxml.FXML
    private TableView<SalesDiscount> orderItemsTable;
    @javafx.fxml.FXML
    private TextField discountPercentField;
    @javafx.fxml.FXML
    private Button applyDiscountMenuButton;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Button applyDiscountButton;
    @javafx.fxml.FXML
    private Label discountAmountLabel;
    @javafx.fxml.FXML
    private Label newTotalLabel;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<SalesDiscount,String> productColumn;
    @javafx.fxml.FXML
    private TableColumn<SalesDiscount,Double> priceColumn;
    @javafx.fxml.FXML
    private Label validationMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<SalesDiscount,Integer> qtyColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleOpenApplyDiscount(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApplyDiscount(ActionEvent actionEvent) {
    }
}