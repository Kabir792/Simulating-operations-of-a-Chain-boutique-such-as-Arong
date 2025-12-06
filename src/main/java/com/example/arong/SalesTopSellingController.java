package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.*;

public class SalesTopSellingController
{
    @javafx.fxml.FXML
    private TableColumn<TopSellingProduct,Integer> rankColumn;
    @javafx.fxml.FXML
    private BarChart topSellingBarChart;
    @javafx.fxml.FXML
    private TableView<TopSellingProduct> topSellingTable;
    @javafx.fxml.FXML
    private CategoryAxis xAxis;
    @javafx.fxml.FXML
    private Button topSellingButton;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<TopSellingProduct,Integer> salesCountColumn;
    @javafx.fxml.FXML
    private NumberAxis yAxis;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<TopSellingProduct,String> productNameColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleOpenTopSelling(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }
}