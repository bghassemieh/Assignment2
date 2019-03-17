package cejv669.concordia.com.movie_list_a2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;
/*

 */
public class DataEntry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_entry_layout);

        Button btn_save = findViewById(R.id.btn_save);
        final EditText ed_movie_name = findViewById(R.id.ed_data_entry_movie_name);
        final RatingBar ratingBar = findViewById(R.id.data_entry_ratingBar);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("movieName", ed_movie_name.getText().toString());
                data.putExtra("ratingBar",String.valueOf(ratingBar.getRating()));
                setResult(RESULT_OK,data);
                finish();
            }
        });

    }
}
