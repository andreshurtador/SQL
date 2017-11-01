package com.MikeTheRock.sql;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;


import java.util.HashMap;
import java.util.Map;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    EditText eID, eName, eEmail, ePhone,ePresta;
    Button bCreate, bUpdate, bRead, bDelete;

    int uid = 0;

    User user;


    //    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.frame);
        //getLayoutInflater().inflate(R.layout.activity_main, contentFrameLayout);

        eID = (EditText) findViewById(R.id.eID);
        eName = (EditText) findViewById(R.id.eName);
        eEmail = (EditText) findViewById(R.id.eEmail);
        ePhone = (EditText) findViewById(R.id.ePhone);
        ePresta = (EditText) findViewById(R.id.ePresta);
        bCreate = (Button) findViewById(R.id.bCreate);
        bUpdate = (Button) findViewById(R.id.bUpdate);
        bRead = (Button) findViewById(R.id.bRead);
        bDelete = (Button) findViewById(R.id.bDelete);

        // Write a message to the database
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("message");

        //myRef.setValue("Hello, World!");

    }

    public void onClick(View view) {
        int id = view.getId();
        final String name, email, phone,presta, uuid;


        name = eName.getText().toString();
        email = eEmail.getText().toString();
        phone = ePhone.getText().toString();
        presta = ePresta.getText().toString();

        switch (id) {
            case R.id.bCreate:

                user = new User(name, email, phone,presta, "user" + uid);


                uid++;
                clean();
                break;
            case R.id.bUpdate:

                uuid = eID.getText().toString();


                Map<String, Object> newData = new HashMap<>();
                newData.put("name", name);
                newData.put("email", email);
                newData.put("phone", phone);

                break;
            case R.id.bRead:
                uuid = eID.getText().toString();


                break;
            case R.id.bDelete:
                uuid = eID.getText().toString();


                break;
        }
    }

    private void clean() {
        eEmail.setText("");
        eName.setText("");
        ePhone.setText("");
        eID.setText("");
    }
}
