package com.example.trackfix;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ScrollView;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    public static final List<ListItem> items = new ArrayList<>();
    Button ChangeAbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating the list for the second activity

        items.add(new ListItem(
                "Peach",
                R.drawable.peach,
                "Der Pfirsich[1] (Prunus persica (L.) Batsch) ist eine Pflanzenart aus der Gattung Prunus innerhalb der Familie der Rosengewächse (Rosaceae). Seine Früchte werden Pfirsiche genannt und zählen zum Steinobst.",
                "1,49€"));
        items.add(new ListItem(
                "Tomato",
                R.drawable.tomato,
                "Die Tomate (Solanum lycopersicum), in Teilen von Österreich sowie in Südtirol auch Paradeiser (seltener Paradeisapfel oder Paradiesapfel[1]) genannt, ist eine Pflanzenart aus der Familie der Nachtschattengewächse (Solanaceae). Damit ist sie eng mit anderen Speisegewächsen wie der Kartoffel (Solanum tuberosum), der Paprika (Capsicum) und der Aubergine (Solanum melongena) verwandt, aber auch mit Pflanzen wie der Tollkirsche, der Alraune, der Engelstrompete, der Petunie oder dem Tabak (Nicotiana).",
                "0,99€"));
        items.add(new ListItem(
                "Cucumber",
                R.drawable.cucumber,
                "\"Pickle Rick\" is the third episode of the third season of the Adult Swim animated television series Rick and Morty. Written by Jessica Gao and directed by Anthony Chun, the episode premiered on August 6, 2017. In \"Pickle Rick\", the eccentric scientist Rick Sanchez turns himself into a pickle just as he and his family are scheduled to attend a therapy session. The episode separately follows Rick's adventures as a pickle and the rest of the family's trip to therapy.\n" +
                        "\n" +
                        "The episode parodies action films and was inspired by Breaking Bad episode \"4 Days Out\". In a continuation of the season's storyline of Beth and Jerry's divorce, \"Pickle Rick\" explores Beth's unhealthy relationship with Rick, who disregards the importance of family. It was watched by 2.3 million viewers when it first aired on Adult Swim, having been a highly anticipated episode for the show's fanbase. The episode received positive reviews, particularly praising the animation and design of Pickle Rick and his fight scenes, as well as the performance of guest actors Danny Trejo (as Jaguar) and Susan Sarandon (as Dr. Wong). It won the 2018 Primetime Emmy Award for Outstanding Animated Program, which was the first Emmy Award won by Rick and Morty.k",
                "infinty"));
        items.add(new ListItem(
                "Default",
                R.drawable.ic_launcher_foreground,
                "some default description",
                "99,99€"));


        //ChangeActivity Button
        ChangeAbutton = (Button) findViewById(R.id.ActivityChangeButton);
        ChangeAbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

        final Button removeButton = (Button) findViewById(R.id.removeButton);
        final TextView removeTextView = (TextView) findViewById(R.id.removedTextView);
        //final ScrollView removeScrollView = (ScrollView) findViewById(R.id.removeScrollView);

        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                removeTextView.setVisibility(View.INVISIBLE);
                // removeButton.setVisibility(View.INVISIBLE);
                // removeScrollView.setVisibility((View.INVISIBLE));
            }
        });
    }
}
