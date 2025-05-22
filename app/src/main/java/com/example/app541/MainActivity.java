package com.example.app541;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    public static FrameLayout FrHome,FrFirst,FrSecond;
    private BottomNavigationView Nav1;
    private HomeFrag HomeFrag;
    private FirstFrag FirstFrag;
    private SecondFrag SecondFrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrHome=findViewById(R.id.Frame1);
        FrFirst=findViewById(R.id.Frame2);
        FrSecond=findViewById(R.id.Frame3);
        HomeFrag=new HomeFrag();
        FirstFrag=new FirstFrag();
        SecondFrag=new SecondFrag();
        getSupportFragmentManager().beginTransaction().replace(R.id.Frame1,HomeFrag);
        getSupportFragmentManager().beginTransaction().replace(R.id.Frame2,FirstFrag);
        getSupportFragmentManager().beginTransaction().replace(R.id.Frame3,SecondFrag );
        Nav1=findViewById(R.id.Nav);
        Nav1.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.mnuHome)
                {FrHome.setVisibility(View.VISIBLE);
                    FrFirst.setVisibility(View.INVISIBLE);
                    FrSecond.setVisibility(View.INVISIBLE);}
                if(item.getItemId()==R.id.mnuFrag1)
                {FrHome.setVisibility(View.INVISIBLE);
                    FrFirst.setVisibility(View.VISIBLE);
                    FrSecond.setVisibility(View.INVISIBLE);}
                if(item.getItemId()==R.id.mnuFrag2)
                {FrHome.setVisibility(View.INVISIBLE);
                    FrFirst.setVisibility(View.INVISIBLE);
                    FrSecond.setVisibility(View.VISIBLE);}
                return false;
            }
        });

    }

}
