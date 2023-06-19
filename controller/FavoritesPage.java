package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;


public class FavoritesPage implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8;

    @FXML
    VBox myvbox2;


    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8,
    price1, price2, price3, price4,price5, price6, price7, price8;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(CataloguePage.abyssal.getProductName());
        price1.setText(Double.toString(CataloguePage.abyssal.getProductPrice()));
        Image abyImg = new Image(CataloguePage.abyssal.getProductImage());
        img1.setImage(abyImg);

        name2.setText(CataloguePage.lumina.getProductName());
        price2.setText(Double.toString(CataloguePage.lumina.getProductPrice()));
        Image lumiImg = new Image(CataloguePage.lumina.getProductImage());
        img2.setImage(lumiImg);

        name3.setText(CataloguePage.seraphina.getProductName());
        price3.setText(Double.toString(CataloguePage.seraphina.getProductPrice()));
        Image sepiImg = new Image(CataloguePage.seraphina.getProductImage());
        img3.setImage(sepiImg);

        name4.setText(CataloguePage.celestia.getProductName());
        price4.setText(Double.toString(CataloguePage.celestia.getProductPrice()));
        Image celeImg = new Image(CataloguePage.celestia.getProductImage());
        img4.setImage(celeImg);

        name5.setText(CataloguePage.novastrike.getProductName());
        price5.setText(Double.toString(CataloguePage.novastrike.getProductPrice()));
        Image novaImg = new Image(CataloguePage.novastrike.getProductImage());
        img5.setImage(novaImg);

        name6.setText(CataloguePage.quantum.getProductName());
        price6.setText(Double.toString(CataloguePage.quantum.getProductPrice()));
        Image quanImg = new Image(CataloguePage.quantum.getProductImage());
        img6.setImage(quanImg);

        name7.setText(CataloguePage.intellihear.getProductName());
        price7.setText(Double.toString(CataloguePage.intellihear.getProductPrice()));
        Image inteImg = new Image(CataloguePage.intellihear.getProductImage());
        img7.setImage(inteImg);

        name8.setText(CataloguePage.octavision.getProductName());
        price8.setText(Double.toString(CataloguePage.octavision.getProductPrice()));
        Image octaImg = new Image(CataloguePage.octavision.getProductImage());
        img8.setImage(octaImg);
 
    }

     public void addItem(Pane pane) {
     myvbox2.getChildren().add(pane);
     
    }

        public void backBtnClick(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/cataloguePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
}
