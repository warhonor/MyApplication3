package com.example.guo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText editText;
    private  EditText editText2;
    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void  initview(){
        editText= (EditText) findViewById(R.id.edi1);
        String username = editText.getText().toString();
        editText2= (EditText) findViewById(R.id.edi2);
        String password = editText2.getText().toString();
    }


}
