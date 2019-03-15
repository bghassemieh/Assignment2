package cejv669.concordia.com.movie_list_a2;


import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Movie> movie_list = new ArrayList<Movie>();

    static int countRecord = 0;
    static int arrayListSize = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_add_record = findViewById(R.id.btn_add_record);
        ListView lv = findViewById(R.id.list_view_result);

        btn_add_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(getApplicationContext(), DataEntry.class);
               startActivityForResult(i,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        arrayListSize = movie_list.size() + 1;

        if(resultCode==RESULT_OK && requestCode==1){

            if(data.hasExtra("movieName")){

                movie_list.add(new Movie(String.valueOf(arrayListSize),
                        data.getStringExtra("movieName"),data.getStringExtra("ratingBar")));

                Toast.makeText(this, String.valueOf(arrayListSize) + " " + movie_list.get(countRecord).getMovie_name()+ " " +
                        movie_list.get(countRecord).getMovie_rate(),Toast.LENGTH_SHORT).show();
                countRecord = countRecord + 1;
            }
        }
    }
}
