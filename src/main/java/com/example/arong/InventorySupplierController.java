package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventorySupplierController
{
    @javafx.fxml.FXML
    private Button manageSuppliersButton;
    @javafx.fxml.FXML
    private TableView<Supplier> supplierTable;
    @javafx.fxml.FXML
    private TextField supplierNameField;
    @javafx.fxml.FXML
    private Button saveSupplierButton;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<Supplier,String> tableSupplierNameColumn;
    @javafx.fxml.FXML
    private TextField productLineField;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Supplier,String> tableProductLineColumn;
    @javafx.fxml.FXML
    private TextField contactField;
    @javafx.fxml.FXML
    private Label validationMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Supplier,String> tableContactColumn;

    @javafx.fxml.FXML
    public void initialize() {

        tableContactColumn.setCellValueFactory(new PropertyValueFactory<>("contactInfo"));
        tableProductLineColumn.setCellValueFactory(new PropertyValueFactory<>("productline"));
        tableSupplierNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    }

    @javafx.fxml.FXML
    public void handleOpenManageSuppliers(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSaveSupplier(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }
}