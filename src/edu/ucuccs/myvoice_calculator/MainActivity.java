package edu.ucuccs.myvoice_calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Float num2;
	Float num4;
	// Double div;
	String operation;

	Float ans;
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btn0;
	Button btn00;
	Button btnc;
	Button btnminus;
	Button btnplus;
	Button btnmulti;
	Button btndivide;
	Button btndot;
	Button btnequal;
	Button btnon;
	Button btnoff;
	EditText editnum1,editnum5;
	EditText editnum2, editnum3, editnum4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);
		btn3 = (Button) findViewById(R.id.btn3);
		btn4 = (Button) findViewById(R.id.btn4);
		btn5 = (Button) findViewById(R.id.btn5);
		btn6 = (Button) findViewById(R.id.btn6);
		btn7 = (Button) findViewById(R.id.btn7);
		btn8 = (Button) findViewById(R.id.btn8);
		btn9 = (Button) findViewById(R.id.btn9);
		btn00 = (Button) findViewById(R.id.btn00);
		btn0 = (Button) findViewById(R.id.btn0);
		btndot = (Button) findViewById(R.id.btndot);
		btnminus = (Button) findViewById(R.id.btnminus);
		btnplus = (Button) findViewById(R.id.btnplus);
		btnmulti = (Button) findViewById(R.id.btnmulti);
		btndivide = (Button) findViewById(R.id.btndivide);
		btnequal = (Button) findViewById(R.id.btnequal);
		btnon = (Button) findViewById(R.id.btnon);
		btnoff = (Button) findViewById(R.id.btnoff);
		editnum1 = (EditText) findViewById(R.id.editnum1);
		editnum2 = (EditText) findViewById(R.id.editnum2);
		editnum3 = (EditText) findViewById(R.id.editnum3);
		editnum4 = (EditText) findViewById(R.id.editnum4);
		editnum5 = (EditText) findViewById(R.id.editnum5);

	}

	public void one(View v) {
		editnum1.setText(editnum1.getText() + "1");
		editnum2.setText(editnum1.getText());
	}

	public void two(View v) {
		editnum1.setText(editnum1.getText() + "2");
		editnum2.setText(editnum1.getText());
	}

	public void three(View v) {
		editnum1.setText(editnum1.getText() + "3");
		editnum2.setText(editnum1.getText());
	}

	public void four(View v) {
		editnum1.setText(editnum1.getText() + "4");
		editnum2.setText(editnum1.getText());
	}

	public void five(View v) {
		editnum1.setText(editnum1.getText() + "5");
		editnum2.setText(editnum1.getText());
	}

	public void six(View v) {
		editnum1.setText(editnum1.getText() + "6");
		editnum2.setText(editnum1.getText());
	}

	public void seven(View v) {
		editnum1.setText(editnum1.getText() + "7");
		editnum2.setText(editnum1.getText());
	}

	public void eight(View v) {
		editnum1.setText(editnum1.getText() + "8");
		editnum2.setText(editnum1.getText());
	}

	public void nine(View v) {
		editnum1.setText(editnum1.getText() + "9");
		editnum2.setText(editnum1.getText());
	}

	public void zero(View v) {
		editnum1.setText(editnum1.getText() + "0");
		editnum2.setText(editnum1.getText());
	}

	public void zero2(View v) {
		editnum1.setText(editnum1.getText() + "00");
		editnum2.setText(editnum1.getText());
	}

	public void dot(View v) {
		editnum1.setText("" + ".");
		editnum2.setText("" + ".");
	}

	public void clear(View v) {
		editnum2.setText("");
		editnum1.setText("");
		editnum3.setText("");
		editnum4.setText("");
	}

	// calculation//
	public void plus(View v) {

		editnum3.setText("+");
		editnum2.setText(editnum1.getText());
		editnum1.setText("");
		editnum4.setText(editnum2.getText().toString());
		editnum5.setText(editnum4.getText().toString() + "+");
		editnum2.setText("");

	}

	public void minus(View v) {

		editnum3.setText("-");
		editnum2.setText(editnum1.getText());
		editnum1.setText("");
		editnum4.setText(editnum2.getText().toString());
		editnum5.setText(editnum4.getText().toString() + "-");
		editnum2.setText("");

	}

	public void multi(View v) {

		editnum3.setText("*");
		editnum2.setText(editnum1.getText());
		editnum1.setText("");
		editnum4.setText(editnum2.getText().toString());
		editnum5.setText(editnum4.getText().toString() + "*");
		editnum2.setText("");

	}

	public void divide(View v) {

		editnum3.setText("/");
		editnum2.setText(editnum1.getText());
		editnum1.setText("");
		editnum4.setText(editnum2.getText().toString());
		editnum5.setText(editnum4.getText().toString() + "/");
		editnum2.setText("");

	}

	public void equals(View v) {

		num2 = Float.parseFloat(editnum2.getText().toString());
		num4 = Float.parseFloat(editnum4.getText().toString());
		operation = editnum3.getText().toString();
		editnum5.setText("");
		if (operation.equals("+")) {
			ans = (num4 + num2);
			editnum1.setText(ans.toString());
			editnum2.setText(ans.toString());
			editnum4.setText("");
			
		} else if (operation.equals("-")) {
			ans = (num4 - num2);
			editnum1.setText(ans.toString());
			editnum2.setText(ans.toString());
			editnum4.setText("");
		} else if (operation.equals("*")) {
			ans = (num4 * num2);
			editnum1.setText(ans.toString());
			editnum2.setText(ans.toString());
			editnum4.setText("");
		} else if (operation.equals("/")) {
			ans = (num4 / num2);
			editnum1.setText(ans.toString());
			editnum2.setText(ans.toString());
			editnum4.setText("");
		}
	}

}
