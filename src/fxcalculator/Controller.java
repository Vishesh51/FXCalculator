/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author vishe
 */
public class Controller implements Initializable {

    Float data = 0f;
    int operation = -1;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button multiply;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button add;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button divide;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button five;
    
    @FXML
    private Button mod;
    
    @FXML
    private Button back;
    
    @FXML
    private Button space;
    
    @FXML
    private Button root;
    
    @FXML
    private Button square;
    
    @FXML
    private Button cube;
    
    @FXML
    private Button negate;
    
    @FXML
    private Button inverse;
    
    @FXML
    private Button point;

    @FXML
    void handleButtonAction(ActionEvent event) {
        try{
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        }else if (event.getSource() == point) {
            display.setText(display.getText() + ".");}
            else if (event.getSource() == clear) {
            display.setText("");
        } else if (event.getSource() == add) {
            data = Float.parseFloat(display.getText());
            operation = 1; 
            display.setText("");//add
        } else if (event.getSource() == minus) {
            data = Float.parseFloat(display.getText());
            operation = 2; 
            display.setText("");//subtract
        } else if (event.getSource() == multiply) {
            data = Float.parseFloat(display.getText());
            operation = 3; 
            display.setText("");//multiply
        } else if (event.getSource() == divide) {
            data = Float.parseFloat(display.getText());
            operation = 4; 
            display.setText("");//divide
        } else if (event.getSource() == mod) {
            data = Float.parseFloat(display.getText());
            operation = 5; 
            display.setText("");//modulus
        }else if (event.getSource() == root) {
            data = Float.parseFloat(display.getText());
           // operation = 6; 
           data=(float)Math.sqrt(data);//square root
           try{
            display.setText(String.valueOf(data));}
           catch(Exception e){display.setText("Error");}
        }else if (event.getSource() == square) {
            data = Float.parseFloat(display.getText());
            //operation = 7; 
            data=(float)data*data;//square
            display.setText(String.valueOf((data)));
        }else if (event.getSource() == cube) {
            data = Float.parseFloat(display.getText());
            //operation = 8; 
            data=(float)data*data*data;//cube
            display.setText(String.valueOf(data));
        }else if (event.getSource() == inverse) {
            
            data = Float.parseFloat(display.getText());
            //operation = 9; 
            data=(float)(1/data);//inverse
            try{
            display.setText(String.valueOf((data)));}
            catch(Exception e){display.setText("Error");}
        }else if (event.getSource() == negate) {
            //data = Float.parseFloat(display.getText());
            //operation = 10; 
            if(display.getText().charAt(0)!='-')//negation
            display.setText("-"+display.getText());
            else display.setText(display.getText().substring(1,display.getText().length()));
        }else if (event.getSource() == back) {
          //  data = Float.parseFloat(display.getText());
            //operation = 7; 
            display.setText(display.getText().substring(0,display.getText().length()-1));
        }else if (event.getSource() == space) {
            display.setText(display.getText().substring(0,display.getText().length()-1));
        }else if (event.getSource() == equals) {
            Float secondOperand = Float.parseFloat(display.getText());
            Float ans;
            switch (operation) {
                case 1: //Addition
                    ans = data + secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 2: //Subtraction
                    ans = data - secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 3: //Mul
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 4: //Div
                    ans = 0f;
                    try {
                        ans = data / secondOperand;
                    }catch(Exception e){display.setText("Error");}
                    display.setText(String.valueOf(ans));break;
                case 5://Modulus
                    ans=((data)%secondOperand);
                    display.setText(String.valueOf(ans));break;
            }
            //secondOperand=(float)0.0;
            ans=(float)0.0;
            data=(float)0.0;
        }}catch(Exception e){display.setText("Error");}
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}