package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryArchiveController
{
    @javafx.fxml.FXML
    private TableColumn<ArchivedProduct,String> reasonColumn;
    @javafx.fxml.FXML
    private TableColumn<ArchivedProduct,String> categoryColumn;
    @javafx.fxml.FXML
    private TableColumn<ArchivedProduct,String> productIdColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private Label selectedProductLabel;
    @javafx.fxml.FXML
    private Button archiveButton;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<ArchivedProduct,String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<ArchivedProduct,String> productNameColumn;
    @javafx.fxml.FXML
    private TableView<ArchivedProduct> discontinuedTable;
    @javafx.fxml.FXML
    private Label validationMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        productIdColumn.setCellValueFactory(new PropertyValueFactory<>("productId"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        reasonColumn.setCellValueFactory(new PropertyValueFactory<>("discontinuationReason"));
    }


    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleArchiveProduct(ActionEvent actionEvent) {
    }
}