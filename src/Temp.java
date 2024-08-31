//package temp;
import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.DARKORANGE;
import static javafx.scene.paint.Color.WHITE;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class Temp extends Application
{
@Override
public void start(Stage stage) throws Exception
{
Label lb1=new Label("Enter value of Temperature:");
lb1.setFont(new Font("Comic Sans MS",17));
lb1.setTextFill(WHITE);
TextField tf1=new TextField();
ToggleGroup Group=new ToggleGroup();
RadioButton opt1=new RadioButton("Celsius to Fahrenheit");
RadioButton opt2=new RadioButton("Celsius to Kelvin");
RadioButton opt3=new RadioButton("Fahrenheit to Celsius");
RadioButton opt4=new RadioButton("Fahrenheit to Kelvin");
RadioButton opt5=new RadioButton("Kelvin to Celsius");
RadioButton opt6=new RadioButton("Kelvin to Fahrenheit");
opt1.setToggleGroup(Group);
opt2.setToggleGroup(Group);
opt3.setToggleGroup(Group);
opt4.setToggleGroup(Group);
opt5.setToggleGroup(Group);
opt6.setToggleGroup(Group);
opt1.setTextFill(WHITE);
opt2.setTextFill(WHITE);
opt3.setTextFill(WHITE);
opt4.setTextFill(WHITE);
opt5.setTextFill(WHITE);
opt6.setTextFill(WHITE);
Button bt1=new Button("Convert");
bt1.setStyle("-fx-background-color: BEIGE");
bt1.setTextFill(BLACK);
Label lb2=new Label();
lb2.setFont(new Font("Impact",29));
lb2.setTextFill(DARKORANGE);
tf1.setFont(new Font("Comic Sans MS",17));
opt1.setFont(new Font("Comic Sans MS",17));
opt2.setFont(new Font("Comic Sans MS",17));
opt3.setFont(new Font("Comic Sans MS",17));
opt4.setFont(new Font("Comic Sans MS",17));
opt5.setFont(new Font("Comic Sans MS",17));
opt6.setFont(new Font("Comic Sans MS",17));
bt1.setFont(new Font("Lucida Sans Unicode",17));
GridPane root=new GridPane();
root.add(lb1,0,0);
root.add(tf1,1,0);
root.add(opt1,0,1);
root.add(opt2,0,2);
root.add(opt3,1,1);
root.add(opt4,1,2);
root.add(opt5,2,1);
root.add(opt6,2,2);
root.add(bt1,0,3);
root.add(lb2,1,4);
root.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)
));
root.setHgap(15);
root.setVgap(15);
root.setPadding(new Insets(18,15,10,10));
bt1.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent t) {
double num = Double.parseDouble(tf1.getText());
if(opt1.isSelected())
{
double celtofah=(num*1.8)+32;
lb2.setText(" Result: " + new DecimalFormat("##.##").format(celtofah)+" F");
}
if(opt2.isSelected())
{
double celtokel=num+273.15;
lb2.setText(" Result: " + new DecimalFormat("##.##").format(celtokel)+" K");
}
if(opt3.isSelected())
{
double fahtocel=(num-32)*(5/9);
lb2.setText(" Result: " + new DecimalFormat("##.##").format(fahtocel)+" C");
}
if(opt4.isSelected())
{
double fahtokel=(num-32)*(5/9)+273.15;
lb2.setText(" Result: " + new DecimalFormat("##.##").format(fahtokel)+" K");
}
if(opt5.isSelected())
{
double keltocel=num-273.15;
lb2.setText(" Result: " + new DecimalFormat("##.##").format(keltocel)+" C");
}
if(opt6.isSelected())
{
double keltofah=(num-273.15)*(9/5)+32;
lb2.setText(" Result: " + new DecimalFormat("##.##").format(keltofah)+" F");
}
}
});
Scene sc=new Scene(root);
stage.setScene(sc);
stage.setHeight(300);
stage.setWidth(740);
stage.setTitle("Temperature Converter");
stage.show();
}
public static void main(String args[])
{
launch(args);
}
}