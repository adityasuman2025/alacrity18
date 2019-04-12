package in.mngo.alacrity18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //intializing buttons
    Button submit;
    Button speed;
    Button heart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defining buttons
        submit = (Button) findViewById(R.id.submit);
        speed = (Button) findViewById(R.id.speed);
        heart = (Button) findViewById(R.id.heart);

        //on click of submit button
        submit.setOnClickListener(new View.OnClickListener()
        {
           public void onClick(View v)
           {
               Toast.makeText(MainActivity.this,
                       "calorie burnt calculator coming soon", Toast.LENGTH_SHORT).show();
           }
        });

        //on click of speed button
        speed.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "speedometer coming soon", Toast.LENGTH_SHORT).show();
            }
        });

        //on click of heart button
        heart.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "Heart Beat Rate coming soon", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
