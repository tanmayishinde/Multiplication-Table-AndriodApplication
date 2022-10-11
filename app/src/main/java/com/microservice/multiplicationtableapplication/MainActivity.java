package com.microservice.multiplicationtableapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView inputUser;
    private TextView outputView;
    private Button buttonMultiply;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputUser = findViewById(R.id.inputUser);
        buttonMultiply =findViewById(R.id.button);
        outputView = findViewById(R.id.textView);


         buttonMultiply.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View view) {

                 String input = inputUser.getText().toString();
                 int coverInt = Integer.parseInt(input);
                 result = "";
                 for(int i = 1; i <= 12; i++)
                 {
                     result += coverInt + " " + "  *  " + i + "  =  " + coverInt*i +"\n";
                     outputView.setText(result);

                 }


             }
         });

    }
}