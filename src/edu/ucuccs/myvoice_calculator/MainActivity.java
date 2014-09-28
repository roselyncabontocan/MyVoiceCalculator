package edu.ucuccs.myvoice_calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Double num1, num2,num3;
	Boolean add, minus, mul, div;
	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn00,
			btnc, btnminus, btnplus, btnmulti, btndivide, btndot, btnequal;
	Button btnon;
	Button btnoff;
	EditText editnum1,editnum5;

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
		editnum5 = (EditText) findViewById(R.id.editnum5);

	}

	public void one(View v) {
		editnum1.setText(editnum1.getText() + "1");
		
	}

	public void two(View v) {
		editnum1.setText(editnum1.getText() + "2");
		
	}

	public void three(View v) {
		editnum1.setText(editnum1.getText() + "3");
		
	}

	public void four(View v) {
		editnum1.setText(editnum1.getText() + "4");
		
	}

	public void five(View v) {
		editnum1.setText(editnum1.getText() + "5");
		
	}

	public void six(View v) {
		editnum1.setText(editnum1.getText() + "6");
		
	}

	public void seven(View v) {
		editnum1.setText(editnum1.getText() + "7");
		
	}

	public void eight(View v) {
		editnum1.setText(editnum1.getText() + "8");
		
	}

	public void nine(View v) {
		editnum1.setText(editnum1.getText() + "9");
		
	}

	public void zero(View v) {
		editnum1.setText(editnum1.getText() + "0");
		
	}

	public void zero2(View v) {
		editnum1.setText(editnum1.getText() + "00");
		
	}

	public void dot(View v) {
		editnum1.setText("" + ".");
		
	}

	public void clear(View v) {
		
		editnum1.setText("");
		
	}

	// calculation//
	public void plus(View v) {

		
		num1=Double.parseDouble(editnum1.getText() +"");
		editnum5.setText(editnum1.getText().toString() + "" + "+");
		add=true;
		editnum1.setText(null);


	}

	public void minus(View v) {
		num1=Double.parseDouble(editnum1.getText() +"");
		editnum5.setText(editnum1.getText().toString() + "" + "-");
		minus=true;
		editnum1.setText(null);
	}

	public void multi(View v) {
		num1=Double.parseDouble(editnum1.getText() +"");
		editnum5.setText(editnum1.getText().toString() + "" + "*");
		mul=true;
		editnum1.setText(null);
	}

	public void divide(View v) {
		num1=Double.parseDouble(editnum1.getText() +"");
		editnum5.setText(editnum1.getText().toString() + "" + "/");
		div=true;
		editnum1.setText(null);	}

	public void equals(View v) {
		
		num2 = Double.parseDouble(editnum1.getText() +"");
		num3 = Double.parseDouble(editnum1.getText() +"");
		editnum5.setText("");
		
		if (add==true) {
		editnum1.setText(num1 + num2+ num3 +"");
		add=false;
		
		} else if (minus==true) {
			editnum1.setText(num1 - num2 +"");
			minus=false;
		} else if (mul==true) {
			editnum1.setText(num1 * num2 +"");
			mul=false; 
		} else if (div==true) {
			editnum1.setText(num1 / num2 +"");
			div=false;
		}
	}
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		int id=item.getItemId();
		if(id==R.id.action_settings){
			return super.onOptionsItemSelected(item);
		}
		return false;
}
}

