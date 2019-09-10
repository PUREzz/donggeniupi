package com.example.casper;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeLanguageMainActivity extends AppCompatActivity {

    private Button button_change_language;
    private EditText edit_text_country;
    private TextView text_view_language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        button_change_language = this.findViewById(R.id.button_change_language);
        edit_text_country = this.findViewById(R.id.edit_text_country);
        text_view_language = (TextView) this.findViewById(R.id.text_view_language);

        button_change_language.setOnClickListener(new myOnclickLister());

    }

    class myOnclickLister implements View.OnClickListener {

        public void onClick(View v) {
            Button button = (Button) v;
            String resName1 = "";
            String resName2 = "";
            int Id1 = 0;
            int Id2 = 0;
            String string = edit_text_country.getText().toString();
            resName1 = "language_" + string;
            resName2 = "change_language_" + string;
            if(string.equals("cn")||string.equals("en")||string.equals("jp")||string.equals("kr")){
                resName1 = "language_" + string;
                resName2 = "change_language_" + string;
                Id1 = getResources().getIdentifier(resName1,"string",getPackageName());
                Id2 = getResources().getIdentifier(resName2,"string",getPackageName());
                text_view_language.setText(getString(Id1));
                button_change_language.setText(getString(Id2));
            }

//            if(string.equals("cn")) {
//                resName1 = "language_" + string;
//                resName2 = "change_language_" + string;
//                Id1 = getResources().getIdentifier(resName1,"string",getPackageName());
//                Id2 = getResources().getIdentifier(resName2,"string",getPackageName());
//                text_view_language.setText(getString(Id1));
//                button_change_language.setText(getString(Id2));
//            }
//            else if(string.equals("en")){
//                resName1 = "language_en";
//                resName2 = "change_language_en";
//                Id1 = getResources().getIdentifier(resName1,"string",getPackageName());
//                Id2 = getResources().getIdentifier(resName2,"string",getPackageName());
//                text_view_language.setText(getString(Id1));
//                button_change_language.setText(getString(Id2));
//            }
//            else if(string.equals("jp")){
//                resName1 = "language_jp";
//                resName2 = "change_language_jp";
//                Id1 = getResources().getIdentifier(resName1,"string",getPackageName());
//                Id2 = getResources().getIdentifier(resName2,"string",getPackageName());
//                text_view_language.setText(getString(Id1));
//                button_change_language.setText(getString(Id2));
//            }
//            else if(string.equals("kr")){
//                Id1 = getResources().getIdentifier(resName1,"string",getPackageName());
//                Id2 = getResources().getIdentifier(resName2,"string",getPackageName());
//                text_view_language.setText(getString(Id1));
//                button_change_language.setText(getString(Id2));
//            }
        }
    }
}
