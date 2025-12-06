package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryUpdatePriceController
{
    @javafx.fxml.FXML
    private TableColumn<PriceUpdate,Long> tableIdColumn;
    @javafx.fxml.FXML
    private Button updatePriceButton;
    @javafx.fxml.FXML
    private TableView<PriceUpdate> productTable;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Label selectedProductLabel;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<PriceUpdate,String> tableCategoryColumn;
    @javafx.fxml.FXML
    private TextField newPriceField;
    @javafx.fxml.FXML
    private TableColumn<PriceUpdate,Double> tablePriceColumn;
    @javafx.fxml.FXML
    private TableColumn<PriceUpdate,String> tableNameColumn;
    @javafx.fxml.FXML
    private Button savePriceButton;
    @javafx.fxml.FXML
    private Label validationMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        tableNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        tablePriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        tableCategoryColumn.setCellValueFactory(new PropertyValueFactory<>("catagory"));
        tableIdColumn.setCellValueFactory(new PropertyValueFactory<>("productId"));

    }

    @javafx.fxml.FXML
    public void handleOpenUpdatePrice(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSavePrice(ActionEvent actionEvent) {
    }
}