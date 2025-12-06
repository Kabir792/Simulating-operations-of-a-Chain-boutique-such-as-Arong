package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.*;

public class SalesSummaryController
{
    @javafx.fxml.FXML
    private Button viewSalesSummaryButton;
    @javafx.fxml.FXML
    private TableColumn<saleSummaryRecord,Double> discountColumn;
    @javafx.fxml.FXML
    private CategoryAxis xAxis;
    @javafx.fxml.FXML
    private BarChart salesBarChart;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<saleSummaryRecord,Double> revenueColumn;
    @javafx.fxml.FXML
    private TableColumn<saleSummaryRecord,Double> netRevenueColumn;
    @javafx.fxml.FXML
    private NumberAxis yAxis;
    @javafx.fxml.FXML
    private TextField monthField;
    @javafx.fxml.FXML
    private TableView<saleSummaryRecord> salesSummaryTable;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<saleSummaryRecord,String> periodColumn;
    @javafx.fxml.FXML
    private Button exportSummaryButton;
    @javafx.fxml.FXML
    private Label validationMessageLabel;
    @javafx.fxml.FXML
    private Button generateSummaryButton;
    @javafx.fxml.FXML
    private TableColumn<saleSummaryRecord,Long> ordersColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateSummary(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOpenSalesSummary(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleExportSummary(ActionEvent actionEvent) {
    }
}