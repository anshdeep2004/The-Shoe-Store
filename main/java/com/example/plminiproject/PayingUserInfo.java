package com.example.plminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PayingUserInfo extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6;
    RadioGroup r1;
    RadioButton ra,rb,rc;
    Button b1;
    boolean edt1,edt2,edt3,edt4,edt5,edt6,rg1;
    TextView t1,t2,t3,t4;
    CheckBox cb1,cb2;
    boolean chb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paying_user_info);
        t1 = findViewById(R.id.textView4);
        t2 = findViewById(R.id.textView);
        t3 = findViewById(R.id.textView2);
        e1 = findViewById(R.id.editTextText);
        e2 = findViewById(R.id.editTextText2);
        e3 = findViewById(R.id.editTextText3);
        e4 = findViewById(R.id.editTextText4);
        e5 = findViewById(R.id.editTextText5);
        e6 = findViewById(R.id.editTextText6);

        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);
        b1 = findViewById(R.id.button);


        e1.addTextChangedListener(textWatcher1);
        e2.addTextChangedListener(textWatcher2);
        e3.addTextChangedListener(textWatcher3);
        e4.addTextChangedListener(textWatcher4);
        e5.addTextChangedListener(textWatcher5);
        e6.addTextChangedListener(textWatcher6);
        cb1.setEnabled(false);
        b1.setEnabled(false);
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    chb = true;

                    updateButtonStatus();

                }
                else{
                    chb = false;

                    updateButtonStatus();

                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = e1.getText().toString();
                Intent i1 = new Intent(PayingUserInfo.this, PayingOptions.class);
                i1.putExtra("name", name);
                startActivity(i1);
                Toast.makeText(PayingUserInfo.this, "Proceeding for Payment...", Toast.LENGTH_SHORT).show();
            }
        });
    }


    TextWatcher textWatcher1 = new TextWatcher(){
        @Override
        public void beforeTextChanged(CharSequence str, int start, int
                count, int after){
        }
        @Override
        public void onTextChanged(CharSequence str, int start, int count,
                                  int after){
        }
        @Override
        public void afterTextChanged(Editable str){
            edt1 = str.length() > 0;
            updateButtonState();
        }
    };
    TextWatcher textWatcher2 = new TextWatcher(){
        @Override
        public void beforeTextChanged(CharSequence str, int start, int count, int after){
        }
        @Override
        public void onTextChanged(CharSequence str, int start, int count, int after){
        }
        @Override
        public void afterTextChanged(Editable str){
            edt2 = str.length() > 0;
            updateButtonState();
        }
    };
    TextWatcher textWatcher3 = new TextWatcher(){
        @Override
        public void beforeTextChanged(CharSequence str, int start, int
                count, int after){
        }
        @Override
        public void onTextChanged(CharSequence str, int start, int count,
                                  int after){
        }
        @Override
        public void afterTextChanged(Editable str){
            edt3 = str.length() > 0;
            updateButtonState();
        }
    };
    TextWatcher textWatcher4 = new TextWatcher(){
        @Override
        public void beforeTextChanged(CharSequence str, int start, int
                count, int after){
        }
        @Override
        public void onTextChanged(CharSequence str, int start, int count,
                                  int after){
        }
        @Override
        public void afterTextChanged(Editable str){
            edt4 = str.length() > 0;
            updateButtonState();
        }
    };

    TextWatcher textWatcher5 = new TextWatcher(){
        @Override
        public void beforeTextChanged(CharSequence str, int start, int
                count, int after){
        }
        @Override
        public void onTextChanged(CharSequence str, int start, int count,
                                  int after){
        }
        @Override
        public void afterTextChanged(Editable str){
            edt5 = str.length() > 0;
            updateButtonState();
        }
    };
    TextWatcher textWatcher6 = new TextWatcher(){
        @Override
        public void beforeTextChanged(CharSequence str, int start, int count, int after){
        }
        @Override
        public void onTextChanged(CharSequence str, int start, int count, int after){
        }
        @Override
        public void afterTextChanged(Editable str){
            edt6 = str.length() > 0;
            updateButtonState();
        }
    };
    private void updateButtonState(){
        cb1.setEnabled(edt1 && edt2 && edt3 && edt4 && edt5 && edt6);
    }
    private void updateButtonStatus(){ b1.setEnabled(chb);}
}