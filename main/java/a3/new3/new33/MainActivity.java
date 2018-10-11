package a3.new3.new33;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ShimmerFrameLayout shimmerFrameLayout;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.fb);
    }

    public void button(View view) {
        shimmerFrameLayout.stopShimmerAnimation();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    shimmerFrameLayout.startShimmerAnimation();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Onpause", Toast.LENGTH_SHORT).show();
    }

    /*@Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onstart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onstop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }*/
}
