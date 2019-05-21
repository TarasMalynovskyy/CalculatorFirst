package com.calculator.address.view;

import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class CalcOverviewController implements Initializable {

	@FXML
	public JFXButton point;
	public JFXButton zero;
	public JFXButton zeroTwice;
	public JFXButton one;
	public JFXButton two;
	public JFXButton three;
	public JFXButton four;
	public JFXButton five;
	public JFXButton six;
	public JFXButton seven;
	public JFXButton eight;
	public JFXButton nine;
	public JFXButton clear;
	public JFXButton factorial;
	public JFXButton perc;
	public JFXButton sqrt;
	public JFXButton plus;
	public JFXButton minus;
	public JFXButton multi;
	public JFXButton division;
	public JFXButton equals;
	public JFXTextField input;
	public Label prom;

	private Double fnumber;
	private Double snumber;
	private String operation;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void pointClick() {
		String oldValue = input.getText();
		String set = ".";
		input.setText(oldValue + set);

	}

	public void zeroClick() {
		String oldValue = input.getText();
		String set = "0";
		input.setText(oldValue + set);

	}

	public void zeroTwiceClick() {
		String oldValue = input.getText();
		String set = "00";
		input.setText(oldValue + set);

	}

	public void oneClick() {
		String oldValue = input.getText();
		String set = "1";
		input.setText(oldValue + set);

	}

	public void twoClick() {
		String oldValue = input.getText();
		String set = "2";
		input.setText(oldValue + set);

	}

	public void threeClick() {
		String oldValue = input.getText();
		String set = "3";
		input.setText(oldValue + set);

	}

	public void fourClick() {
		String oldValue = input.getText();
		String set = "4";
		input.setText(oldValue + set);

	}

	public void fiveClick() {
		String oldValue = input.getText();
		String set = "5";
		input.setText(oldValue + set);

	}

	public void sixClick() {
		String oldValue = input.getText();
		String set = "6";
		input.setText(oldValue + set);

	}

	public void sevenClick() {
		String oldValue = input.getText();
		String set = "7";
		input.setText(oldValue + set);

	}

	public void eightClick() {
		String oldValue = input.getText();
		String set = "8";
		input.setText(oldValue + set);

	}

	public void nineClick() {
		String oldValue = input.getText();
		String set = "9";
		input.setText(oldValue + set);

	}

	public void clearClick() {
		input.setText("");
		prom.setText("");
		this.fnumber = 0.0;
		this.snumber = 0.0;

	}

	public BigInteger factorialHavingLargeResult(Double n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
				result = result.multiply(BigInteger.valueOf(i));
				input.setText(String.valueOf(result));
		}
		return result;
	}

	public void factorialClick() {
		String valueFact = input.getText();
		double valueNamber = Double.parseDouble(valueFact);
		this.fnumber = valueNamber;

		if (this.fnumber <= 20) {
			long fact = 1;
			for (int i = 2; i <= this.fnumber; i++) {
				fact = fact * i;
			}
			long systemFact = fact;
			input.setText(String.valueOf(systemFact));
			prom.setText(valueFact + " n!");
		} else {
			factorialHavingLargeResult(this.fnumber);
		}

	}

	public void percClick() {
		String value = input.getText();
		double valueNamber = Double.parseDouble(value);
		this.fnumber = valueNamber;
		input.setText("");
		prom.setText(value + "%");
		operation = "%";

	}

	public void sqrtClick() {

		String valueSqrt = input.getText();
		double valueNamber = Double.parseDouble(valueSqrt);
		this.fnumber = valueNamber;
		double systemSqrt = (double) Math.sqrt(this.fnumber);
		input.setText(String.valueOf(systemSqrt));
		prom.setText(valueSqrt + " sqrt");

	}

	public void plusClick() {
		String value = input.getText();
		double valueNamber = Double.parseDouble(value);
		this.fnumber = (double) valueNamber;
		input.setText("");
		prom.setText(value + "+");
		operation = "+";

	}

	public void minusClick() {
		String value = input.getText();
		double valueNamber = Double.parseDouble(value);
		this.fnumber = (double) valueNamber;
		input.setText("");
		prom.setText(value + "-");
		operation = "-";

	}

	public void multiClick() {
		String value = input.getText();
		double valueNamber = Double.parseDouble(value);
		this.fnumber = (double) valueNamber;
		input.setText("");
		prom.setText(value + "x");
		operation = "x";

	}

	public void divisionClick() {
		String value = input.getText();
		double valueNamber = Double.parseDouble(value);
		this.fnumber = (double) valueNamber;
		input.setText("");
		prom.setText(value + "/");
		operation = "/";

	}

	public void equalsClick() {
		switch (operation) {
		case "+":
			String valuePlus = input.getText();
			this.snumber = Double.parseDouble(valuePlus);
			double systemPlus = this.fnumber + this.snumber;
			input.setText(String.valueOf(systemPlus));
			String oldPromPlus = prom.getText();
			prom.setText(oldPromPlus + valuePlus);
			break;

		case "-":
			String valueMinus = input.getText();
			this.snumber = Double.parseDouble(valueMinus);
			double systemMinus = this.fnumber - this.snumber;
			input.setText(String.valueOf(systemMinus));
			String oldPromMinus = prom.getText();
			prom.setText(oldPromMinus + valueMinus);
			break;

		case "x":
			String valueMulti = input.getText();
			this.snumber = Double.parseDouble(valueMulti);
			double systemMulti = this.fnumber * this.snumber;
			input.setText(String.valueOf(systemMulti));
			String oldPromMulti = prom.getText();
			prom.setText(oldPromMulti + valueMulti);
			break;

		case "/":
			String valueDivision = input.getText();
			this.snumber = Double.parseDouble(valueDivision);
			double systemDivision = this.fnumber / this.snumber;
			input.setText(String.valueOf(systemDivision));
			String oldPromDivision = prom.getText();
			prom.setText(oldPromDivision + valueDivision);
			break;

		case "%":
			String valuePers = input.getText();
			this.snumber = Double.parseDouble(valuePers);
			double systemPers = this.snumber * (this.fnumber / 100);
			input.setText(String.valueOf(systemPers));
			String oldPromPers = prom.getText();
			prom.setText(oldPromPers + valuePers);

			break;

		}

	}

}
