package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryLowStockController
{
    @javafx.fxml.FXML
    private TableView<LowStockProduct> lowStockTable;
    @javafx.fxml.FXML
    private Button reorderButton;
    @javafx.fxml.FXML
    private TableColumn<LowStockProduct,Integer> quantityColumn;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private Button lowStockReportButton;
    @javafx.fxml.FXML
    private TableColumn<LowStockProduct,String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn<LowStockProduct,String> supplierColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        supplierColumn.setCellValueFactory(new PropertyValueFactory<>("supplier"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenLowStockReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleReorder(ActionEvent actionEvent) {
    }
}