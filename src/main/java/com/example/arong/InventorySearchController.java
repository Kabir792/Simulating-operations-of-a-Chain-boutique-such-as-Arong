package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventorySearchController
{
    @javafx.fxml.FXML
    private TableColumn<ProductSearchCriteria,String> sizeColumn;
    @javafx.fxml.FXML
    private Button searchButton;
    @javafx.fxml.FXML
    private TextField searchField;
    @javafx.fxml.FXML
    private TableView<ProductSearchCriteria> productTable;
    @javafx.fxml.FXML
    private TableColumn<ProductSearchCriteria,String> categoryColumn;
    @javafx.fxml.FXML
    private TableColumn<ProductSearchCriteria,String> stockColumn;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<ProductSearchCriteria,String> productNameColumn;
    @javafx.fxml.FXML
    private Button searchFilterButton;
    @javafx.fxml.FXML
    private Label validationMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<ProductSearchCriteria,Double> priceColumn;

    @javafx.fxml.FXML
    public void initialize() {
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        stockColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        sizeColumn.setCellValueFactory(new PropertyValueFactory<>("size"));

    }

    @javafx.fxml.FXML
    public void handleSearch(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenSearchFilter(ActionEvent actionEvent) {
    }
}