package com.example.oop_final_project;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class SalesInvoiceController
{
    @javafx.fxml.FXML
    private TableColumn<Invoice,Long> orderIdColumn;
    @javafx.fxml.FXML
    private Label invoiceNumberLabel;
    @javafx.fxml.FXML
    private TableColumn<Invoice,String> orderCustomerColumn;
    @javafx.fxml.FXML
    private TextArea invoiceNotesArea;
    @javafx.fxml.FXML
    private Label invoiceDateLabel;
    @javafx.fxml.FXML
    private Button printButton;
    @javafx.fxml.FXML
    private Label ordersMessageLabel;
    @javafx.fxml.FXML
    private TableView<Invoice> invoiceItemsTable;
    @javafx.fxml.FXML
    private Label customerNameLabel;
    @javafx.fxml.FXML
    private TableColumn<Invoice, LocalDate> orderDateColumn;
    @javafx.fxml.FXML
    private TableView<Invoice> ordersTable;
    @javafx.fxml.FXML
    private TableColumn<Invoice,Integer> itemTotalColumn;
    @javafx.fxml.FXML
    private Label subtotalLabel;
    @javafx.fxml.FXML
    private Button exportPdfButton;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<Invoice,String> itemProductColumn;
    @javafx.fxml.FXML
    private Label taxLabel;
    @javafx.fxml.FXML
    private Label grandTotalLabel;
    @javafx.fxml.FXML
    private TableColumn<Invoice,Double> itemPriceColumn;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private Label customerIdLabel;
    @javafx.fxml.FXML
    private TableColumn<Invoice,Integer> itemQtyColumn;
    @javafx.fxml.FXML
    private Button generateInvoiceButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleExportPdf(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handlePrintInvoice(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateInvoice(ActionEvent actionEvent) {
    }
}