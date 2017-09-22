package com.tesco.services.poc.stockmanage;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by QC87 on 9/22/2017.
 */
public class manageDetailsActivity extends Activity {

    private EditText storeNo;
    private RadioButton viewDetails,mapDetails;
    private Button submitButton;

    @Override
    protected   void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_select);

        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_LONG).show();
        addListenerOnButton();

    }

    public  void addListenerOnButton(){

        storeNo=(EditText)findViewById(R.id.storeSelectButton);
        viewDetails= (RadioButton) findViewById(R.id.viewProdDetailsButton);
        mapDetails=(RadioButton)findViewById(R.id.mapProdDetailsButton);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String store = storeNo.getText().toString();
                String viewAction = viewDetails.getText().toString();
                String mapAction = mapDetails.getText().toString();

                Toast.makeText(getApplicationContext(), "Sum of String is :" + store + viewAction+mapAction, Toast.LENGTH_LONG).show();
            }
        });

    }

}
