package controller;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.collections.ObservableList; 
import javafx.fxml.FXMLLoader;


public class RegisterPage {

    ObservableList<String> genderList = FXCollections.observableArrayList("Male", "Female", "Other");

    @FXML 
    TextField firstname, middlename, surname, address, email; 

    @FXML 
    Button registerBtn;

    @FXML 
    ChoiceBox  genderChoiceBox;

    @FXML
    public void initialize() {
    genderChoiceBox.setValue("-");
    genderChoiceBox.setItems(genderList);
    
    }

    public void registerButtonClicked(ActionEvent event) throws IOException{

        if (firstname.getText().isEmpty() || surname.getText().isEmpty() || address.getText().isEmpty() 
        || email.getText().isEmpty()){

           Alert alert = new Alert(AlertType.WARNING,
           "Please fill up the required information");
           alert.show();

       } else {
        

           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/termsAndConditionPage.fxml"));
           Parent root = loader.load();
           Scene scene = new Scene(root);
           stage.setScene(scene);
           stage.show();

       }
       
    }

}
    

