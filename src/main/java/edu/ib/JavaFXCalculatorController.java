package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JavaFXCalculatorController {
    private static double number = 0;
    private static String sign = "";
    private static double numberAfterEqual = 0;
    private static boolean equalClicked = false;
    private static String signAfterEqual = "";
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField display;

    @FXML
    private Button c;

    @FXML
    private Button plusMinus;

    @FXML
    private Button percent;

    @FXML
    private Button divide;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button multiply;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button subtract;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button add;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button equals;

    @FXML
    void OnPlusMinusClicked(ActionEvent event) {
        equalClicked = false;
        String[] a = display.getText().split("");
        if (Double.parseDouble(display.getText()) != 0) {
            if (a[0].equals("-")) {
                String b = "";
                for (int i = 1; i < a.length; i++) {
                    b += a[i];
                }
                display.setText(b);
            } else {
                display.setText("-" + display.getText());
            }
        }
        number = Double.parseDouble(display.getText());
    }

    @FXML
    void onAddClicked(ActionEvent event) {
        equalClicked = false;
        if (number != 0) {
            double number1 = Double.parseDouble(display.getText());
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "+";
            display.setText("0");
        } else {
            number = Double.parseDouble(display.getText());
            sign = "+";
            display.setText("0");
        }
    }

    @FXML
    void onCClicked(ActionEvent event) {
        equalClicked = false;
        number = 0;
        sign = "";
        display.setText("0");
    }

    @FXML
    void onDivideClicked(ActionEvent event) {
        equalClicked = false;
        if (number != 0) {
            double number1 = Double.parseDouble(display.getText());
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "/";
            display.setText("0");
        } else {
            number = Double.parseDouble(display.getText());
            sign = "/";
            display.setText("0");
        }
    }

    @FXML
    void onDotClicked(ActionEvent event) {
        equalClicked = false;
        String[] a = display.getText().split("");
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(".")) {
                flag = true;
            }
        }
        if (!flag) {
            display.setText(display.getText() + ".");
        }
    }

    @FXML
    void onEightClicked(ActionEvent event) {
        equalClicked = false;
        if (display.getText().equals("0")) {
            display.setText("8");
        } else {
            display.setText(display.getText() + "8");
        }
    }

    @FXML
    void onEqualsClicked(ActionEvent event) {
        double number1 = Double.parseDouble(display.getText());
        if (!equalClicked) {
            numberAfterEqual = number1;
            signAfterEqual = sign;
            if (sign.equals("+")) {
                number = Calculations.add(number, number1);
                display.setText(Double.toString(number));
            } else if (sign.equals("-")) {
                number = Calculations.subtract(number, number1);
                display.setText(Double.toString(number));
            } else if (sign.equals("*")) {
                number = Calculations.multiply(number, number1);
                display.setText(Double.toString(number));
            } else if (sign.equals("/")) {
                number = Calculations.divide(number, number1);
                display.setText(Double.toString(number));
            }
            sign = "";
        } else {
            if (signAfterEqual.equals("+")) {
                number += numberAfterEqual;
                display.setText(Double.toString(number));
            } else if (signAfterEqual.equals("-")) {
                number -= numberAfterEqual;
                display.setText(Double.toString(number));
            } else if (signAfterEqual.equals("*")) {
                number *= numberAfterEqual;
                display.setText(Double.toString(number));
            } else if (signAfterEqual.equals("/")) {
                number /= numberAfterEqual;
                display.setText(Double.toString(number));
            }
        }
        equalClicked = true;
    }

    @FXML
    void onFiveClicked(ActionEvent event) {
        equalClicked = false;
        if (display.getText().equals("0")) {
            display.setText("5");
        } else {
            display.setText(display.getText() + "5");
        }
    }

    @FXML
    void onFourClicked(ActionEvent event) {
        equalClicked = false;
        if (display.getText().equals("0")) {
            display.setText("4");
        } else {
            display.setText(display.getText() + "4");
        }
    }

    @FXML
    void onMultiplyClicked(ActionEvent event) {
        equalClicked = false;
        if (number != 0) {
            double number1 = Double.parseDouble(display.getText());
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "*";
            display.setText("0");
        } else {
            number = Double.parseDouble(display.getText());
            sign = "*";
            display.setText("0");
        }
    }

    @FXML
    void onNineClicked(ActionEvent event) {
        equalClicked = false;
        if (display.getText().equals("0")) {
            display.setText("9");
        } else {
            display.setText(display.getText() + "9");
        }
    }

    @FXML
    void onOneClicked(ActionEvent event) {
        equalClicked = false;
        if (display.getText().equals("0")) {
            display.setText("1");
        } else {
            display.setText(display.getText() + "1");
        }
    }

    @FXML
    void onPercentClicked(ActionEvent event) {
        equalClicked = false;
        double number1 = Double.parseDouble(display.getText());
        number1 = Calculations.percent(number1);
        display.setText(Double.toString(number1));
        number = 0;
    }

    @FXML
    void onSevenClicked(ActionEvent event) {
        equalClicked = false;
        if (display.getText().equals("0")) {
            display.setText("7");
        } else {
            display.setText(display.getText() + "7");
        }
    }

    @FXML
    void onSixClicked(ActionEvent event) {
        equalClicked = false;
        if (display.getText().equals("0")) {
            display.setText("6");
        } else {
            display.setText(display.getText() + "6");
        }
    }

    @FXML
    void onSubtractClicked(ActionEvent event) {
        equalClicked = false;
        if (number != 0) {
            double number1 = Double.parseDouble(display.getText());
            if (sign.equals("+")) {
                number += number1;
            } else if (sign.equals("-")) {
                number -= number1;
            } else if (sign.equals("*")) {
                number *= number1;
            } else if (sign.equals("/")) {
                number /= number1;
            }
            sign = "-";
            display.setText("0");
        } else {
            number = Double.parseDouble(display.getText());
            sign = "-";
            display.setText("0");
        }
    }

    @FXML
    void onThreeClicked(ActionEvent event) {
        equalClicked = false;
        if (display.getText().equals("0")) {
            display.setText("3");
        } else {
            display.setText(display.getText() + "3");
        }
    }

    @FXML
    void onTwoClicked(ActionEvent event) {
        equalClicked = false;
        if (display.getText().equals("0")) {
            display.setText("2");
        } else {
            display.setText(display.getText() + "2");
        }
    }

    @FXML
    void onZeroClicked(ActionEvent event) {
        equalClicked = false;
        if (display.getText().equals("0")) {
            display.setText("0");
        } else {
            display.setText(display.getText() + "0");
        }
    }

    @FXML
    void initialize() {
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'calculator.fxml'.";
        assert c != null : "fx:id=\"c\" was not injected: check your FXML file 'calculator.fxml'.";
        assert plusMinus != null : "fx:id=\"plusMinus\" was not injected: check your FXML file 'calculator.fxml'.";
        assert percent != null : "fx:id=\"percent\" was not injected: check your FXML file 'calculator.fxml'.";
        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'calculator.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'calculator.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'calculator.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'calculator.fxml'.";
        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'calculator.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'calculator.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'calculator.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'calculator.fxml'.";
        assert subtract != null : "fx:id=\"subtract\" was not injected: check your FXML file 'calculator.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'calculator.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'calculator.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'calculator.fxml'.";
        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'calculator.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'calculator.fxml'.";
        assert dot != null : "fx:id=\"dot\" was not injected: check your FXML file 'calculator.fxml'.";
        assert equals != null : "fx:id=\"equals\" was not injected: check your FXML file 'calculator.fxml'.";

    }
}
