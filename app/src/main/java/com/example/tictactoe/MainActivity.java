package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    public void onClickButton(View v){
        AppCompatButton btnCurrent = (AppCompatButton) v; //convert into button

        if(btnCurrent.getText().toString().equals("")) { //if button is empty("")
            count++;

            //print 'X' and 'O'
            if (flag == 0) {
                btnCurrent.setText("X"); //'X' is print in 1btn, 3btn, 5btn, 7btn, 9btn.
                flag = 1;
            } else {
                btnCurrent.setText("O"); //'O' is print in 2btn, 4btn, 6btn, 8btn.
                flag = 0;
            }

            //conditions
            if (count > 4) {
                //fetch value from button
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) { //check first row
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b3.equals(b4) && b4.equals(b5) && !b3.equals("")) { //check second row
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) { //check third row
                    Toast.makeText(this, "Winner is " + b4, Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b1.equals(b4) && b4.equals(b7) && !b3.equals("")) { //check first column
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) { //check second column
                    Toast.makeText(this, "Winner is " + b2, Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) { //check third column
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) { //check left Diagonal
                    Toast.makeText(this, "Winner is " + b1, Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) { //check right diagonal
                    Toast.makeText(this, "Winner is " + b3, Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if(count == 9){ //all buttons are filled then match is draw.
                    Toast.makeText(this, "Match Draw", Toast.LENGTH_SHORT).show();
                    newGame();
                }
            }
        }
    }

    public void newGame(){
        flag = 0;
        count = 0;

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }

}