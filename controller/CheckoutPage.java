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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;

public class CheckoutPage implements Initializable{

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8;

    @FXML
    VBox myvbox;

    @FXML 
    Button backBtn;

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8,
    price1, price2, price3, price4,price5, price6, price7, price8, total;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6,
    choicebox7, choicebox8;

    private String[] quantity = { "1", "2", "3" };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
     
        name1.setText(CataloguePage.abyssal.getProductName());
        price1.setText(Double.toString(CataloguePage.abyssal.getProductPrice()));
        Image abyImg = new Image(CataloguePage.abyssal.getProductImage());
        img1.setImage(abyImg);

//----------------------------------------------------------------    

        name2.setText(CataloguePage.lumina.getProductName());
        price2.setText(Double.toString(CataloguePage.lumina.getProductPrice()));
        Image lumiImg = new Image(CataloguePage.lumina.getProductImage());
        img2.setImage(lumiImg);

//----------------------------------------------------------------

        name3.setText(CataloguePage.seraphina.getProductName());
        price3.setText(Double.toString(CataloguePage.seraphina.getProductPrice()));
        Image seraImg = new Image(CataloguePage.seraphina.getProductImage());
        img3.setImage(seraImg);

//----------------------------------------------------------------

        name4.setText(CataloguePage.celestia.getProductName());
        price4.setText(Double.toString(CataloguePage.celestia.getProductPrice()));
        Image celeImg = new Image(CataloguePage.celestia.getProductImage());
        img4.setImage(celeImg);

//----------------------------------------------------------------

        name5.setText(CataloguePage.novastrike.getProductName());
        price5.setText(Double.toString(CataloguePage.novastrike.getProductPrice()));
        Image novaImg = new Image(CataloguePage.novastrike.getProductImage());
        img5.setImage(novaImg);

//----------------------------------------------------------------

        name6.setText(CataloguePage.quantum.getProductName());
        price6.setText(Double.toString(CataloguePage.quantum.getProductPrice()));
        Image quanImg = new Image(CataloguePage.quantum.getProductImage());
        img6.setImage(quanImg);

//----------------------------------------------------------------

        name7.setText(CataloguePage.intellihear.getProductName());
        price7.setText(Double.toString(CataloguePage.intellihear.getProductPrice()));
        Image inteImg = new Image(CataloguePage.intellihear.getProductImage());
        img7.setImage(inteImg);

//----------------------------------------------------------------

        name8.setText(CataloguePage.octavision.getProductName());
        price8.setText(Double.toString(CataloguePage.octavision.getProductPrice()));
        Image octaImg = new Image(CataloguePage.octavision.getProductImage());
        img8.setImage(octaImg);

        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");
        choicebox5.setValue("1");
        choicebox6.setValue("1");
        choicebox7.setValue("1");
        choicebox8.setValue("1");

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);
        choicebox5.getItems().addAll(quantity);
        choicebox6.getItems().addAll(quantity);
        choicebox7.getItems().addAll(quantity);
        choicebox8.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);
        choicebox5.setOnAction(this::computeTotal);
        choicebox6.setOnAction(this::computeTotal);
        choicebox7.setOnAction(this::computeTotal);
        choicebox8.setOnAction(this::computeTotal);

        double totalInitialAmount = 0.00;
        if (CataloguePage.abyssal.getProductStatus() || CataloguePage.lumina.getProductStatus() || 
        CataloguePage.seraphina.getProductStatus() || CataloguePage.celestia.getProductStatus() ||
        CataloguePage.novastrike.getProductStatus() || CataloguePage.quantum.getProductStatus() || 
        CataloguePage.intellihear.getProductStatus() || CataloguePage.octavision.getProductStatus()){

            totalInitialAmount = Double.parseDouble(choicebox1.getValue()) * CataloguePage.abyssal.getProductPrice() +
            +Double.parseDouble(choicebox2.getValue()) * CataloguePage.lumina.getProductPrice()
            + Double.parseDouble(choicebox3.getValue()) * CataloguePage.seraphina.getProductPrice()
            + Double.parseDouble(choicebox4.getValue()) * CataloguePage.celestia.getProductPrice()
            + Double.parseDouble(choicebox5.getValue()) * CataloguePage.novastrike.getProductPrice()
            + Double.parseDouble(choicebox6.getValue()) * CataloguePage.quantum.getProductPrice()
            + Double.parseDouble(choicebox7.getValue()) * CataloguePage.intellihear.getProductPrice()
            + Double.parseDouble(choicebox8.getValue()) * CataloguePage.octavision.getProductPrice();

        // Display total initial amount in total label
        total.setText(Double.toString(totalInitialAmount));
        // TODO Auto-generated method stub

        }
     
    }

     public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

      public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item7Amount = 0;
        double item8Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

         if (CataloguePage.abyssal.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            CataloguePage.abyssal.setProductQuantity(qty);
            item1Amount = CataloguePage.abyssal.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = CataloguePage.abyssal.getProductPrice() * qty;
            }
        }

        if (CataloguePage.lumina.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            CataloguePage.lumina.setProductQuantity(qty);
            item2Amount = CataloguePage.lumina.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = CataloguePage.lumina.getProductPrice() * qty;
            }
        }

        
        if (CataloguePage.seraphina.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            CataloguePage.seraphina.setProductQuantity(qty);
            item3Amount = CataloguePage.seraphina.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = CataloguePage.seraphina.getProductPrice() * qty;
            }
        }


        if (CataloguePage.celestia.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            CataloguePage.celestia.setProductQuantity(qty);
            item4Amount = CataloguePage.celestia.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = CataloguePage.celestia.getProductPrice() * qty;
            }
        }

        if (CataloguePage.novastrike.getProductStatus()) {

            double qty = Double.parseDouble(choicebox5.getValue());
            CataloguePage.novastrike.setProductQuantity(qty);
            item5Amount = CataloguePage.novastrike.getProductPrice() * qty;

            if (source == choicebox5) {
                item5Amount = CataloguePage.novastrike.getProductPrice() * qty;
            }
        }

        if (CataloguePage.quantum.getProductStatus()) {

            double qty = Double.parseDouble(choicebox6.getValue());
            CataloguePage.quantum.setProductQuantity(qty);
            item6Amount = CataloguePage.quantum.getProductPrice() * qty;

            if (source == choicebox6) {
                item6Amount = CataloguePage.quantum.getProductPrice() * qty;
            }
        }

        if (CataloguePage.intellihear.getProductStatus()) {

            double qty = Double.parseDouble(choicebox7.getValue());
            CataloguePage.intellihear.setProductQuantity(qty);
            item7Amount = CataloguePage.intellihear.getProductPrice() * qty;

            if (source == choicebox7) {
                item7Amount = CataloguePage.intellihear.getProductPrice() * qty;
            }
        }

        if (CataloguePage.octavision.getProductStatus()) {

            double qty = Double.parseDouble(choicebox8.getValue());
            CataloguePage.octavision.setProductQuantity(qty);
            item8Amount = CataloguePage.octavision.getProductPrice() * qty;

            if (source == choicebox8) {
                item8Amount = CataloguePage.octavision.getProductPrice() * qty;
            }
        }

             // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount 
        + item7Amount + item8Amount;
        
        // Display total amount in total label
        total.setText(Double.toString(totalAmount));

      }

       public void getInitialAmount() {

            double totalAmount = 0.00;

        if (CataloguePage.abyssal.getProductStatus()) {
            totalAmount += CataloguePage.abyssal.getProductPrice();
        }

        if (CataloguePage.lumina.getProductStatus()) {
            totalAmount += CataloguePage.lumina.getProductPrice();
        }

        if (CataloguePage.seraphina.getProductStatus()) {
            totalAmount += CataloguePage.seraphina.getProductPrice();
        }

        if (CataloguePage.celestia.getProductStatus()) {
            totalAmount += CataloguePage.celestia.getProductPrice();
        }

        if (CataloguePage.novastrike.getProductStatus()) {
            totalAmount += CataloguePage.novastrike.getProductPrice();
        }

        if (CataloguePage.quantum.getProductStatus()) {
            totalAmount += CataloguePage.quantum.getProductPrice();
        }

        if (CataloguePage.intellihear.getProductStatus()) {
            totalAmount += CataloguePage.intellihear.getProductPrice();
        }

        if (CataloguePage.octavision.getProductStatus()) {
            totalAmount += CataloguePage.octavision.getProductPrice();
        }
       
        total.setText(Double.toString(totalAmount));

    }

        public void checkout(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/receiptPage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
    
}
