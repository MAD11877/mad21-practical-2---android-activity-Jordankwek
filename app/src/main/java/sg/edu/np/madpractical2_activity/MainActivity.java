package sg.edu.np.madpractical2_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//Main activity is the child class
//Appcompatactivity is the parent class
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user1 = new User("MAD", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do elusmod tempor incididunt ut labore et dolore magna aliqua", 1,false);
        Button fButton = findViewById(R.id.followBtn);
        Button mButton = findViewById(R.id.msgBtn);
        fButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String fText = fButton.getText().toString();
                if (fText == "Follow") {
                    fButton.setText("Unfollow");
                    user1.setFollowed(false);
                }
                else {
                    fButton.setText("Follow");
                    user1.setFollowed(true);
                }

            }

        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v(TAG, "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"Destroy");
    }
}