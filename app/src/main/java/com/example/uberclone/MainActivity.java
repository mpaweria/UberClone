package com.example.uberclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

//    private ConstraintLayout layout;
//    private View animView;

//    private TabLayout tabLayout;
//    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

//        tabLayout = findViewById(R.id.tabLayout);
//        viewPager = findViewById(R.id.viewPager);
//
//        tabLayout.setupWithViewPager(viewPager);
//
//        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
//        vpAdapter.addFragments(new HomeFragment(), "Home");
//        vpAdapter.addFragments(new ActivityFragment(), "Activity");
//        vpAdapter.addFragments(new AccountFragment(), "Account");
//        viewPager.setAdapter(vpAdapter);



//        layout = (ConstraintLayout) findViewById(R.id.layoutMain);
//        animView = (View) findViewById(R.id.animView);
//
//        layout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
//            @Override
//            public boolean onPreDraw() {
//                layout.getViewTreeObserver().removeOnPreDrawListener(this);
//                CircularRevealTranslation();
//                return true;
//            }
//        });
    }

//    public void CircularRevealTranslation(){
//
//        int x = (int) layout.getHeight()/2;
//        int y = (int) layout.getWidth()/2;
//        int endRadius = (int) Math.hypot(x,y);
//
//        Animator anim = ViewAnimationUtils.createCircularReveal(animView, x, y, 0, endRadius);
//        animView.setVisibility(View.VISIBLE);
//        anim.start();
//    }

}