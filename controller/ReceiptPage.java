package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ReceiptPage implements Initializable{

    @FXML
    double item1Amount, item2Amount, item3Amount, item4Amount, item5Amount, item6Amount,
    item7Amount, item8Amount;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, 
    product1, product2, product3, product4, product5, product6, product7, product8,
    price1, price2, price3, price4, price5, price6, price7, price8, 
    amount1, amount2, amount3, amount4, amount5, amount6, amount7, amount8, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

      if (CataloguePage.abyssal.getProductStatus()) {
        product1.setText(CataloguePage.abyssal.getProductName());
        qty1.setText(Double.toString(CataloguePage.abyssal.getProductQuantity()));
        price1.setText(Double.toString(CataloguePage.abyssal.getProductPrice()));
        amount1.setText(Double.toString(CataloguePage.abyssal.getProductPrice() * CataloguePage.abyssal.getProductQuantity()));

        product1.setVisible(true);
        qty1.setVisible(true);
        price1.setVisible(true);
        amount1.setVisible(true);

        item1Amount = CataloguePage.abyssal.getProductPrice() * CataloguePage.abyssal.getProductQuantity();
    }

      if (CataloguePage.lumina.getProductStatus()) {
        product2.setText(CataloguePage.lumina.getProductName());
        qty2.setText(Double.toString(CataloguePage.lumina.getProductQuantity()));
        price2.setText(Double.toString(CataloguePage.lumina.getProductPrice()));
        amount2.setText(Double.toString(CataloguePage.lumina.getProductPrice() * CataloguePage.lumina.getProductQuantity()));
   
        product2.setVisible(true);
        qty2.setVisible(true);
        price2.setVisible(true);
        amount2.setVisible(true);

        item2Amount = CataloguePage.lumina.getProductPrice() * CataloguePage.lumina.getProductQuantity();
    }

      if (CataloguePage.seraphina.getProductStatus()) {
        product3.setText(CataloguePage.seraphina.getProductName());
        qty3.setText(Double.toString(CataloguePage.seraphina.getProductQuantity()));
        price3.setText(Double.toString(CataloguePage.seraphina.getProductPrice()));
        amount3.setText(Double.toString(CataloguePage.seraphina.getProductPrice() * CataloguePage.seraphina.getProductQuantity()));
  
        product3.setVisible(true);
        qty3.setVisible(true);
        price3.setVisible(true);
        amount3.setVisible(true);

        item3Amount = CataloguePage.seraphina.getProductPrice() * CataloguePage.seraphina.getProductQuantity();
    }

      if (CataloguePage.celestia.getProductStatus()) {
        product4.setText(CataloguePage.celestia.getProductName());
        qty4.setText(Double.toString(CataloguePage.celestia.getProductQuantity()));
        price4.setText(Double.toString(CataloguePage.celestia.getProductPrice()));
        amount4.setText(Double.toString(CataloguePage.celestia.getProductPrice() * CataloguePage.celestia.getProductQuantity()));
   
        product4.setVisible(true);
        qty4.setVisible(true);
        price4.setVisible(true);
        amount4.setVisible(true);

        item4Amount = CataloguePage.celestia.getProductPrice() * CataloguePage.celestia.getProductQuantity();
    }

      if (CataloguePage.novastrike.getProductStatus()) {
        product5.setText(CataloguePage.novastrike.getProductName());
        qty5.setText(Double.toString(CataloguePage.novastrike.getProductQuantity()));
        price5.setText(Double.toString(CataloguePage.novastrike.getProductPrice()));
        amount5.setText(Double.toString(CataloguePage.novastrike.getProductPrice() * CataloguePage.novastrike.getProductQuantity()));

        product5.setVisible(true);
        qty5.setVisible(true);
        price5.setVisible(true);
        amount5.setVisible(true);


        item5Amount = CataloguePage.novastrike.getProductPrice() * CataloguePage.novastrike.getProductQuantity();
    }

      if (CataloguePage.quantum.getProductStatus()) {
        product6.setText(CataloguePage.quantum.getProductName());
        qty6.setText(Double.toString(CataloguePage.quantum.getProductQuantity()));
        price6.setText(Double.toString(CataloguePage.quantum.getProductPrice()));
        amount6.setText(Double.toString(CataloguePage.quantum.getProductPrice() * CataloguePage.quantum.getProductQuantity()));

    
        product6.setVisible(true);
        qty6.setVisible(true);
        price6.setVisible(true);
        amount6.setVisible(true);


        item6Amount = CataloguePage.quantum.getProductPrice() * CataloguePage.quantum.getProductQuantity();
    }

      if (CataloguePage.intellihear.getProductStatus()) {
        product7.setText(CataloguePage.intellihear.getProductName());
        qty7.setText(Double.toString(CataloguePage.intellihear.getProductQuantity()));
        price7.setText(Double.toString(CataloguePage.intellihear.getProductPrice()));
        amount7.setText(Double.toString(CataloguePage.intellihear.getProductPrice() * CataloguePage.intellihear.getProductQuantity()));

    
        product7.setVisible(true);
        qty7.setVisible(true);
        price7.setVisible(true);
        amount7.setVisible(true);

        item7Amount = CataloguePage.intellihear.getProductPrice() * CataloguePage.intellihear.getProductQuantity();
    }

      if (CataloguePage.octavision.getProductStatus()) {
        product8.setText(CataloguePage.octavision.getProductName());
        qty8.setText(Double.toString(CataloguePage.octavision.getProductQuantity()));
        price8.setText(Double.toString(CataloguePage.octavision.getProductPrice()));
        amount8.setText(Double.toString(CataloguePage.octavision.getProductPrice() * CataloguePage.octavision.getProductQuantity()));

    
        product8.setVisible(true);
        qty8.setVisible(true);
        price8.setVisible(true);
        amount8.setVisible(true);

        item8Amount = CataloguePage.octavision.getProductPrice() * CataloguePage.octavision.getProductQuantity();
    }

     double final_amount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount
        + item7Amount + item8Amount;

        total.setText(Double.toString(final_amount));

    }

    public void homeButtonClick(ActionEvent event) throws IOException{

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/welcomePage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
}
