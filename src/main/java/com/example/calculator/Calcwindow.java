package com.example.calculator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

    public class Calcwindow {
        private int storeNumber;
        @FXML
        private TextField numberDisplay;
        private Operation lastOP;

        @FXML
        public void numberButtonPushed(ActionEvent event){
            var currentText = numberDisplay.getText();
            var ButtonPressed = (Button)event.getSource();
            var currentNumberText = ButtonPressed.getText();
            var newText = currentText+currentNumberText;
            numberDisplay.setText(newText);
        }
        @FXML
        public void subtractionButtonPressed(){
            var numberText = numberDisplay.getText();
            storeNumber = Integer.parseInt(numberText);
            numberDisplay.clear();
            lastOP = Operation.Subtract;
        }
        public void multiplyButtonPressed(){
            var numberText = numberDisplay.getText();
            storeNumber = Integer.parseInt(numberText);
            numberDisplay.clear();
            lastOP = Operation.Multiply;
        }
        public void divisionButtonPressed(){
            var numberText = numberDisplay.getText();
            storeNumber = Integer.parseInt(numberText);
            numberDisplay.clear();
            lastOP = Operation.Divide;
        }
        public void equalButtonPressed(){
            double result = 0.0;
            var currentNumberText = numberDisplay.getText();
            var currentNumber = Integer.parseInt(currentNumberText);
            switch (lastOP){
                case Add -> result = currentNumber + storeNumber;
                case Subtract -> result = storeNumber - currentNumber;
                case Multiply -> result = currentNumber * storeNumber;
                case Divide -> result = storeNumber / currentNumber;
            }
            numberDisplay.setText(""+result);
        }
        @FXML
        public void addButtonPressed(){
            var numbertext =numberDisplay.getText();
            storeNumber = Integer.parseInt(numbertext);
            numberDisplay.clear();
            lastOP = Operation.Add;
        }

        @FXML
        public void clearButtonPressed(){
            numberDisplay.setText("");

        }
    }

