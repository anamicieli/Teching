package com.example.nao.other;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nao.R;
import com.example.nao.message.MessagesActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BioActivity extends AppCompatActivity {

    private ImageButton back_button;
    private Button find_partner;
    private Button messageButton;
    private FloatingActionButton recent_messages_fbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bio_page);

        messageButton = findViewById(R.id.nextBtn_messageBox);
        back_button = findViewById(R.id.back_button);
        find_partner=findViewById(R.id.nextBtn_findPartner);
        recent_messages_fbutton=findViewById(R.id.fab);


        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BioActivity.this, MessagesActivity.class);
                startActivity(intent);
            }
        });



        find_partner.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BioActivity.this, FindPartner.class);
                startActivity(intent);
            }
        });

        recent_messages_fbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BioActivity.this, MessagesActivity.class);
                startActivity(intent);
            }
        });

        back_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });




    }
}