package com.jovialway.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Spinner spinnerDiv,subdivspnr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerDiv=findViewById(R.id.divspinner);
        subdivspnr=findViewById(R.id.subdivspnr);

        List<String> divisions = Arrays.asList(getResources().getStringArray(R.array.divisions));
        final List<String> barisal = Arrays.asList(getResources().getStringArray(R.array.barisal));
        final List<String> chattogram = Arrays.asList(getResources().getStringArray(R.array.chattogram));
        final List<String> dhaka = Arrays.asList(getResources().getStringArray(R.array.dhaka));
        final List<String> khulna = Arrays.asList(getResources().getStringArray(R.array.khulna));
        final List<String> mymensingh = Arrays.asList(getResources().getStringArray(R.array.mymensingh));
        final List<String> rajshahi = Arrays.asList(getResources().getStringArray(R.array.rajshahi));
        final List<String> rangpur = Arrays.asList(getResources().getStringArray(R.array.rangpur));
        final List<String> sylhet = Arrays.asList(getResources().getStringArray(R.array.sylhet));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, divisions);

        spinnerDiv.setAdapter(adapter);

        spinnerDiv.setSelection(0);
        subdivspnr.setSelection(0);

        spinnerDiv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                if (item.equals("Barisal")){
                    ArrayAdapter<String> subadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, barisal);
                    subdivspnr.setAdapter(subadapter);
                } if (item.equals("Chattogram")){
                    ArrayAdapter<String> subadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, chattogram);
                    subdivspnr.setAdapter(subadapter);
                }if (item.equals("Dhaka")){
                    ArrayAdapter<String> subadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, dhaka);
                    subdivspnr.setAdapter(subadapter);
                } if (item.equals("Khulna")){
                    ArrayAdapter<String> subadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, khulna);
                    subdivspnr.setAdapter(subadapter);
                }if (item.equals("Mymensingh")){
                    ArrayAdapter<String> subadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, mymensingh);
                    subdivspnr.setAdapter(subadapter);
                } if (item.equals("Rajshahi")){
                    ArrayAdapter<String> subadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, rajshahi);
                    subdivspnr.setAdapter(subadapter);
                }if (item.equals("Rangpur")){
                    ArrayAdapter<String> subadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, rangpur);
                    subdivspnr.setAdapter(subadapter);
                } if (item.equals("Sylhet")){
                    ArrayAdapter<String> subadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, sylhet);
                    subdivspnr.setAdapter(subadapter);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        subdivspnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String subdiv = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, subdiv, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }


}
