package com.example.plminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.widget.TextView;
import android.widget.Toast;

import android.app.AlertDialog;
import android.content.DialogInterface;

public class PayingOptions extends AppCompatActivity {
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paying_options);
        b2 = findViewById(R.id.button2);
        b2.setEnabled(false);

        Bundle extras = getIntent().getExtras();


        String userName = extras.getString("name");

        ListView myListView = findViewById(R.id.listView);
        final String[] paymentOptions = {"UPI", "Credit/Debit Card", "Cash on Delivery"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paymentOptions);
        myListView.setAdapter(arrayAdapter);

        // Declare the input variable outside both methods
        final EditText[] input = new EditText[1];

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final String selectedPayment = paymentOptions[position];

                // Display dialog to get input from the user
                AlertDialog.Builder builder = new AlertDialog.Builder(PayingOptions.this);

                if(selectedPayment.equals("UPI")) {
                    builder.setTitle("Enter Your Details for " + selectedPayment);
                    input[0] = new EditText(PayingOptions.this);
                    input[0].setHint("UPI ID");
                    builder.setView(input[0]);
                }
                else if(selectedPayment.equals("Credit/Debit Card")) {
                    builder.setTitle("Enter Your Details for " + selectedPayment);
                    LinearLayout layout = new LinearLayout(PayingOptions.this);
                    layout.setOrientation(LinearLayout.VERTICAL);

                    EditText cardNumberInput = new EditText(PayingOptions.this);
                    cardNumberInput.setHint("Card Number");
                    layout.addView(cardNumberInput);

                    EditText nameOnCardInput = new EditText(PayingOptions.this);
                    nameOnCardInput.setHint("Name on Card");
                    layout.addView(nameOnCardInput);

                    EditText validThruInput = new EditText(PayingOptions.this);
                    validThruInput.setHint("Valid Thru (MM/YY)");
                    layout.addView(validThruInput);

                    EditText cvvInput = new EditText(PayingOptions.this);
                    cvvInput.setHint("CVV");
                    layout.addView(cvvInput);

                    builder.setView(layout);
                }
                else {
                    builder.setTitle("Enter Your Details for " + selectedPayment);
                    input[0] = new EditText(PayingOptions.this);
                    input[0].setHint("Are you sure that you want to go for Cash on Delivery? (YES/NO)");
                    builder.setView(input[0]);
                }


                builder.setPositiveButton("PAY", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Retrieve input from the EditText field
                        if(selectedPayment.equals("Cash on Delivery")){
                            Toast.makeText(PayingOptions.this, "Thanks " + userName + ". You have selected cash on Delivery " , Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(PayingOptions.this, "Thanks " + userName + " your Payment by " + selectedPayment + " is Successfully Done ", Toast.LENGTH_SHORT).show();
                        }
                        b2.setEnabled(true);

                    }


                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i2 = new Intent(PayingOptions.this,OrderSuccess.class);

                startActivity(i2);
                Toast.makeText(PayingOptions.this, "Wait... We're Placing Your Order...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
