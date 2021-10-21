package com.example.calculator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

    public class Calcwindow {
        private int storeNumber;
        @FXML
        private TextField numberDisplay;

        @FXML
        public void numberButtonPushed(ActionEvent event){
            var currentText = numberDisplay.getText();
            var ButtonPressed = (Button)event.getSource();
            var currentNumberText = ButtonPressed.getText();
            var newText = currentText+currentNumberText;
            numberDisplay.setText(newText);
        }
        @FXML
        public void equalButtonPressed(){
            var currentNumberText = numberDisplay.getText();
            var currentNumber = Integer.parseInt(currentNumberText);
            var sum = currentNumber + storeNumber;
            numberDisplay.setText(""+sum);
        }
        @FXML
        public void addButtonPressed(){
            var numbertext =numberDisplay.getText();
            storeNumber = Integer.parseInt(numbertext);
            numberDisplay.clear();
        }

        @FXML
        public void clearButtonPressed(){
            numberDisplay.setText("");

        }
    }

