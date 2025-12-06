package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventorySummaryReportController
{
    @javafx.fxml.FXML
    private TableColumn<InventorySummaryItem,String> quantityColumn;
    @javafx.fxml.FXML
    private TableView<InventorySummaryItem> summaryTable;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<InventorySummaryItem,Double> valueColumn;
    @javafx.fxml.FXML
    private Button generateReportButton;
    @javafx.fxml.FXML
    private PieChart inventoryPieChart;
    @javafx.fxml.FXML
    private TableColumn<InventorySummaryItem,String> productColumn;
    @javafx.fxml.FXML
    private Button exportReportButton;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        productColumn.setCellValueFactory(new PropertyValueFactory<>("product"));
        valueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
    }

    @javafx.fxml.FXML
    public void handleExportReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateReport(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }
}