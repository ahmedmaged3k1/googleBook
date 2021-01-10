package com.example.google_books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailsActivity extends AppCompatActivity {
    private FloatingActionButton bookmark_btn;
    private TextView detail_name;
    private TextView detail_author;
    private TextView detail_description;
    private ImageView detail_img;
    private static final String TAG = "DetailsActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Log.d(TAG, "onCreate: started");
        change_bookmark();
       getIncomingIntnet();



    }
    private void getIncomingIntnet (){

            Log.d(TAG, "getIncomingIntnet: intent found ");
         //   detail_author=findViewById(R.id.detail_author);
        //    detail_author.setText(getIntent().getStringExtra("book_author"));
         //   detail_name=findViewById(R.id.detail_name);
         //   detail_name.setText(getIntent().getStringExtra("book_name"));
            detail_description=findViewById(R.id.book_details);
            detail_description.setText(getIntent().getStringExtra("book_details"));
            detail_img=findViewById(R.id.book_detailedImage);
            detail_img.setImageResource(getIntent().getIntExtra("book_image",0));

    }
    private void change_bookmark(){
        bookmark_btn=findViewById(R.id.bookmark_btn);
        bookmark_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: bookmarkChanged");
                bookmark_btn.setImageResource(R.drawable.bookmarkred);
            }
        });
    }
}