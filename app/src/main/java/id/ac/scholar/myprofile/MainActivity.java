package id.ac.scholar.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConstraint = findViewById(R.id.btnConstraint);
        btnConstraint.setOnClickListener(this);
    }

    public void onClick(View view) {
                Intent constraint = new Intent(MainActivity.this, Constraint.class);
                startActivity(constraint);
        }
    }