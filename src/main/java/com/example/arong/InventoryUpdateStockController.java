package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryUpdateStockController
{
    @javafx.fxml.FXML
    private TableColumn<StockUpdate,Long> tableIdColumn;
    @javafx.fxml.FXML
    private TextField newQuantityField;
    @javafx.fxml.FXML
    private Button updateStockButton;
    @javafx.fxml.FXML
    private TableView<StockUpdate> productTable;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Label selectedProductLabel;
    @javafx.fxml.FXML
    private Button saveStockButton;
    @javafx.fxml.FXML
    private TableColumn<StockUpdate,Integer> tableStockColumn;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<StockUpdate,String> tableCategoryColumn;
    @javafx.fxml.FXML
    private TableColumn<StockUpdate,Double> tablePriceColumn;
    @javafx.fxml.FXML
    private TableColumn<StockUpdate,String> tableNameColumn;
    @javafx.fxml.FXML
    private Label validationMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        tableNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        tablePriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        tableCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("catagory"));
        tableStockColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        tableIdColumn.setCellValueFactory(new PropertyValueFactory<>("productId"));

    }

    @javafx.fxml.FXML
    public void handleSaveStock(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenUpdateStock(ActionEvent actionEvent) {
    }
}