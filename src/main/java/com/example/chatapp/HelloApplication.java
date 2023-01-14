package com.example.chatapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Group group=new Group();
        Scene scene = new Scene(group);
        stage.setTitle("login");
        stage.setWidth(400);
        stage.setHeight(500);
        stage.setScene(scene);
        stage.show();
        VBox container=new VBox();
        container.setSpacing(4);
        container.setPadding(new Insets(0,0,10,30));
        group.getChildren().add(container);


        HBox header=new HBox();
        Label headertitle=new Label("sign up");
        headertitle.setFont(Font.font("apple",24));
        headertitle.setPadding(new Insets(100,100,10,120));
        headertitle.setTextFill(Color.web("#2596be"));

        header.setAlignment(Pos.CENTER);
        header.getChildren().add(headertitle);
        container.getChildren().add(header);

        HBox firstInput=new HBox();
        Label User=new Label("user name");
        User.setFont(Font.font("apple",14));
        TextField username=new TextField();
        username.setMinHeight(30);
        username.setMinWidth(180);
        firstInput.setSpacing(50);
        firstInput.setAlignment(Pos.CENTER);
        firstInput.getChildren().add(User);
        firstInput.getChildren().add(username);
        container.getChildren().add(firstInput);

        HBox threidInput=new HBox();
        Label Email=new Label("Email");
        Email.setFont(Font.font("apple",14));
        TextField emailFiled=new TextField();
        emailFiled.setMinHeight(30);
        emailFiled.setMinWidth(180);
        threidInput.setAlignment(Pos.CENTER);
        threidInput.getChildren().add(Email);
        threidInput.getChildren().add(emailFiled);
        threidInput.setSpacing(80);
        container.getChildren().add(threidInput);

        HBox secondInput=new HBox();
        Label password=new Label("password");
        password.setFont(Font.font("apple",14));
        PasswordField passwordField=new PasswordField();
        passwordField.setMinHeight(30);
        passwordField.setMinWidth(180);
        secondInput.setSpacing(54);
        secondInput.setAlignment(Pos.CENTER);
        secondInput.getChildren().add(password);
        secondInput.getChildren().add(passwordField);
        container.getChildren().add(secondInput);

        HBox fourInput=new HBox();
        Label Comfrimpassword=new Label("Confrim password");
        Comfrimpassword.setFont(Font.font("apple",14));
        PasswordField compasswordField=new PasswordField();
        compasswordField.setMinHeight(30);
        compasswordField.setMinWidth(180);
        fourInput.setSpacing(3);
        fourInput.setAlignment(Pos.CENTER);
        fourInput.getChildren().add(Comfrimpassword);
        fourInput.getChildren().add(compasswordField);
        container.getChildren().add(fourInput);

        HBox btn=new HBox();
        Button save=new Button("Register");
        save.setMinHeight(30);
        save.setMinWidth(70);
        save.setStyle(
                "            -fx-border-color:  blue; \n" +
                        "            -fx-border-width: 1; \n" +
                        "            -fx-border-radius:5 ; \n"
        );
        save.setStyle("-fx-color:green;");
        Button Login=new Button("Login");
        Login.setStyle(
                "            -fx-border-color:  blue; \n" +
                        "            -fx-border-width: 1; \n" +
                        "            -fx-border-radius:5 ; \n"
        );
        Login.setStyle("-fx-color:#0076a3");
        Login.setMinWidth(70);
        Login.setMinHeight(30);
        btn.getChildren().add(save);
        btn.getChildren().add(Login);
        btn.setAlignment(Pos.CENTER);
        btn.setSpacing(5);
        btn.setPadding(new Insets(5,0,0,140));
        container.getChildren().add(btn);
        Login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Group group1=new Group();
                Scene loginscene=new Scene(group1);
                stage.setScene(loginscene);
                stage.setTitle("Login");
                stage.setHeight(500);
                stage.setWidth(400);
                stage.show();
                VBox container=new VBox();
                container.setSpacing(5);
                container.setPadding(new Insets(0,0,10,30));
                group1.getChildren().add(container);


                HBox header=new HBox();
                Label headertitle=new Label("Login");
                headertitle.setFont(Font.font("apple",24));
                headertitle.setPadding(new Insets(100,100,10,120));
                headertitle.setTextFill(Color.web("green"));
                header.getChildren().add(headertitle);
                container.getChildren().add(header);

//                HBox firstInput=new HBox();
//                Label User=new Label("user name");
//                TextField username=new TextField();
//                firstInput.setSpacing(8);
//
//                firstInput.setAlignment(Pos.CENTER);
//                firstInput.getChildren().add(User);
//                firstInput.getChildren().add(username);
//                container.getChildren().add(firstInput);
                HBox threidInput=new HBox();
                Label Email=new Label("Email");
                Email.setFont(Font.font("apple",14));
                TextField emailFiled=new TextField();
                emailFiled.setMinHeight(30);
                emailFiled.setMinWidth(200);
                threidInput.setAlignment(Pos.CENTER);
                threidInput.getChildren().add(Email);
                threidInput.getChildren().add(emailFiled);
                threidInput.setSpacing(60);
                container.getChildren().add(threidInput);

                HBox secondInput=new HBox();
                Label password=new Label("password");
                password.setFont(Font.font("apple",14));
                PasswordField passwordField=new PasswordField();
                passwordField.setMinHeight(30);
                passwordField.setMinWidth(200);
                secondInput.setSpacing(34);
                secondInput.setAlignment(Pos.CENTER);
                secondInput.getChildren().add(password);
                secondInput.getChildren().add(passwordField);
                container.getChildren().add(secondInput);
//                HBox secondInput=new HBox();
//                Label password=new Label("password");
//                PasswordField passwordField=new PasswordField();
//                secondInput.setSpacing(10);
//                secondInput.setAlignment(Pos.CENTER);
//                secondInput.getChildren().add(password);
//                secondInput.getChildren().add(passwordField);
//                container.getChildren().add(secondInput);

                HBox btn=new HBox();
                Button save=new Button("Register");
                save.setMinHeight(30);
                save.setMinWidth(70);
                save.setStyle(
                        "            -fx-border-color:  blue; \n" +
                                "            -fx-border-width: 1; \n" +
                                "            -fx-border-radius:5 ; \n"
                );
                save.setStyle("-fx-color:green;");
                Button Login=new Button("Login");
                Login.setStyle(
                        "            -fx-border-color:  blue; \n" +
                                "            -fx-border-width: 1; \n" +
                                "            -fx-border-radius:5 ; \n"
                );
                Login.setStyle("-fx-color:#0076a3");
                Login.setMinWidth(70);
                Login.setMinHeight(30);
                btn.getChildren().add(save);
                btn.getChildren().add(Login);
                btn.setAlignment(Pos.CENTER);
                btn.setSpacing(5);
                btn.setPadding(new Insets(5,0,0,142));
                container.getChildren().add(btn);
                Login.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        String un=emailFiled.getText();
                        String pw=passwordField.getText();
                        String usern="";
                        String passw="";
                        Connection con=null;
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            String url="jdbc:mysql://localhost:3306/java_tuto";
                            String user="natnaeln4d";
                            String pwd="natty@123";
                            con = DriverManager.getConnection(url, user, pwd);
                            System.out.println(
                                    "Connection Established successfully");
                            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);


//

                            String sql = "SELECT password,username FROM user WHERE email ='"+un+"';";
                            System.out.println(sql);
                            PreparedStatement ps=con.prepareStatement(sql);
                            ResultSet resultSet=ps.executeQuery();

                            if(resultSet.next()){

                                passw=resultSet.getString("password");
                                boolean check=pw.equals(passw);
                                if(check){
                                    System.out.println("login successfully");
                                    System.out.println("name:"+resultSet.getString("username"));
                                    System.out.println("password:"+resultSet.getString("password"));
                                    String name=resultSet.getString("username");
                                    username.setText("");
                                    passwordField.setText("");
                                   ChatApp(stage);

                                }
                                else
                                    System.out.println("password incorrect");

                            }
                            else {
                                HBox header=new HBox();
                                Label headertitle=new Label("No user");
                                headertitle.setPadding(new Insets(30,100,10,60));



                                headertitle.setTextFill(Color.web("#732219")
                                );
                                headertitle.setStyle("-fx-font-size:16px");
                                header.setAlignment(Pos.CENTER);
                                header.getChildren().add(headertitle);
                                container.getChildren().add(header);

                            }




                        }catch (ClassNotFoundException F){
                            System.out.println(F);
                        }
                        catch (SQLException E){
                            System.out.println(E);
                        }
                    }
                });
                save.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {

                        Stage stage=new Stage();
                        try {
                            start(stage);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });



            }
        });
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String un=username.getText();
                String em=emailFiled.getText();
                String pw=passwordField.getText();
                String cmpw=compasswordField.getText();
                boolean check=pw.equals(cmpw);
                if (check) {
                    Connection con = null;
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        String url = "jdbc:mysql://localhost:3306/java_tuto";
                        String user = "natnaeln4d";
                        String pwd = "natty@123";
                        con = DriverManager.getConnection(url, user, pwd);
                        System.out.println(
                                "Connection Established successfully");
                        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        String select = "Select * from user";
                        ResultSet rt = st.executeQuery(select);
                        String sql = "INSERT INTO user(username,email,password) VALUES (?,?,?)";
                        PreparedStatement pstatement = con.prepareStatement(sql);

                        pstatement.setString(1, un);
                        pstatement.setString(2, em);
                        pstatement.setString(3, pw);
                        String name=username.getText();
                        int i = pstatement.executeUpdate();
                        if (i == 1) {

                           ChatApp(stage);

                        } else
                            System.out.println("Student registration failed");
//
//
//                       while (rt.next()){
//                           System.out.println("name" + rt.getString("username\n"));
//                           System.out.println("email"+rt.getString("email"));
//                       }
//
//
//                    }
//

                        rt.close();

                    } catch (ClassNotFoundException E) {
                        System.out.println(E);
                    } catch (SQLException F) {
                        System.out.println(F);
                    }
                }else
                    System.out.println("password don't match");

            }
        });

    }
public void ChatApp(Stage stage){
    Group group=new Group();
    Scene scene = new Scene(group);
    stage.setTitle("login");
    stage.setHeight(500);
    stage.setWidth(400);
    stage.setScene(scene);
    stage.show();
    VBox container=new VBox();
    container.setSpacing(1);
    group.getChildren().add(container);
    ScrollPane scroll = new ScrollPane();
    scroll.setPrefSize(400, 430);
    scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
    scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
    VBox BigBox=new VBox();
    BigBox.setMinHeight(430);
    BigBox.setMinWidth(400);
    BigBox.setSpacing(5);
    BigBox.setPadding(new Insets(300,0,0,5));
    BigBox.setStyle("-fx-background-color:#4bbf7b;");
    container.getChildren().add(BigBox);
    scroll.setContent(BigBox);
    container.getChildren().add(scroll);





    GridPane gridPane=new GridPane();
    TextField input=new TextField();
    input.setStyle("-fx-background-color:#ffffff");
    input.setMinHeight(35);
    input.setMinWidth(348);
    Button btn=new Button("send");
    btn.setMinHeight(35);
    btn.setMinWidth(50);
    btn.setTextFill(Color.web("#ffffff"));
    btn.setStyle("-fx-background-color:green;" +
            "            -fx-border-color:  #3a9961; \n" +
            "            -fx-border-width: 1; \n" +
            "            -fx-border-radius:15 ; \n");

    gridPane.add(input,0,0);
    gridPane.add(btn,1,0);
    gridPane.setHgap(1);
    gridPane.setAlignment(Pos.BOTTOM_CENTER);
    container.getChildren().add(gridPane);
    HBox Textbox=new HBox();
    Textbox.setMaxHeight(300);
    Textbox.setMaxWidth(200);
    Textbox.setPadding(new Insets(10,10,10,10));



    Textbox.setStyle("-fx-border-radius:10;\n"+

            "            -fx-border-color:  #3a9961; \n" +
            "            -fx-border-width: 1; \n" +
            "            -fx-border-radius:25 ; \n" +
            "-fx-margin-top:200;"

    );
    Textbox.setAlignment(Pos.BASELINE_LEFT);

    Label text=new Label("hello from another side \n" +
            "gggggg" +
            "f f ff" +
            "GGGG " +
            "ttttt");
    text.setTextFill(Color.web("white"));
    text.setWrapText(true);
    text.setMaxHeight(200);
    text.setMinWidth(200);

    Textbox.getChildren().add(text);
    BigBox.getChildren().add(Textbox);
//    BorderPane borderPane=new BorderPane(BigBox);
//    borderPane.setBottom(Textbox);
    VBox Text2=new VBox();
    Text2.setPadding(new Insets(0,0,0,170));
    HBox Textbox2=new HBox();
    Textbox2.setMaxHeight(300);
    Textbox2.setMaxWidth(200);
    Textbox2.setPadding(new Insets(10,10,10,10));



    Textbox2.setStyle("-fx-border-radius:10;\n"+

            "            -fx-border-color:  #3a9961; \n" +
            "            -fx-border-width: 1; \n" +
            "            -fx-border-radius:25 ; \n" +
            "-fx-margin-top:200;"

    );
    Textbox2.setAlignment(Pos.BASELINE_LEFT);

    Label text2=new Label("hello from another side \n" +
            "gggggg" +
            "f f ff" +
            "GGGG " +
            "ttttt");
    text2.setTextFill(Color.web("white"));
    text2.setWrapText(true);
    text2.setMaxHeight(200);
    text2.setMinWidth(200);

    Textbox2.getChildren().add(text2);
    Text2.getChildren().add(Textbox2);
    BigBox.getChildren().add(Text2);
    btn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            String message=input.getText();
            VBox Text2=new VBox();
            Text2.setPadding(new Insets(0,0,0,170));
            HBox Textbox2=new HBox();
            Textbox2.setMaxHeight(300);
            Textbox2.setMaxWidth(200);
            Textbox2.setPadding(new Insets(10,10,10,10));



            Textbox2.setStyle("-fx-border-radius:10;\n"+

                    "            -fx-border-color:  #3a9961; \n" +
                    "            -fx-border-width: 1; \n" +
                    "            -fx-border-radius:25 ; \n" +
                    "-fx-margin-top:200;"

            );
            Textbox2.setAlignment(Pos.BASELINE_LEFT);

            Label text2=new Label(message);
            text2.setTextFill(Color.web("white"));
            text2.setWrapText(true);
            text2.setMaxHeight(200);
            text2.setMinWidth(200);

            Textbox2.getChildren().add(text2);
            Text2.getChildren().add(Textbox2);
            BigBox.getChildren().add(Text2);
            BigBox.setPadding(new Insets(50,0,0,5));
            ChatA c=new ChatA(message);


        }
    });


}
    public static void main(String[] args) {
        launch();
    }
}