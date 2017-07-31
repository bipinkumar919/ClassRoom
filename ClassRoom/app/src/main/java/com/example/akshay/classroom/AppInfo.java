package com.example.akshay.classroom;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;

import java.util.ArrayList;
import java.util.List;

public class AppInfo extends AhoyOnboarderActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AhoyOnboarderCard c1 = new AhoyOnboarderCard("Easy Notes", "Get all your notes at one place", R.drawable.book);
        AhoyOnboarderCard c2 = new AhoyOnboarderCard("Handwritten", "Handpicked notes written by toppers", R.drawable.hw);
        AhoyOnboarderCard c3 = new AhoyOnboarderCard("Downloadable", "Just download with a single click", R.drawable.download);

        c1.setBackgroundColor(R.color.black_transparent);
        c2.setBackgroundColor(R.color.black_transparent);
        c3.setBackgroundColor(R.color.black_transparent);

        List<AhoyOnboarderCard> pages=new ArrayList<>();
        pages.add(c1);
        pages.add(c2);
        pages.add(c3);

        for (AhoyOnboarderCard page : pages) {
            page.setTitleColor(R.color.white);
            page.setDescriptionColor(R.color.grey_200);
        }

        setFinishButtonTitle("Finish");
        showNavigationControls(true);
        setGradientBackground();

        //set the button style you created
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            setFinishButtonDrawableStyle(ContextCompat.getDrawable(this, R.drawable.rounded_button));
        }

        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
        setFont(face);

        setOnboardPages(pages);
    }

    @Override
    public void onFinishButtonPressed() {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);

    }
}

