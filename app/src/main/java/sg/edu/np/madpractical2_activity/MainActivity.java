package sg.edu.np.madpractical2_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fButton = findViewById(R.id.followBtn);
        Button mButton = findViewById(R.id.msgBtn);
        fButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String fText = fButton.getText().toString();
                if (fText == "Follow") {
                    fButton.setText("Unfollow");
                }
                else {
                    fButton.setText("Follow");
                }

            }

        });
    }
}