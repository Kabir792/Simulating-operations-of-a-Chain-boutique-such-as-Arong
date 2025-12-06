package com.example.arong;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.time.LocalDate;

public class DailySalesController
{
    @javafx.fxml.FXML
    private TextField onlineSalesField;
    @javafx.fxml.FXML
    private TextField cardSalesField;
    @javafx.fxml.FXML
    private TableView<DailySalesRecord> salesTable;
    @javafx.fxml.FXML
    private TableColumn<DailySalesRecord,Double> totalColumn;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextField totalSalesField;
    @javafx.fxml.FXML
    private TableColumn<DailySalesRecord,Double> cardColumn;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<DailySalesRecord,Double> cashColumn;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private Button saveSalesButton;
    @javafx.fxml.FXML
    private TextField cashSalesField;
    @javafx.fxml.FXML
    private TableColumn<DailySalesRecord,Double> onlineColumn;
    @javafx.fxml.FXML
    private TableColumn<DailySalesRecord, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TextField costOfGoodsSoldTextField;
    @javafx.fxml.FXML
    private Label c;

    @javafx.fxml.FXML
    public void initialize() {

        totalColumn.setCellValueFactory(new PropertyValueFactory<>("totalSales"));
        cardColumn.setCellValueFactory(new PropertyValueFactory<>("cardSales"));
        cashColumn.setCellValueFactory(new PropertyValueFactory<>("cashSales"));
        onlineColumn.setCellValueFactory(new PropertyValueFactory<>("onlineSales"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleOpenRecordSales(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSaveSales(ActionEvent actionEvent) {
    }
}