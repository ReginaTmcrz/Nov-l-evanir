package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.border.EtchedBorder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import alert.AlertMaker;

public class CataloguePage implements Initializable{

   @FXML
    Button button1, button2, button3, button4, button5, button6, button7, button8,
    likeBtn1, likeBtn2, likeBtn3, likeBtn4, likeBtn5, likeBtn6, likeBtn7, likeBtn8, 
    mycartBtn, backBtn, favoritesBtn;

   @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8,
    price1, price2, price3, price4, price5, price6, price7, price8; 

   @FXML
    private Stage stage, stage2;

   @FXML
    private Scene scene, scene2;

   @FXML
    private Parent root = null;

   @FXML
    private Parent root2 = null;

    FXMLLoader loader, loader2;

    @FXML
    CheckoutPage checkoutPage = null;

    @FXML 
    FavoritesPage favoritesPage = null;


    // Accessories
   static Abyssal abyssal = new Abyssal();
   static Lumina lumina = new Lumina();
   static Seraphina seraphina = new Seraphina();
   static Celestia celestia = new Celestia();

   // Weapons
   static Novastrike novastrike = new Novastrike();
   static Quantum quantum = new Quantum();
   static Intellihear intellihear = new Intellihear();
   static Octavision octavision = new Octavision();


   @Override
   public void initialize(URL location, ResourceBundle resources) {

        abyssal.setProductName("ABYSSAL");
        name1.setText(abyssal.getProductName());

        abyssal.setProductPrice(199000.75);
        price1.setText(Double.toString(abyssal.getProductPrice()));

        abyssal.setProductImage("images/Abyssal.png");

//----------------------------------------------------------------
        lumina.setProductName("LUMINA");
        name2.setText(lumina.getProductName());

        lumina.setProductPrice(188000.50);
        price2.setText(Double.toString(lumina.getProductPrice()));

        lumina.setProductImage("images/Lumina.png");

//----------------------------------------------------------------
        seraphina.setProductName("SERAPHINA");
        name3.setText(seraphina.getProductName());

        seraphina.setProductPrice(199000.75);
        price3.setText(Double.toString(seraphina.getProductPrice()));

        seraphina.setProductImage("images/Seraphina.png");

//----------------------------------------------------------------
        celestia.setProductName("CELESTIA");
        name4.setText(celestia.getProductName());

        celestia.setProductPrice(188800.50);
        price4.setText(Double.toString(celestia.getProductPrice()));

        celestia.setProductImage("images/Celestia.png");

//----------------------------------------------------------------
        novastrike.setProductName("NOVASTRIKE");
        name5.setText(novastrike.getProductName());

        novastrike.setProductPrice(559999.00);
        price5.setText(Double.toString(novastrike.getProductPrice()));

        novastrike.setProductImage("images/Novastrike.jpeg");

//----------------------------------------------------------------
      quantum.setProductName("QUANTUM");
        name6.setText(quantum.getProductName());

        quantum.setProductPrice(399999.00);
        price6.setText(Double.toString(quantum.getProductPrice()));

        quantum.setProductImage("images/Quantum.jpeg");

//----------------------------------------------------------------
      intellihear.setProductName("INTELLIHEAR");
        name7.setText(intellihear.getProductName());

        intellihear.setProductPrice(599000.00);
        price7.setText(Double.toString(intellihear.getProductPrice()));

        intellihear.setProductImage("images/Intellihear.jpeg");

//----------------------------------------------------------------
      octavision.setProductName("OCTAVISION");
        name8.setText(octavision.getProductName());

        octavision.setProductPrice(499000.00);
        price8.setText(Double.toString(octavision.getProductPrice()));

        octavision.setProductImage("images/Octavision.jpeg");
        
   try {
            loader = new FXMLLoader(getClass().getResource("/view/checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // Clears all items in Checkout.fxml
         checkoutPage = loader.getController();
         checkoutPage.myvbox.getChildren().removeAll(checkoutPage.myvbox.getChildren());


        try{ 
            loader2 = new FXMLLoader(getClass().getResource("/view/favoritesPage.fxml"));
            root2 = loader2.load();
         }catch (Exception e){

         }
         favoritesPage = loader2.getController();
         favoritesPage.myvbox2.getChildren().removeAll(favoritesPage.myvbox2.getChildren());
   }

   public void like(ActionEvent event) throws IOException {
     AlertMaker.showSimpleAlert("hello", "item added in you favorites section!");
     Button sourceButton = (Button) event.getSource();

        if (sourceButton == likeBtn1) {
        abyssal.setProductStatus(true);
        favoritesPage.addItem(favoritesPage.pane1);

        } else if (sourceButton == likeBtn2) {
            lumina.setProductStatus(true);
            favoritesPage.addItem(favoritesPage.pane2);

        } else if (sourceButton == likeBtn3) {
            seraphina.setProductStatus(true);
            favoritesPage.addItem(favoritesPage.pane3);

        } else if (sourceButton == likeBtn4) {
            celestia.setProductStatus(true);
            favoritesPage.addItem(favoritesPage.pane4);

        } else if (sourceButton == likeBtn5) {
            novastrike.setProductStatus(true);
            favoritesPage.addItem(favoritesPage.pane5);

        } else if (sourceButton == likeBtn6) {
            quantum.setProductStatus(true);
            favoritesPage.addItem(favoritesPage.pane6);

        } else if (sourceButton == likeBtn7) {
            intellihear.setProductStatus(true);
            favoritesPage.addItem(favoritesPage.pane7);

        }else if (sourceButton == likeBtn8) {
            octavision.setProductStatus(true);
            favoritesPage.addItem(favoritesPage.pane8);
        }

   }

       public void gotoFavorites(ActionEvent event) throws IOException {

        Scene scene = new Scene(root2);
        stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage2.setScene(scene);
        stage2.show();

}
     public void buy(ActionEvent event) throws IOException {

      AlertMaker.showSimpleAlert("hello", "item added");
      Button sourceButton = (Button) event.getSource();

       if (sourceButton == button1) {
            abyssal.setProductStatus(true);
            CataloguePage.abyssal.setProductQuantity(1);
            checkoutPage.addItem(checkoutPage.pane1);

        }  else if (sourceButton == button2) {
            lumina.setProductStatus(true);
            CataloguePage.lumina.setProductQuantity(1);
            checkoutPage.addItem(checkoutPage.pane2);
        }

        else if (sourceButton == button3) {
            seraphina.setProductStatus(true);
            CataloguePage.seraphina.setProductQuantity(1);
            checkoutPage.addItem(checkoutPage.pane3);
        }

        else if (sourceButton == button4) {
            celestia.setProductStatus(true);
            CataloguePage.celestia.setProductQuantity(1);
            checkoutPage.addItem(checkoutPage.pane4);
        }

        else if (sourceButton == button5) {
            novastrike.setProductStatus(true);
            CataloguePage.novastrike.setProductQuantity(1);
            checkoutPage.addItem(checkoutPage.pane5);
        }

        else if (sourceButton == button6) {
            quantum.setProductStatus(true);
            CataloguePage.quantum.setProductQuantity(1);
            checkoutPage.addItem(checkoutPage.pane6);
        }
    
        else if (sourceButton == button7) {
            intellihear.setProductStatus(true);
            CataloguePage.intellihear.setProductQuantity(1);
            checkoutPage.addItem(checkoutPage.pane7);
        }

        else if (sourceButton == button8) {
            octavision.setProductStatus(true);
            CataloguePage.octavision.setProductQuantity(1);
            checkoutPage.addItem(checkoutPage.pane8);
        }

     }

     public void gotocart(ActionEvent event) throws IOException {

        checkoutPage.getInitialAmount();

        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void viewabyssalPage(ActionEvent event) throws IOException{

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/abyssalPage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void viewLuminaPage(ActionEvent event) throws IOException{

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/luminaPage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void viewSeraphinaPage(ActionEvent event) throws IOException{

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/seraphinaPage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

        public void viewCelestiaPage(ActionEvent event) throws IOException{

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/celestiaPage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

        public void viewNovastrikePage(ActionEvent event) throws IOException{

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/novastrikePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

        public void viewQuantumPage(ActionEvent event) throws IOException{

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/quantumPage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


        public void viewIntellihearPage(ActionEvent event) throws IOException{

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/intellihearPage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

        public void viewOctavisionPage(ActionEvent event) throws IOException{

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/octavisionPage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

        public void backBtnClick(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/welcomePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
