
package quran;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTabPane;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.util.Duration;


public class FXMLDocumentController implements Initializable {
    
    static Connection c=null;
    static PreparedStatement st=null;
    static Statement stt=null;
    static String query;
    static ResultSet r=null;
    
    int count_taspeh=0;
    int switchCounter=1;

    public FXMLDocumentController() {
         c=connectionH2.conDB();
    }
    
    @FXML
    private ScrollPane Azkar_scroll;
    
    @FXML
    private ScrollPane scroll_quran;
    
    @FXML
    private ScrollPane scroll_Sura;
    
    @FXML
    private HBox Footer;
    
    @FXML
    private AnchorPane header;
    
    @FXML
    private JFXTabPane MainScroll;

    @FXML
    private JFXButton Start;

    @FXML
    private ImageView star16;

    @FXML
    private ImageView star15;

    @FXML
    private ImageView star14;

    @FXML
    private ImageView star13;

    @FXML
    private ImageView star4;

    @FXML
    private ImageView star6;

    @FXML
    private ImageView star5;

    @FXML
    private ImageView star3;

    @FXML
    private ImageView star7;

    @FXML
    private ImageView star8;

    @FXML
    private ImageView star9;

    @FXML
    private ImageView star10;

    @FXML
    private ImageView star12;

    @FXML
    private ImageView star11;

    @FXML
    private ImageView star2;

    @FXML
    private ImageView star17;

    @FXML
    private ImageView star1;
    
    @FXML
    private ImageView galaxy;
    
    @FXML
    private JFXButton Quran;
    
    @FXML
    private JFXTabPane Content_pan;
    
    @FXML
    private ImageView Mode_image;
    
    @FXML
    private JFXButton Mode;
    
    @FXML
    private Label FirstAyah;
    
    @FXML
    private Text SuraContent;
    
    @FXML
    private JFXButton Maspha;
    
     @FXML
    private JFXButton Allah_names;
    
    ////////////////////// buttons ///////////////////////////////
    @FXML
    private JFXButton Sura1;
    
    @FXML
    private JFXButton Sura2;
    
    @FXML
    private JFXButton Sura3;
    
    @FXML
    private JFXButton Sura4;
    
    @FXML
    private JFXButton Sura5;
    
    @FXML
    private JFXButton Sura6;

    @FXML
    private JFXButton Sura7;
    
    @FXML
    private JFXButton Sura8;
    
    @FXML
    private JFXButton Sura9;
    
    @FXML
    private JFXButton Sura10;
    
    @FXML
    private JFXButton Sura11;
    
    @FXML
    private JFXButton Sura12;

    @FXML
    private JFXButton Sura13;
    
    @FXML
    private JFXButton Sura14;
    
    @FXML
    private JFXButton Sura15;
    
    @FXML
    private JFXButton Sura16;
    
    @FXML
    private JFXButton Sura17;
    
    @FXML
    private JFXButton Sura18;
    
    @FXML
    private JFXButton Sura19;
    
    @FXML
    private JFXButton Sura20;
    
    @FXML
    private JFXButton Sura21;
    
    @FXML
    private JFXButton Sura22;
    
    @FXML
    private JFXButton Sura23;
    
    @FXML
    private JFXButton Sura24;
    
    @FXML
    private JFXButton Sura25;
    
    @FXML
    private JFXButton Sura26;
    
    @FXML
    private JFXButton Sura27;
    
    @FXML
    private JFXButton Sura28;
    
    @FXML
    private JFXButton Sura29;
    
    @FXML
    private JFXButton Sura30;
    
    @FXML
    private JFXButton Sura31;
    
    @FXML
    private JFXButton Sura32;
    
    @FXML
    private JFXButton Sura33;
    
    @FXML
    private JFXButton Sura34;
    
    @FXML
    private JFXButton Sura35;
    
    @FXML
    private JFXButton Sura36;
    
    @FXML
    private JFXButton Sura37;
    
    @FXML
    private JFXButton Sura38;
    
    @FXML
    private JFXButton Sura39;
    
    @FXML
    private JFXButton Sura40;
    
    @FXML
    private JFXButton Sura41;
    
    @FXML
    private JFXButton Sura42;
    
    @FXML
    private JFXButton Sura43;
    
    @FXML
    private JFXButton Sura44;
    
    @FXML
    private JFXButton Sura45;
    
    @FXML
    private JFXButton Sura46;
    
    @FXML
    private JFXButton Sura47;
    
    @FXML
    private JFXButton Sura48;
    
    @FXML
    private JFXButton Sura49;
    
    @FXML
    private JFXButton Sura50;
    
    @FXML
    private JFXButton Sura51;
    
    @FXML
    private JFXButton Sura52;
    
    @FXML
    private JFXButton Sura53;
    
    @FXML
    private JFXButton Sura54;
    
    @FXML
    private JFXButton Sura55;
    
    @FXML
    private JFXButton Sura56;
    
    @FXML
    private JFXButton Sura57;
    
    @FXML
    private JFXButton Sura58;
    
    @FXML
    private JFXButton Sura59;
    
    @FXML
    private JFXButton Sura60;
    
    @FXML
    private JFXButton Sura61;
    
    @FXML
    private JFXButton Sura62;
    
    @FXML
    private JFXButton Sura63;
    
    @FXML
    private JFXButton Sura64;
    
    @FXML
    private JFXButton Sura65;
    
    @FXML
    private JFXButton Sura66;
    
    @FXML
    private JFXButton Sura67;
    
    @FXML
    private JFXButton Sura68;
    
    @FXML
    private JFXButton Sura69;
    
    @FXML
    private JFXButton Sura70;
    
    @FXML
    private JFXButton Sura71;
    
    @FXML
    private JFXButton Sura72;
    
    @FXML
    private JFXButton Sura73;
    
    @FXML
    private JFXButton Sura74;
    
    @FXML
    private JFXButton Sura75;
    
    @FXML
    private JFXButton Sura76;
    
    @FXML
    private JFXButton Sura77;
    
    @FXML
    private JFXButton Sura78;
    
    @FXML
    private JFXButton Sura79;
    
    @FXML
    private JFXButton Sura80;
    
    @FXML
    private JFXButton Sura81;
    
    @FXML
    private JFXButton Sura82;
    
    @FXML
    private JFXButton Sura83;
    
    @FXML
    private JFXButton Sura84;
    
    @FXML
    private JFXButton Sura85;
    
    @FXML
    private JFXButton Sura86;
    
    @FXML
    private JFXButton Sura87;
    
    @FXML
    private JFXButton Sura88;
    
    @FXML
    private JFXButton Sura89;
    
    @FXML
    private JFXButton Sura90;
    
    @FXML
    private JFXButton Sura91;
    
    @FXML
    private JFXButton Sura92;
    
    @FXML
    private JFXButton Sura93;
    
    @FXML
    private JFXButton Sura94;
    
    @FXML
    private JFXButton Sura95;
    
    @FXML
    private JFXButton Sura96;
    
    @FXML
    private JFXButton Sura97;
    
    @FXML
    private JFXButton Sura98;
    
    @FXML
    private JFXButton Sura99;
    
    @FXML
    private JFXButton Sura100;
    
    @FXML
    private JFXButton Sura101;
    
    @FXML
    private JFXButton Sura102;
    
    @FXML
    private JFXButton Sura103;
    
    @FXML
    private JFXButton Sura104;
    
    @FXML
    private JFXButton Sura105;
    
    @FXML
    private JFXButton Sura106;
    
    @FXML
    private JFXButton Sura107;
    
    @FXML
    private JFXButton Sura108;
    
    @FXML
    private JFXButton Sura109;
    
    @FXML
    private JFXButton Sura110;
    
    @FXML
    private JFXButton Sura111;
    
    @FXML
    private JFXButton Sura112;
    
    @FXML
    private JFXButton Sura113;
    
    @FXML
    private JFXButton Sura114;
    
    ////////////////////// Taspeh ///////////////////////////////
    @FXML
    private Circle C1;
     
    @FXML
    private Circle C2;
    
    @FXML
    private Circle C3;
       
    @FXML
    private Circle C4;
        
    @FXML
    private Circle C5;
         
    @FXML
    private Circle C6;
          
    @FXML
    private Circle C7;
           
    @FXML
    private Circle C8;
            
    @FXML
    private Circle C9;
             
    @FXML
    private Circle C10;
    
    @FXML
    private JFXButton Taspeh_button;

    @FXML
    private Label Tasbeh;
    
    @FXML
    private JFXButton Azkar;
    
    @FXML
    private Label AyaNUM;
    
    @FXML
    private Label Sura_TYPE;
    
     //////////////////////// Azkar buttons //////////////////////////////
    @FXML
    private JFXSpinner Spin0;

    @FXML
    private ImageView Azkar_correct0;

    @FXML
    private JFXButton Azkar_press0;
    
    @FXML
    private JFXSpinner Spin1;

    @FXML
    private ImageView Azkar_correct1;

    @FXML
    private JFXButton Azkar_press1;
    
    @FXML
    private JFXSpinner Spin2;

    @FXML
    private ImageView Azkar_correct2;

    @FXML
    private JFXButton Azkar_press2;
    
    @FXML
    private JFXSpinner Spin3;

    @FXML
    private ImageView Azkar_correct3;

    @FXML
    private JFXButton Azkar_press3;
    
    @FXML
    private JFXSpinner Spin4;

    @FXML
    private ImageView Azkar_correct4;

    @FXML
    private JFXButton Azkar_press4;
    
    @FXML
    private JFXSpinner Spin5;

    @FXML
    private ImageView Azkar_correct5;

    @FXML
    private JFXButton Azkar_press5;
    
    @FXML
    private JFXSpinner Spin6;

    @FXML
    private ImageView Azkar_correct6;

    @FXML
    private JFXButton Azkar_press6;
    
    @FXML
    private JFXSpinner Spin7;

    @FXML
    private ImageView Azkar_correct7;

    @FXML
    private JFXButton Azkar_press7;
    
    @FXML
    private JFXSpinner Spin8;

    @FXML
    private ImageView Azkar_correct8;

    @FXML
    private JFXButton Azkar_press8;
    
    @FXML
    private JFXSpinner Spin9;

    @FXML
    private ImageView Azkar_correct9;

    @FXML
    private JFXButton Azkar_press9;
    
    @FXML
    private JFXSpinner Spin10;

    @FXML
    private ImageView Azkar_correct10;

    @FXML
    private JFXButton Azkar_press10;
    
    @FXML
    private JFXSpinner Spin11;

    @FXML
    private ImageView Azkar_correct11;

    @FXML
    private JFXButton Azkar_press11;
    
    @FXML
    private JFXSpinner Spin12;

    @FXML
    private ImageView Azkar_correct12;

    @FXML
    private JFXButton Azkar_press12;
    ///////////////////////////////////////////////////////////////

    boolean mode_falg = true;
    @FXML
    void ModeAction(ActionEvent event) {
        if (mode_falg == true){
            File file_picture1 = new File("C:\\Quran\\src\\images\\spiritual-wellness.png");
            Image image_pic = new Image(file_picture1.toURI().toString());
            Mode_image.setImage(image_pic);
            mode_falg = false;
            
//            header.setStyle("-fx-background-color: linear-gradient(to left , #333333, #FB5607 , #F9C74F);");
//            Footer.setStyle("-fx-background-color: linear-gradient(to left ,#333333 , #FB5607 , #F9C74F);");
//            scroll_quran.setStyle("-fx-background: linear-gradient(to left , #333333, #FB5607 , #F9C74F);-fx-background-color: linear-gradient(to left , #333333, #FB5607 , #F9C74F);");
            
            
            header.setStyle("-fx-background-color: linear-gradient(to left , #E76F51 , #F9C74F);");
            Footer.setStyle("-fx-background-color: linear-gradient(to left , #E76F51 , #F9C74F);");
            scroll_quran.setStyle("-fx-background: linear-gradient(to left , #E76F51 , #F9C74F);-fx-background-color: linear-gradient(to left, #E76F51 , #F9C74F);");
            scroll_Sura.setStyle("-fx-background: linear-gradient(to left , #E76F51 , #F9C74F);-fx-background-color: linear-gradient(to left, #E76F51 , #F9C74F);");
            FirstAyah.setTextFill(Paint.valueOf("#ffffff"));
            SuraContent.setFill(Paint.valueOf("#ffffff"));
                    
            ////////////////////// buttons ///////////////////////////////
            
            
            Sura1.setRipplerFill(Paint.valueOf("yellow"));
            Sura2.setRipplerFill(Paint.valueOf("yellow"));
            Sura3.setRipplerFill(Paint.valueOf("yellow"));
            Sura4.setRipplerFill(Paint.valueOf("yellow"));
            Sura5.setRipplerFill(Paint.valueOf("yellow"));
            Sura6.setRipplerFill(Paint.valueOf("yellow"));
            Sura7.setRipplerFill(Paint.valueOf("yellow"));
            Sura8.setRipplerFill(Paint.valueOf("yellow"));
            Sura9.setRipplerFill(Paint.valueOf("yellow"));
            Sura10.setRipplerFill(Paint.valueOf("yellow"));
            Sura11.setRipplerFill(Paint.valueOf("yellow"));
            Sura12.setRipplerFill(Paint.valueOf("yellow"));
            Sura13.setRipplerFill(Paint.valueOf("yellow"));
            Sura14.setRipplerFill(Paint.valueOf("yellow"));
            Sura15.setRipplerFill(Paint.valueOf("yellow"));
            Sura16.setRipplerFill(Paint.valueOf("yellow"));
            Sura17.setRipplerFill(Paint.valueOf("yellow"));
            Sura18.setRipplerFill(Paint.valueOf("yellow"));
            Sura19.setRipplerFill(Paint.valueOf("yellow"));
            Sura20.setRipplerFill(Paint.valueOf("yellow"));
            Sura21.setRipplerFill(Paint.valueOf("yellow"));
            Sura22.setRipplerFill(Paint.valueOf("yellow"));
            Sura23.setRipplerFill(Paint.valueOf("yellow"));
            Sura24.setRipplerFill(Paint.valueOf("yellow"));
            Sura25.setRipplerFill(Paint.valueOf("yellow"));
            Sura26.setRipplerFill(Paint.valueOf("yellow"));
            Sura27.setRipplerFill(Paint.valueOf("yellow"));
            Sura28.setRipplerFill(Paint.valueOf("yellow"));
            Sura29.setRipplerFill(Paint.valueOf("yellow"));
            Sura30.setRipplerFill(Paint.valueOf("yellow"));
            Sura31.setRipplerFill(Paint.valueOf("yellow"));
            Sura32.setRipplerFill(Paint.valueOf("yellow"));
            Sura33.setRipplerFill(Paint.valueOf("yellow"));
            Sura34.setRipplerFill(Paint.valueOf("yellow"));
            Sura35.setRipplerFill(Paint.valueOf("yellow"));
            Sura36.setRipplerFill(Paint.valueOf("yellow"));
            Sura37.setRipplerFill(Paint.valueOf("yellow"));
            Sura38.setRipplerFill(Paint.valueOf("yellow"));
            Sura39.setRipplerFill(Paint.valueOf("yellow"));
            Sura40.setRipplerFill(Paint.valueOf("yellow"));
            Sura41.setRipplerFill(Paint.valueOf("yellow"));
            Sura42.setRipplerFill(Paint.valueOf("yellow"));
            Sura43.setRipplerFill(Paint.valueOf("yellow"));
            Sura44.setRipplerFill(Paint.valueOf("yellow"));
            Sura45.setRipplerFill(Paint.valueOf("yellow"));
            Sura46.setRipplerFill(Paint.valueOf("yellow"));
            Sura47.setRipplerFill(Paint.valueOf("yellow"));
            Sura48.setRipplerFill(Paint.valueOf("yellow"));
            Sura49.setRipplerFill(Paint.valueOf("yellow"));
            Sura50.setRipplerFill(Paint.valueOf("yellow"));
            Sura51.setRipplerFill(Paint.valueOf("yellow"));
            Sura52.setRipplerFill(Paint.valueOf("yellow"));
            Sura53.setRipplerFill(Paint.valueOf("yellow"));
            Sura54.setRipplerFill(Paint.valueOf("yellow"));
            Sura55.setRipplerFill(Paint.valueOf("yellow"));
            Sura56.setRipplerFill(Paint.valueOf("yellow"));
            Sura57.setRipplerFill(Paint.valueOf("yellow"));
            Sura58.setRipplerFill(Paint.valueOf("yellow"));
            Sura59.setRipplerFill(Paint.valueOf("yellow"));
            Sura60.setRipplerFill(Paint.valueOf("yellow"));
            Sura61.setRipplerFill(Paint.valueOf("yellow"));
            Sura62.setRipplerFill(Paint.valueOf("yellow"));
            Sura63.setRipplerFill(Paint.valueOf("yellow"));
            Sura64.setRipplerFill(Paint.valueOf("yellow"));
            Sura65.setRipplerFill(Paint.valueOf("yellow"));
            Sura66.setRipplerFill(Paint.valueOf("yellow"));
            Sura67.setRipplerFill(Paint.valueOf("yellow"));
            Sura68.setRipplerFill(Paint.valueOf("yellow"));
            Sura69.setRipplerFill(Paint.valueOf("yellow"));
            Sura70.setRipplerFill(Paint.valueOf("yellow"));
            Sura71.setRipplerFill(Paint.valueOf("yellow"));
            Sura72.setRipplerFill(Paint.valueOf("yellow"));
            Sura73.setRipplerFill(Paint.valueOf("yellow"));
            Sura74.setRipplerFill(Paint.valueOf("yellow"));
            Sura75.setRipplerFill(Paint.valueOf("yellow"));
            Sura76.setRipplerFill(Paint.valueOf("yellow"));
            Sura77.setRipplerFill(Paint.valueOf("yellow"));
            Sura78.setRipplerFill(Paint.valueOf("yellow"));
            Sura79.setRipplerFill(Paint.valueOf("yellow"));
            Sura80.setRipplerFill(Paint.valueOf("yellow"));
            Sura81.setRipplerFill(Paint.valueOf("yellow"));
            Sura82.setRipplerFill(Paint.valueOf("yellow"));
            Sura83.setRipplerFill(Paint.valueOf("yellow"));
            Sura84.setRipplerFill(Paint.valueOf("yellow"));
            Sura85.setRipplerFill(Paint.valueOf("yellow"));
            Sura86.setRipplerFill(Paint.valueOf("yellow"));
            Sura87.setRipplerFill(Paint.valueOf("yellow"));
            Sura88.setRipplerFill(Paint.valueOf("yellow"));  
            Sura89.setRipplerFill(Paint.valueOf("yellow"));
            Sura90.setRipplerFill(Paint.valueOf("yellow"));
            Sura91.setRipplerFill(Paint.valueOf("yellow"));
            Sura92.setRipplerFill(Paint.valueOf("yellow"));
            Sura93.setRipplerFill(Paint.valueOf("yellow"));
            Sura94.setRipplerFill(Paint.valueOf("yellow"));
            Sura95.setRipplerFill(Paint.valueOf("yellow"));
            Sura96.setRipplerFill(Paint.valueOf("yellow"));
            Sura97.setRipplerFill(Paint.valueOf("yellow"));
            Sura98.setRipplerFill(Paint.valueOf("yellow"));
            Sura99.setRipplerFill(Paint.valueOf("yellow"));
            Sura100.setRipplerFill(Paint.valueOf("yellow"));
            Sura101.setRipplerFill(Paint.valueOf("yellow"));
            Sura102.setRipplerFill(Paint.valueOf("yellow"));
            Sura103.setRipplerFill(Paint.valueOf("yellow"));
            Sura104.setRipplerFill(Paint.valueOf("yellow"));
            Sura105.setRipplerFill(Paint.valueOf("yellow"));
            Sura106.setRipplerFill(Paint.valueOf("yellow"));
            Sura107.setRipplerFill(Paint.valueOf("yellow"));
            Sura108.setRipplerFill(Paint.valueOf("yellow"));
            Sura109.setRipplerFill(Paint.valueOf("yellow"));
            Sura110.setRipplerFill(Paint.valueOf("yellow"));
            Sura111.setRipplerFill(Paint.valueOf("yellow"));
            Sura112.setRipplerFill(Paint.valueOf("yellow"));
            Sura113.setRipplerFill(Paint.valueOf("yellow"));
            Sura114.setRipplerFill(Paint.valueOf("yellow"));
            
            
            
            
            Sura1.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura2.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura3.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura4.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura5.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura6.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura7.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura8.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura9.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura10.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura11.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura12.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura13.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura14.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura15.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura16.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura17.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura18.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura19.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura20.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura21.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura22.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura23.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura24.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura25.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura26.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura27.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura28.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura29.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura30.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura31.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura32.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura33.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura34.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura35.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura36.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura37.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura38.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura39.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura40.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura41.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura42.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura43.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura44.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura45.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura46.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura47.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura48.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura49.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura50.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura51.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura52.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura53.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura54.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura55.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura56.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura57.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura58.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura59.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura60.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura61.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura62.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura63.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura64.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura65.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura66.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura67.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura68.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura69.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura70.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura71.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura72.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura73.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura74.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura75.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura76.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura77.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura78.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura79.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura80.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura81.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura82.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura83.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura84.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura85.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura86.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura87.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura88.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura89.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura90.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura91.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura92.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura93.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura94.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura95.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura96.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura97.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura98.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura99.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura100.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura101.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura102.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura103.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura104.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura105.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura106.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura107.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura108.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura109.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura110.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura111.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura112.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura113.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
            Sura114.setStyle("-fx-border-color: yellow;-fx-text-fill: #ffffff;");
           
            
             ////////////////////// buttons ///////////////////////////////
            
            
        }else{
            File file_picture1 = new File("C:\\Quran\\src\\images\\icons8_night_96px_1.png");
            Image image_pic = new Image(file_picture1.toURI().toString());
            Mode_image.setImage(image_pic);
            mode_falg = true;
            header.setStyle("-fx-background-color: linear-gradient(to left , #333333 , #6D23B6);");
            Footer.setStyle("-fx-background-color: linear-gradient(to left , #333333 , #6D23B6);");
            
            scroll_quran.setStyle("-fx-background-color: linear-gradient(to left , #333333, #6D23B6);-fx-background: linear-gradient(to left , #333333, #6D23B6);");
            scroll_Sura.setStyle("-fx-background-color: linear-gradient(to left , #333333, #6D23B6);-fx-background: linear-gradient(to left , #333333, #6D23B6);");
            
            FirstAyah.setTextFill(Paint.valueOf("#ffffff"));
            SuraContent.setFill(Paint.valueOf("#ffffff"));
            ////////////////////// buttons ///////////////////////////////
            
            Sura1.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura2.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura3.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura4.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura5.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura6.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura7.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura8.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura9.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura10.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura11.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura12.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura13.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura14.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura15.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura16.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura17.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura18.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura19.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura20.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura21.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura22.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura23.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura24.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura25.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura26.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura27.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura28.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura29.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura30.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura31.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura32.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura33.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura34.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura35.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura36.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura37.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura38.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura39.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura40.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura41.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura42.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura43.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura44.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura45.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura46.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura47.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura48.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura49.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura50.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura51.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura52.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura53.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura54.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura55.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura56.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura57.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura58.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura59.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura60.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura61.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura62.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura63.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura64.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura65.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura66.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura67.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura68.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura69.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura70.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura71.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura72.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura73.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura74.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura75.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura76.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura77.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura78.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura79.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura80.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura81.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura82.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura83.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura84.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura85.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura86.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura87.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura88.setRipplerFill(Paint.valueOf("#D100D1"));  
            Sura89.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura90.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura91.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura92.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura93.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura94.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura95.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura96.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura97.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura98.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura99.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura100.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura101.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura102.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura103.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura104.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura105.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura106.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura107.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura108.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura109.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura110.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura111.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura112.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura113.setRipplerFill(Paint.valueOf("#D100D1"));
            Sura114.setRipplerFill(Paint.valueOf("#D100D1"));
            
            
            Sura1.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura2.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura3.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura4.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura5.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura6.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura7.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura8.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura9.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura10.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura11.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura12.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura13.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura14.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura15.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura16.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura17.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura18.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura19.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura20.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura21.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura22.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura23.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura24.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura25.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura26.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura27.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura28.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura29.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura30.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura31.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura32.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura33.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura34.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura35.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura36.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura37.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura38.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura39.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura40.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura41.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura42.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura43.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura44.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura45.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura46.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura47.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura48.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura49.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura50.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura51.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura52.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura53.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura54.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura55.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura56.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura57.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura58.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura59.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura60.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura61.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura62.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura63.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura64.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura65.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura66.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura67.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura68.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura69.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura70.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura71.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura72.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura73.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura74.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura75.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura76.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura77.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura78.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura79.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura80.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura81.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura82.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura83.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura84.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura85.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura86.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura87.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura88.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura89.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura90.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura91.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura92.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura93.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura94.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura95.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura96.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura97.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura98.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura99.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura100.setStyle("-fx-border-color: #D100D1-fx-text-fill: #ffffff;;");
            Sura101.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura102.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura103.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura104.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura105.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura106.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura107.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura108.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura109.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura110.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura111.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura112.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura113.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            Sura114.setStyle("-fx-border-color: #D100D1;-fx-text-fill: #ffffff;");
            
             ////////////////////// buttons ///////////////////////////////
        }
    }

    @FXML
    void QuranAction(ActionEvent event) {
       
        FirstAyah.setText(" بِسْمِ اللَّـهِ الرَّحْمَـٰنِ الرَّحِيمِ");
        Content_pan.getSelectionModel().select(0);
    }

    @FXML
    void StartAction(ActionEvent event) {

        MainScroll.getSelectionModel().select(1);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        animate(star1,(float) 0.5);
        animate(star2,(float) 1.0);
        animate(star3,(float) 1.5);
        
        animate(star4,(float) 2.0);
        animate(star5,(float) 2.5);
        animate(star6,(float) 3.5);
        
        animate(star7,(float) 0.5);
        animate(star8,(float) 1.0);
        animate(star9,(float) 1.5);
        
        animate(star10,(float) 2.0);
        animate(star11,(float) 2.5);
        animate(star12,(float) 3.0);
        
        animate(star13,(float) 0.5);
        animate(star14,(float) 1.0);
        animate(star15,(float) 1.5);
        
        animate(star16,(float) 2.0);
        animate(star17,(float) 2.5);
        
        Rotaion(galaxy , (float) 0.5);
        
        Tasbeh.setText(""+count_taspeh);
    }    
    
    public void animate(ImageView Star,float i){
        FadeTransition Ft = new FadeTransition(Duration.millis(1000));
        Ft.setFromValue(0.0);
        Ft.setToValue(1.0);
        Ft.setDelay(Duration.seconds(i));
        Ft.setAutoReverse(true);
        Ft.setNode(Star);
        Ft.setCycleCount(FadeTransition.INDEFINITE);
        Ft.play();
    }
    
    public void Rotaion(ImageView galxy ,float i){
        RotateTransition Rt = new RotateTransition(Duration.millis(8000));
        Rt.setByAngle(360);
        Rt.setNode(galxy);
        Rt.setCycleCount(FadeTransition.INDEFINITE);
        Rt.play();
    }
    
    
    ///////////////////////////// Sura Action /////////////////////////
    
    @FXML
    void Sura1Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        FirstAyah.setText("");
        SuraContent.setText("بِسۡمِ ٱللَّهِ ٱلرَّحۡمَٰنِ ٱلرَّحِيمِ (1)\n" +
        "ٱلۡحَمۡدُ لِلَّهِ رَبِّ ٱلۡعَٰلَمِينَ (2)\n" +
        "ٱلرَّحۡمَٰنِ ٱلرَّحِيمِ (3) مَٰلِكِ يَوۡمِ ٱلدِّينِ (4)\n" +
        "إِيَّاكَ نَعۡبُدُ وَإِيَّاكَ نَسۡتَعِينُ (5) ٱهۡدِنَا\n" +
        "ٱلصِّرَٰطَ ٱلۡمُسۡتَقِيمَ (6) صِرَٰطَ ٱلَّذِينَ أَنۡعَمۡتَ\n" +
        "عَلَيۡهِمۡ غَيۡرِ ٱلۡمَغۡضُوبِ عَلَيۡهِمۡ\n" +
        "وَلَا ٱلضَّآلِّينَ (7)");
        
        AyaNUM.setText("(7)");
        Sura_TYPE.setText("(مكية)");
           
    }
    
    @FXML
    void Sura2Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(2);
    }
    
    @FXML
    void Sura3Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(3);
    }
    
    @FXML
    void Sura4Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(4);
    }
    
    @FXML
    void Sura5Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(5);
    }
    
    @FXML
    void Sura6Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(6);
    }
    
    @FXML
    void Sura7Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(7);
    }
    
    @FXML
    void Sura8Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(8);
    }
    
    @FXML
    void Sura9Action(ActionEvent event) {
        FirstAyah.setText("");
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(9);
    }
    
    @FXML
    void Sura10Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(10);
    }
    
    @FXML
    void Sura11Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(11);
    }
    
    @FXML
    void Sura12Action(ActionEvent event) {
        Content_pan.getSelectionModel().select(1);
        SuraDisplay(12);
    }
    ///////////////////////////// Sura Action /////////////////////////
    
    private void SuraDisplay(int id ){
        try {
            PreparedStatement ps;
            ps = c.prepareStatement("select * from quran where  suraid = ?;");
            ps.setInt(1, id);
            r = ps.executeQuery();
            r.next();
            SuraContent.setText(r.getString("ayahtext"));
            
            AyaNUM.setText("("+r.getString("AYAHNUM")+")");
            Sura_TYPE.setText("("+r.getString("SURATYPE")+")");
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    ///////////////////////////// Maspha /////////////////////////
    
    @FXML
    void MasphaAction(ActionEvent event) {
        animateToUp(C1);
        animateToUp(C2);
        animateToUp(C3);
        animateToUp(C4);
        animateToUp(C5);
        animateToUp(C6);
        animateToUp(C7);
        animateToUp(C8);
        animateToUp(C9);
        animateToUp(C10);
        switchCounter=1;
        count_taspeh=0;
        Tasbeh.setText(""+count_taspeh);
        
        Content_pan.getSelectionModel().select(2);
    }
    
    @FXML
    void TaspehAction(ActionEvent event) {
         if(switchCounter == 1)
            animateToDown(C1);
        else if(switchCounter == 2)
            animateToDown(C2);
        else if(switchCounter == 3)
            animateToDown(C3);
        else if(switchCounter == 4)
            animateToDown(C4);
        else if(switchCounter == 5)
            animateToDown(C5);
        else if(switchCounter == 6)
            animateToDown(C6);
        else if(switchCounter == 7)
            animateToDown(C7);
        else if(switchCounter == 8)
            animateToDown(C8);
        else if(switchCounter == 9)
            animateToDown(C9);  
        else if(switchCounter == 10)
            animateToDown(C10);  
        else if (switchCounter==11){
            animateToUp(C1);
            animateToUp(C2);
            animateToUp(C3);
            animateToUp(C4);
            animateToUp(C5);
            animateToUp(C6);
            animateToUp(C7);
            animateToUp(C8);
            animateToUp(C9);
            animateToUp(C10);
            
            switchCounter=0;
            count_taspeh--;
        }
        switchCounter++;
        count_taspeh++;
        Tasbeh.setText(""+count_taspeh);
    }
    
     public void animateToDown(Circle c){
        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(new Double[]{
            0.0, 0.0,
            0.0, 215.0});
        
        PathTransition trans= new PathTransition();
        trans.setNode(c);
        trans.setDuration(Duration.seconds(0.5));
        trans.setPath(polyline);
        trans.setCycleCount(1);
        trans.play();
    }
    
    public void animateToUp(Circle c){
        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(new Double[]{
            0.0, 0.0,
            0.0, -0.0000000000001});
        
        PathTransition trans= new PathTransition();
        trans.setNode(c);
        trans.setDuration(Duration.seconds(0.5));
        trans.setPath(polyline);
        trans.setCycleCount(1);
        trans.play();
    }
    
    ///////////////////////////// Azkar /////////////////////////
    int Azkar_counter0 = 1;
    int i0=1;
    
    int Azkar_counter1 = 3;
    double i1=1;
    
    int Azkar_counter2 = 3;
    double i2=1;
    
    int Azkar_counter3 = 3;
    double i3=1;
    
    int Azkar_counter4 = 1;
    double i4=1;
    
    int Azkar_counter5 = 1;
    double i5=1;
    
    int Azkar_counter6 = 3;
    double i6=1;
    
    int Azkar_counter7 = 4;
    double i7=1;
    
    int Azkar_counter8 = 1;
    double i8=1;
    
    int Azkar_counter9 = 7;
    double i9=1;
    
    int Azkar_counter10 = 3;
    double i10=1;
    
    int Azkar_counter11 = 1;
    double i11=1;
    
    int Azkar_counter12 = 1;
    double i12=1;
    
    @FXML
    void AzkarAction(ActionEvent event) {
        i0=1;i1=1;i2=1;i3=1;i4=1;i5=1;i6=1;i7=1;i8=1;i9=1;i10=1;i11=1;i12=1;
        
        Azkar_press0.setText(Azkar_counter0+"");
        Azkar_press1.setText(Azkar_counter1+"");
        Azkar_press2.setText(Azkar_counter2+"");
        Azkar_press3.setText(Azkar_counter3+"");
        Azkar_press4.setText(Azkar_counter4+"");
        Azkar_press5.setText(Azkar_counter5+"");
        Azkar_press6.setText(Azkar_counter6+"");
        Azkar_press7.setText(Azkar_counter7+"");
        Azkar_press8.setText(Azkar_counter8+"");
        Azkar_press9.setText(Azkar_counter9+"");
        Azkar_press10.setText(Azkar_counter10+"");
        Azkar_press11.setText(Azkar_counter11+"");
        Azkar_press12.setText(Azkar_counter12+"");
        
        Spin0.setProgress(0);
        Spin1.setProgress(0);
        Spin2.setProgress(0);
        Spin3.setProgress(0);
        Spin4.setProgress(0);
        Spin5.setProgress(0);
        Spin6.setProgress(0);
        Spin7.setProgress(0);
        Spin8.setProgress(0);
        Spin9.setProgress(0);
        Spin10.setProgress(0);
        Spin11.setProgress(0);
        Spin12.setProgress(0);
        
        File file_picture44 = new File("C:\\java\\Quran\\src\\images\\W.png.png");
        Image image_pic15 = new Image(file_picture44.toURI().toString());
        Azkar_correct0.setImage(image_pic15);
        Azkar_correct1.setImage(image_pic15);
        Azkar_correct2.setImage(image_pic15);
        Azkar_correct3.setImage(image_pic15);
        Azkar_correct4.setImage(image_pic15);
        Azkar_correct5.setImage(image_pic15);
        Azkar_correct6.setImage(image_pic15);
        Azkar_correct7.setImage(image_pic15);
        Azkar_correct8.setImage(image_pic15);
        Azkar_correct9.setImage(image_pic15);
        Azkar_correct10.setImage(image_pic15);
        Azkar_correct11.setImage(image_pic15);
        Azkar_correct12.setImage(image_pic15);
        
        Content_pan.getSelectionModel().select(3);
    }
    
    @FXML
    void Azkar_press0Action(ActionEvent event) {
        if(i0<Azkar_counter0){
            Spin0.setProgress((double)i0/Azkar_counter0);
            Azkar_press0.setText(Azkar_counter0-i0+"");
            i0++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct0.setImage(image_pic15);
            Azkar_press0.setText("");
            Spin0.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press1Action(ActionEvent event) {
        if(i1<Azkar_counter1){
            Spin1.setProgress((double)i1/Azkar_counter1);
            Azkar_press1.setText((int)(Azkar_counter1-i1)+"");
            i1++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct1.setImage(image_pic15);
            Azkar_press1.setText("");
            Spin1.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press2Action(ActionEvent event) {
        if(i2<Azkar_counter2){
            Spin2.setProgress((double)i2/Azkar_counter2);
            Azkar_press2.setText((int)(Azkar_counter2-i2)+"");
            i2++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct2.setImage(image_pic15);
            Azkar_press2.setText("");
            Spin2.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press3Action(ActionEvent event) {
        if(i3<Azkar_counter3){
            Spin3.setProgress((double)i3/Azkar_counter3);
            Azkar_press3.setText((int)(Azkar_counter3-i3)+"");
            i3++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct3.setImage(image_pic15);
            Azkar_press3.setText("");
            Spin3.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press4Action(ActionEvent event) {
        if(i4<Azkar_counter4){
            Spin4.setProgress((double)i4/Azkar_counter4);
            Azkar_press4.setText((int)(Azkar_counter4-i4)+"");
            i4++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct4.setImage(image_pic15);
            Azkar_press4.setText("");
            Spin4.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press5Action(ActionEvent event) {
        if(i5<Azkar_counter5){
            Spin5.setProgress((double)i5/Azkar_counter5);
            Azkar_press5.setText((int)(Azkar_counter5-i5)+"");
            i5++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct5.setImage(image_pic15);
            Azkar_press5.setText("");
            Spin5.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press6Action(ActionEvent event) {
        if(i6<Azkar_counter6){
            Spin6.setProgress((double)i6/Azkar_counter6);
            Azkar_press6.setText((int)(Azkar_counter6-i6)+"");
            i6++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct6.setImage(image_pic15);
            Azkar_press6.setText("");
            Spin6.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press7Action(ActionEvent event) {
        if(i7<Azkar_counter7){
            Spin7.setProgress((double)i7/Azkar_counter7);
            Azkar_press7.setText((int)(Azkar_counter7-i7)+"");
            i7++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct7.setImage(image_pic15);
            Azkar_press7.setText("");
            Spin7.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press8Action(ActionEvent event) {
        if(i8<Azkar_counter8){
            Spin8.setProgress((double)i8/Azkar_counter8);
            Azkar_press8.setText((int)(Azkar_counter8-i8)+"");
            i8++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct8.setImage(image_pic15);
            Azkar_press8.setText("");
            Spin8.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press9Action(ActionEvent event) {
        if(i9<Azkar_counter9){
            Spin9.setProgress((double)i9/Azkar_counter9);
            Azkar_press9.setText((int)(Azkar_counter9-i9)+"");
            i9++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct9.setImage(image_pic15);
            Azkar_press9.setText("");
            Spin9.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press10Action(ActionEvent event) {
        if(i10<Azkar_counter10){
            Spin10.setProgress((double)i10/Azkar_counter10);
            Azkar_press10.setText((int)(Azkar_counter10-i10)+"");
            i10++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct10.setImage(image_pic15);
            Azkar_press10.setText("");
            Spin10.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press11Action(ActionEvent event) {
        if(i11<Azkar_counter11){
            Spin11.setProgress((double)i11/Azkar_counter11);
            Azkar_press11.setText((int)(Azkar_counter11-i11)+"");
            i11++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct11.setImage(image_pic15);
            Azkar_press11.setText("");
            Spin11.setProgress(1);
        }
    }
    
    @FXML
    void Azkar_press12Action(ActionEvent event) {
        if(i12<Azkar_counter12){
            Spin12.setProgress((double)i12/Azkar_counter12);
            Azkar_press12.setText((int)(Azkar_counter12-i12)+"");
            i12++;
        }else{
            File file_picture44 = new File("C:\\Quran\\src\\images\\Correct.png");
            Image image_pic15 = new Image(file_picture44.toURI().toString());
            Azkar_correct12.setImage(image_pic15);
            Azkar_press12.setText("");
            Spin12.setProgress(1);
        }
    }
    ///////////////////////////// allah names /////////////////////////
    
    @FXML
    void NamesAction(ActionEvent event) {
        Content_pan.getSelectionModel().select(4);
    }
}
