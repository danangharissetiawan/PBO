package com.risset;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {
    private JTextField resultsTxt;
    private JButton clearBtn;
    private JButton signBtn;
    private JButton percentBtn;
    private JButton divideBtn;
    private JButton zeroBtn;
    private JButton digitBtn;
    private JButton equalBtn;
    private JButton oneBtn;
    private JButton twoBtn;
    private JButton threeBtn;
    private JButton addBtn;
    private JButton fourBtn;
    private JButton fiveBtn;
    private JButton sixBtn;
    private JButton minusBtn;
    private JButton sevenBtn;
    private JButton eightBtn;
    private JButton nineBtn;
    private JButton multiplyBtn;
    private JPanel calculatorView;
    private JRadioButton onRadioButton;
    private JRadioButton offRadioButton;
    private Double leftOperand;
    private Double rightOperand;
    private Operation calculatorOperation;

    public Calculator() {
        sevenBtn.addActionListener(new NumberBtnClicked(sevenBtn.getText()));
        eightBtn.addActionListener(new NumberBtnClicked(eightBtn.getText()));
        nineBtn.addActionListener(new NumberBtnClicked(nineBtn.getText()));
        fourBtn.addActionListener(new NumberBtnClicked(fourBtn.getText()));
        fiveBtn.addActionListener(new NumberBtnClicked(fiveBtn.getText()));
        sixBtn.addActionListener(new NumberBtnClicked(sixBtn.getText()));
        oneBtn.addActionListener(new NumberBtnClicked(oneBtn.getText()));
        twoBtn.addActionListener(new NumberBtnClicked(twoBtn.getText()));
        threeBtn.addActionListener(new NumberBtnClicked(threeBtn.getText()));
        zeroBtn.addActionListener(new NumberBtnClicked(zeroBtn.getText()));

        percentBtn.addActionListener(new OperationBtnClicked(Operation.PERCENTAGE));
        divideBtn.addActionListener(new OperationBtnClicked(Operation.DIVISION));
        multiplyBtn.addActionListener(new OperationBtnClicked(Operation.MULTIPLICATION));
        minusBtn.addActionListener(new OperationBtnClicked(Operation.SUBTRACTION));
        addBtn.addActionListener(new OperationBtnClicked(Operation.ADDITION));
        equalBtn.addActionListener(new EqualBtnClicked());
        clearBtn.addActionListener(new ClearBtnClicked());
        signBtn.addActionListener(new SignBtnClicked());
        digitBtn.addActionListener(new DigitBtnClicked());

        onRadioButton.addActionListener(new OnRadioButtonClicked());
        offRadioButton.addActionListener(new OffRadioButtonClicked());
    }

    public class NumberBtnClicked implements ActionListener {
        private String value;

        public NumberBtnClicked(String value) {
            this.value = value;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(leftOperand == null || leftOperand == 0.0) {
                value = resultsTxt.getText() + value;
            }else{
                rightOperand = Double.valueOf(value);
            }
            resultsTxt.setText(value);

        }
    }

    private class OperationBtnClicked implements ActionListener {
        private final Operation operation;

        public OperationBtnClicked(Operation operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            calculatorOperation = operation;
            leftOperand = Double.valueOf(resultsTxt.getText());
        }
    }

    private class ClearBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            leftOperand = 0.0;
            rightOperand = 0.0;
            calculatorOperation = null;
            resultsTxt.setText("");
        }
    }

    private class DigitBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            resultsTxt.setText(resultsTxt.getText() + ".");
        }
    }

    private class SignBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            resultsTxt.setText("-" + resultsTxt.getText());
        }
    }

    private class EqualBtnClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Double output = calculatorOperation.getOperation().applyAsDouble(leftOperand, rightOperand);
            resultsTxt.setText(output%1==0?String.valueOf(output.intValue()):String.valueOf(output));
            leftOperand = 0.0;
            rightOperand = 0.0;
        }
    }

    private class OnRadioButtonClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            oneBtn.setEnabled(true);
            twoBtn.setEnabled(true);
            threeBtn.setEnabled(true);
            fourBtn.setEnabled(true);
            fiveBtn.setEnabled(true);
            sixBtn.setEnabled(true);
            sevenBtn.setEnabled(true);
            eightBtn.setEnabled(true);
            nineBtn.setEnabled(true);
            zeroBtn.setEnabled(true);
            signBtn.setEnabled(true);
            digitBtn.setEnabled(true);
            clearBtn.setEnabled(true);
            percentBtn.setEnabled(true);
            divideBtn.setEnabled(true);
            multiplyBtn.setEnabled(true);
            minusBtn.setEnabled(true);
            addBtn.setEnabled(true);
            equalBtn.setEnabled(true);
            onRadioButton.setEnabled(false);
            offRadioButton.setEnabled(true);
        }
    }

    private class OffRadioButtonClicked implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            oneBtn.setEnabled(false);
            twoBtn.setEnabled(false);
            threeBtn.setEnabled(false);
            fourBtn.setEnabled(false);
            fiveBtn.setEnabled(false);
            sixBtn.setEnabled(false);
            sevenBtn.setEnabled(false);
            eightBtn.setEnabled(false);
            nineBtn.setEnabled(false);
            zeroBtn.setEnabled(false);
            signBtn.setEnabled(false);
            digitBtn.setEnabled(false);
            clearBtn.setEnabled(false);
            percentBtn.setEnabled(false);
            divideBtn.setEnabled(false);
            multiplyBtn.setEnabled(false);
            minusBtn.setEnabled(false);
            addBtn.setEnabled(false);
            equalBtn.setEnabled(false);
            onRadioButton.setEnabled(true);
            offRadioButton.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().calculatorView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
