package com.example.monojit.fragmentexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    FragDemo fragDemo = new FragDemo();
    TextView txt;
    EditText txt1;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container,fragDemo);
        fragmentTransaction.commit();
        txt1=(EditText) findViewById(R.id.val);
        txt =(TextView)findViewById(R.id.textViewfragment);
        str  = txt1.getText().toString();
    }
    public void result(){
        txt.setText(str);
    }
}
