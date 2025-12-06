package com.example.arong;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.time.LocalDate;

public class CashFlowController
{
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private CategoryAxis xAxis;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private NumberAxis yAxis;
    @javafx.fxml.FXML
    private TextField monthField;
    @javafx.fxml.FXML
    private Button generateCashFlowButton;
    @javafx.fxml.FXML
    private Label validationMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<CashFlowReport,Double>  amountColumn;
    @javafx.fxml.FXML
    private TableColumn<CashFlowReport,String> typeColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<CashFlowReport,String> noteColumn;
    @javafx.fxml.FXML
    private BarChart cashFlowChart;
    @javafx.fxml.FXML
    private TableView<CashFlowReport> cashFlowTable;
    @javafx.fxml.FXML
    private TableColumn<CashFlowReport, LocalDate> dateColumn;

    @javafx.fxml.FXML
    public void initialize() {
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("totalInflow"));
        noteColumn.setCellValueFactory(new PropertyValueFactory<>("note"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleOpenCashFlowReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateCashFlow(ActionEvent actionEvent) {
    }
}