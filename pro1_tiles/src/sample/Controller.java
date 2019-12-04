package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button tile0, tile1, tile2, tile3, tile4;
    @FXML
    private Button tile5, tile6, tile7, tile8, tile9;
    @FXML
    private Button tile10, tile11, tile12, tile13, tile14;
    @FXML
    private Button tile15, tile16, tile17, tile18, tile19;

    private String img1, img2;


    public Controller() {
        System.out.println("Controler działa");
    }


    @FXML
    void initialize() {
        img1 = "-fx-background-image: url('https://ocdn.eu/pulscms-transforms/1/c2iktkpTURBXy8wNWIxNDFiZmE2ZGNkYmExOGNkMWNjNmMxYzQ5ZTNhMS5qcGeRkwIAzQHk')";
        //img2 = "";


        String img0 = "-fx-background-image: url('/img/nosacz.png')";


        tile1.getStyleClass().add("tileBlank");
        tile5.getStyleClass().add("tileBlank");



        tile5.setStyle(img1);
    }


    @FXML
    public void tileClick(){
        System.out.println("klik");
        tile1.setStyle(img1);
    }
}
