package com.example.casper;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextViewMainActivity extends AppCompatActivity {

    private TextView text_view_hello_world;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        text_view_hello_world = findViewById(R.id.text_view_hello_world);
        //text_view_hello_world.setText("你好Android");


        Context context = this.getApplicationContext();
        String resName = "Hello_world2";
        int hello_world2Id = context.getResources().getIdentifier(resName, "string", context.getPackageName());
        text_view_hello_world.setText(this.getString(hello_world2Id));


    }
}
