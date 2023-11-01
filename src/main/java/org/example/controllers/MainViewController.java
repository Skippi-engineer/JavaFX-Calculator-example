package org.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainViewController
{
    @FXML private TextField resultField;

    private String firstNumber = "";
    private String currentNumber = "";
    private String operation;
    private boolean calculated = false;

    public void button0()
    {
        addNumber("0");
    }

    public void button1()
    {
        addNumber("1");
    }

    public void button2()
    {
        addNumber("2");
    }

    public void button3()
    {
        addNumber("3");
    }

    public void button4()
    {
        addNumber("4");
    }

    public void button5()
    {
        addNumber("5");
    }

    public void button6()
    {
        addNumber("6");
    }

    public void button7()
    {
        addNumber("7");
    }

    public void button8()
    {
        addNumber("8");
    }

    public void button9()
    {
        addNumber("9");
    }

    public void buttonDot()
    {
        addNumber(".");
    }

    public void buttonPlus()
    {
        calculationSetup("+");
    }

    public void buttonMinus()
    {
        if(currentNumber.isEmpty()) addNumber("-");
        else calculationSetup("-");
    }

    public void buttonMultiply()
    {
        calculationSetup("*");
    }

    public void buttonDivide()
    {
        calculationSetup("/");
    }

    public void buttonMod()
    {
        calculationSetup("Mod");
    }

    public void buttonDiv()
    {
        calculationSetup("Div");
    }

    public void buttonCalculate()
    {
        if(firstNumber.isEmpty()) return;
        double firstNumberDouble;
        double secondNumberDouble;
        try
        {
            firstNumberDouble = Double.parseDouble(firstNumber);
            secondNumberDouble = Double.parseDouble(currentNumber);
        }
        catch(NumberFormatException ex)
        {
            resultField.setText("Error");
            return;
        }

        double calculatedNumber = 0;
        switch (operation)
        {
            case "+":
            {
                calculatedNumber = firstNumberDouble + secondNumberDouble;
                resultField.setText(String.valueOf(calculatedNumber));
                break;
            }
            case "-":
            {
                calculatedNumber = firstNumberDouble - secondNumberDouble;
                resultField.setText(String.valueOf(calculatedNumber));
                break;
            }
            case "/":
            {
                calculatedNumber = firstNumberDouble / secondNumberDouble;
                resultField.setText(String.valueOf(calculatedNumber));
                break;
            }
            case "*":
            {
                calculatedNumber = firstNumberDouble * secondNumberDouble;
                resultField.setText(String.valueOf(calculatedNumber));
                break;
            }
            case "Div":
            {
                calculatedNumber = (int)firstNumberDouble / (int)secondNumberDouble;
                resultField.setText(String.valueOf(calculatedNumber));
                break;
            }
            case "Mod":
            {
                calculatedNumber = firstNumberDouble % secondNumberDouble;
                resultField.setText(String.valueOf(calculatedNumber));
                break;
            }
        }
        calculated = true;
        currentNumber = String.valueOf(calculatedNumber);
        firstNumber="";
    }

    public void calculationSetup(String operation)
    {
        this.operation = operation;
        firstNumber = currentNumber;
        currentNumber = "";
        calculated = false;
    }

    public void addNumber(String number)
    {
        if(calculated)
        {
            currentNumber = "";
            calculated = false;
        }
        currentNumber += number;
        updateTextField();
    }

    public void updateTextField()
    {
        resultField.setText(currentNumber);
    }

    public void buttonClear()
    {
        if (currentNumber.length() > 0)
        {
            currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
        }
        updateTextField();
    }

    public void buttonClearAll()
    {
        firstNumber="";
        currentNumber="";
        operation ="";
        updateTextField();
    }
}
