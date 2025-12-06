package com.example.arong;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CustomerWishlistController
{
    @javafx.fxml.FXML
    private TableView<CustomerWishlist> productsTable;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<CustomerWishlist,String> wishlistProductColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerWishlist,String> wishlistPriceColumn;
    @javafx.fxml.FXML
    private Button addToWishlistButton;
    @javafx.fxml.FXML
    private TableView<CustomerWishlist> wishlistTable;
    @javafx.fxml.FXML
    private Label loginMessageLabel;
    @javafx.fxml.FXML
    private Label errorMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<CustomerWishlist,Boolean> availabilityColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerWishlist,String> productNameColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerWishlist,Double> priceColumn;

    @javafx.fxml.FXML
    public void initialize() {
        wishlistProductColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        wishlistPriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        availabilityColumn.setCellValueFactory(new PropertyValueFactory<>("avilable"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    }

    @javafx.fxml.FXML
    public void handleAddToWishlist(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLogin(ActionEvent actionEvent) {
    }
}