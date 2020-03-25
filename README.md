# Division-In-Spinner-With-District
 64 Districts in Spinner With 8 Divisions with Spinner.on selected division show districts on another Spinner .
 
 activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:weightSum="2"
    android:padding="30dp"
    tools:context=".MainActivity">

      <Spinner
        android:id="@+id/divspinner"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
          android:layout_weight="1"/>
    <Spinner
        android:id="@+id/subdivspnr"
        android:layout_width="0dp"
        android:layout_weight="1"
        android:layout_height="wrap_content"/>


</LinearLayout>



MainActivity.java file

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


List from String Resource
<resources>
    <string name="app_name">Test</string>

    <string-array name="divisions">
        <item>Barisal</item>
        <item>Chattogram</item>
        <item>Dhaka</item>
        <item>Khulna</item>
        <item>Mymensingh</item>
        <item>Rajshahi</item>
        <item>Rangpur</item>
        <item>Sylhet</item>
    </string-array>

    <string-array name="barisal">
        <item>Barguna</item>
        <item>Barishal</item>
        <item>Bhola</item>
        <item>Jhalokati</item>
        <item>Patuakhali</item>
        <item>Pirojpur</item>
    </string-array>

    <string-array name="chattogram">
        <item>Bandarban</item>
        <item>Brahmanbaria </item>
        <item>Chandpur </item>
        <item>Chattogram </item>
        <item>Cumilla </item>
        <item>Cox\'s Bazar </item>
        <item>Feni </item>
        <item>Khagrachhari </item>
        <item>Lakshmipur </item>
        <item>Noakhali </item>
        <item>Rangamati </item>
    </string-array>

    <string-array name="dhaka">
        <item>Dhaka</item>
        <item>Faridpur</item>
        <item>Gazipur </item>
        <item>Gopalganj </item>
        <item>Kishoreganj </item>
        <item>Madaripur </item>
        <item>Manikganj </item>
        <item>Munshiganj </item>
        <item>Narayanganj </item>
        <item>Narsingdi </item>
        <item>Rajbari </item>
        <item> Shariatpur </item>
        <item> Tangail </item>
    </string-array>

    <string-array name="khulna">
        <item>Bagerhat </item>
        <item>Chuadanga </item>
        <item>Jashore </item>
        <item>Jhenaidah </item>
        <item>Khulna </item>
        <item>Kushtia </item>
        <item>Magura </item>
        <item>Meherpur </item>
        <item>Narail </item>
        <item>Satkhira </item>
    </string-array>

    <string-array name="mymensingh">
        <item>Jamalpur</item>
        <item>Mymensingh</item>
        <item>Netrokona</item>
        <item>Sherpur</item>
    </string-array>

    <string-array name="rajshahi">
       <item>Bogura</item>
        <item>Joypurhat</item>
        <item>Naogaon</item>
        <item>Natore</item>
        <item>Chapainawabganj</item>
        <item>Pabna</item>
        <item>Rajshahi</item>
        <item>Sirajganj</item>
    </string-array>

    <string-array name="rangpur">
        <item>Dinajpur</item>
        <item>Gaibandha</item>
        <item>Kurigram</item>
        <item>Lalmonirhat</item>
        <item>Nilphamari</item>
        <item>Panchagarh</item>
        <item>Rangpur</item>
        <item>Thakurgaon</item>
    </string-array>

    <string-array name="sylhet">
        <item>Habiganj</item>
        <item>Moulvibazar</item>
        <item>Sunamganj</item>
        <item>Sylhet</item>
    </string-array>
</resources>



Preview---

![Screenshot_20200326-001247](https://user-images.githubusercontent.com/40088619/77579762-0b1a1600-6f05-11ea-80ba-a0b7b032b1c8.png)
![Screenshot_20200326-001305](https://user-images.githubusercontent.com/40088619/77579767-0ce3d980-6f05-11ea-9828-2055fffc36c5.png)
![Screenshot_20200326-001311](https://user-images.githubusercontent.com/40088619/77579770-0e150680-6f05-11ea-993f-31e63eeeee33.png)
![Screenshot_20200326-001327](https://user-images.githubusercontent.com/40088619/77579772-0e150680-6f05-11ea-963f-c768b8acf87b.png)


