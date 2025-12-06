package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryAddProductController
{
    @javafx.fxml.FXML
    private TextField productNameField;
    @javafx.fxml.FXML
    private TableView<Product> productTable;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField sizeField;
    @javafx.fxml.FXML
    private TextField categoryField;
    @javafx.fxml.FXML
    private TableColumn<Product,String>tableSizeColumn;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TextField priceField;
    @javafx.fxml.FXML
    private Button saveProductButton;
    @javafx.fxml.FXML
    private TableColumn<Product,String> tableCategoryColumn;
    @javafx.fxml.FXML
    private TableColumn<Product,Integer> tableQuantityColumn;
    @javafx.fxml.FXML
    private TableColumn<Product,Double> tablePriceColumn;
    @javafx.fxml.FXML
    private TextField quantityField;
    @javafx.fxml.FXML
    private TableColumn<Product,String> tableNameColumn;
    @javafx.fxml.FXML
    private Label validationMessageLabel;
    @javafx.fxml.FXML
    private Button addNewProductButton;

    @javafx.fxml.FXML
    public void initialize() {
        tableSizeColumn.setCellValueFactory(new PropertyValueFactory<>("size"));
        tableCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("Category"));
        tableQuantityColumn.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        tablePriceColumn.setCellValueFactory(new PropertyValueFactory<>("Price"));
        tableNameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSaveProduct(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenAddProduct(ActionEvent actionEvent) {
    }
}