/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log.in;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
//1
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
 import java.io.PrintWriter;     

/**
 *
 * @author HP
 */
public class LogIn extends Application {
    Scene logIn;
    Scene NewAccount;
     Scene ScreenNo2;
     
      java.io.File file=new java.io.File("user_accont.txt");
    PrintWriter output;
    @Override
    public void start(Stage primaryStage) {
        
        //log in Scene------------------------------------------
        
        
        //Rectangle()
            Rectangle rectangle = new Rectangle(); 
        rectangle.setX(145); //Setting the Properties of the Rectangle
        rectangle.setY(50);
        rectangle.setWidth(240);
        rectangle.setHeight(170);
        
        rectangle.setStrokeWidth(3);
        rectangle.setStroke(Color.YELLOW);
        
        //Setting the image pattern 
       Image image = new Image("/saudi_fun.png") ;
        ImagePattern pattern = new ImagePattern(image,1,1,1,1,true);
        rectangle.setFill(pattern);
        
        Group group = new Group(rectangle );
        //---------------------------
       
         Label userName  = new Label("user Name: ");
         Label pw  = new Label("Password: ");
         
          TextField txuserName = new TextField();
          PasswordField pwBox = new PasswordField();
          final Text actiontarget = new Text();
          
          Button ButlogIn = new Button("Log In");
        Button ButNewAccount = new Button("New acccount");
           ButlogIn.setStyle("-fx-border-color: GRAY; -fx-background-color: #FFEBAD");
           ButNewAccount.setStyle("-fx-border-color: GRAY; -fx-background-color: #FFEBAD");
           
          GridPane form = new GridPane();
        form.add(userName,0,0);
        form.add(txuserName,1,0);
         form.add(pw,0,1);
        form.add(pwBox,1,1);
         form.add(actiontarget, 1, 6);
         
        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);
        
        HBox buttons = new HBox(20);
        buttons.setAlignment(Pos.CENTER);
         buttons.getChildren().addAll(ButlogIn,ButNewAccount);
         //--------------------------------------------------
        
        VBox controls = new VBox(10);
        controls.setAlignment(Pos.CENTER);
        controls.setStyle("-fx-background-color: FFF3CD");
          controls.getChildren().addAll(group,form,buttons);
          
        logIn = new Scene(controls, 242, 350);
      // Scene scene= new Scene(controls, 800, 630);
        ////////////////////////////////////////////////////////
        //NewAccount Scene-----------------------------
        Label nameLabel = new Label("Full Name : ");
          Label emailLabel = new Label("Email ID : ");
           Label userName2  = new Label("user Name: ");
         Label pw2  = new Label("Password: ");
        Label NoPhone  = new Label("Mobile number: ");
        
          TextField txusernameLabel = new TextField();
          TextField emailField = new TextField();
          TextField txuserName2 = new TextField();
        PasswordField passwordField = new PasswordField();
        TextField MobileNum = new TextField();
         final Text actiontarget1 = new Text();

          
        Button back = new Button("back");
          back.setStyle("-fx-border-color: GRAY; -fx-background-color: #FFEBAD");
            Button submit = new Button("submit");
          submit.setStyle("-fx-border-color: GRAY; -fx-background-color: #FFEBAD");
        
           GridPane form2 = new GridPane();
            form2.setAlignment(Pos.CENTER);
        form2.setHgap(10);
        form2.setVgap(10);
        
        form2.add(nameLabel,0,0);
         form2.add(txusernameLabel,1,0);
         form2.add(emailLabel,0,1);
         form2.add(emailField,1,1);
            form2.add(NoPhone,0,2);
           form2.add(MobileNum,1,2);
           form2.add(userName2,0,3);
           form2.add( txuserName2,1,3);
           form2.add(pw2,0,4);
           form2.add( passwordField,1,4);
           form2.add(actiontarget1 ,1,8);
           
           HBox buttons2 = new HBox(20);
        buttons2.setAlignment(Pos.CENTER);
         buttons2.getChildren().addAll(back,submit);
           
         VBox controls2 = new VBox(10);
        controls2.setAlignment(Pos.CENTER);
        controls2.setStyle("-fx-background-color: FFF3CD");
          controls2.getChildren().addAll(form2,buttons2);
         //////////////////////////////////////
         //ScreenNo2-------------------------
         
          VBox screen = new VBox(); // pane for all
        screen.setStyle("-fx-border-color: BLACK;-fx-background-color: FFF3CD");

        BorderPane Bpane = new BorderPane(); //in first vbox
        Bpane.setPadding(new Insets(35));

        Label btPlaces = new Label("Choose your City");
        btPlaces.setPadding(new Insets(5, 20, 5, 20));
        btPlaces.setStyle("-fx-border-color: GRAY; -fx-background-color: #FFC38B");
        btPlaces.setFont(new Font(15.0));


        VBox ButtonPane = new VBox(15);

        Button Riyadh = new Button("Riyadh");
       Riyadh.setFont(Font.font("Helvetica", 15));
        Riyadh.setPadding(new Insets(10, 15, 10, 15));
        Riyadh.setStyle("-fx-border-color: GRAY; -fx-background-color: #FFEBAD");
//////////
        Button Jaddah = new Button("Jaddah");
       Jaddah.setFont(Font.font("Helvetica", 15));
        Jaddah.setPadding(new Insets(10, 15, 10, 15));
        Jaddah.setStyle("-fx-border-color: GRAY; -fx-background-color: #FFEBAD");

        ButtonPane.getChildren().addAll(Riyadh, Jaddah);

        StackPane Spane = new StackPane(); // for button
        Spane.getChildren().add(ButtonPane);
        Spane.setPadding(new Insets(60, 45, 60, 45));

        Bpane.setCenter(Spane);// BorderPane
        Bpane.setTop(btPlaces);      //BorderPane
        screen.getChildren().add(Bpane); // pane for all

        Group root = new Group(screen); //Creating a Group object
         
        ///////////////////////////
        //Actions of Scene log In---------
        
        ///button log in
         ScreenNo2  = new Scene(root, 262, 350);
         ButlogIn .setOnAction( e-> {
             
                        if(txuserName.getText().equals("")||pwBox.getText().equals(""))
           {
               actiontarget.setText("Please enter all data");
           }else{
             actiontarget.setFill(Color.FIREBRICK);
            primaryStage.setScene(ScreenNo2);
                        }    });
        
        
         /////button NewAccount
         NewAccount  = new Scene(controls2, 262, 350);
        ButNewAccount.setOnAction(e-> {
        primaryStage.setScene(NewAccount);
        });
        
        ////////////////////////////////////////
        //Actions of Scene NewAccount---------
         /////buttun back
         back.setOnAction(e-> {
        primaryStage.setScene(logIn);
        });
         
         ///button submit
         submit.setOnAction(e->{
             String no=MobileNum.getText();
             boolean g =false;
             for (char c: no.toCharArray()){
                 if(!Character.isDigit(c)){
                 g=true;
                 }
             }
             if(g){
                 actiontarget1.setText(" Mobile number\n must be digit only ");
             }
             else if(txusernameLabel.getText().isEmpty()||emailField.getText().isEmpty()||MobileNum.getText().isEmpty()){
             actiontarget1.setText("Please enter all data");
             
             } else if(txuserName2.getText().isEmpty()||passwordField.getText().isEmpty()){
             actiontarget1.setText("Please enter\n user nam & password");
             
             }else{
              actiontarget1.setText("done , Have fun!");
//                               try {
//                output = new PrintWriter(file);
//                for (int i = 0; i < obItems.size(); i++) {
//                    //ياخذ من الاوبزيفبول لست ويحطها في الأوتبوت الي تودي ع الفايل 
//                    output.append("Full Name :" + txusernameLabe.get(i) + " " + "Email ID :" + emailField.get(i) 
//                            + " " + "Mobile number:" + MobileNum.get(i) + " " + "user Name: " + txuserName.get(i)
//                            +""+"Password:"+passwordField.get(i));
//                    output.println();
//
//                }
//                output.close();
//            } catch (java.io.IOException ex) {
//                System.out.println(ex.toString());
//                System.out.println("unfinding");
//            }
            
             }
         });
        ///////////////
        /// action of Scene
        
       /// button Riyadh
       Riyadh.setOnAction(e->{
         });
       //button Jaddah
      Jaddah .setOnAction(e->{
         });
       ////////
       // primaryStage.setTitle("NewAccount");
         
        //primaryStage.setScene(NewAccount);
        
         primaryStage.setTitle("Sudi fun");
         //primaryStage.setScene(scene);
        primaryStage.setScene(logIn);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
