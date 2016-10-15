package com.example.chongshao_mikasa.imagereader;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private int currStatus = 1;
    private ImageView apple;
    private ImageView chair;
    private ImageView mouse;
    private ImageView book;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button switchButton = (Button)findViewById(R.id.button);
        apple = (ImageView)findViewById(R.id.imageView);
        chair = (ImageView)findViewById(R.id.imageView3);
        mouse = (ImageView)findViewById(R.id.imageView4);
        book = (ImageView)findViewById(R.id.imageView2);

        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                currStatus = currStatus + 1;
                if (currStatus == 4) {
                    currStatus = 1;
                }
                String appleUri = "@drawable/apple_w" + String.valueOf(currStatus);  // where myresource (without the extension) is the file
                String chairUri = "@drawable/chair_w" + String.valueOf(currStatus);
                String mouseUri = "@drawable/mouse_w" + String.valueOf(currStatus);
                String bookUri = "@drawable/book_w" + String.valueOf(currStatus);
                int appleImageResource = getResources().getIdentifier(appleUri, null, getPackageName());
                int chairImageResource = getResources().getIdentifier(chairUri, null, getPackageName());
                int mouseImageResource = getResources().getIdentifier(mouseUri, null, getPackageName());
                int bookImageResource = getResources().getIdentifier(bookUri, null, getPackageName());

                Drawable appleRes = getResources().getDrawable(appleImageResource);
                apple.setImageDrawable(appleRes);

                Drawable chairRes = getResources().getDrawable(chairImageResource);
                chair.setImageDrawable(chairRes);

                Drawable mouseRes = getResources().getDrawable(mouseImageResource);
                mouse.setImageDrawable(mouseRes);

                Drawable bookRes = getResources().getDrawable(bookImageResource);
                book.setImageDrawable(bookRes);
            }
        });

    }
}