package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask = (Button) findViewById(R.id.button);
        final ImageView ball = (ImageView) findViewById(R.id.imgBall);
        final int balls[] = {
          R.drawable.ball1,
          R.drawable.ball2,
          R.drawable.ball3,
          R.drawable.ball4,
          R.drawable.ball5
        };

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random createRandom = new Random();
                int rand1 = createRandom.nextInt(5);
                System.out.println(rand1);
                ball.setImageResource(balls[rand1]);

            }
        });
    }
}
