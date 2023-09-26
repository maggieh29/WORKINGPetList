package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;

import model.Pet;

public class MainActivity extends AppCompatActivity {

    ListView petList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        petList = findViewById(R.id.petList);

        int selection = 2;
        populateListView(selection);
    }

    private void populateListView(int selection) {
        switch (selection) {
            case 1:
                useStringResource();
                break;
            case 2:
                usingDataArray();
                break;

        }
    }

    /**
     * This method populates the list view using a string resource containing
     * the content of a strings array resource
     */
    private void useStringResource() {
        String[] values = getResources().getStringArray(R.array.breeds);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);
        petList.setAdapter(adapter);
    }

    /**
     * This method populates the list view using a string resource containing the list of a data array
     */
    private void usingDataArray() {
        LinkedList<Pet> pets = new LinkedList<Pet>();
        //Pet dog1 = new Pet("John", "Lab", 2);
       //Pet dog2 = new Pet("Bob", "Beagle", 1);
        //Pet dog3 = new Pet("Mary", "Pitbull", 5);
        pets.add(new Pet("John", "Lab", 2));
       pets.add(new Pet("Bob", "Beagle", 1));
       pets.add(new Pet("Mary", "Pitbull", 5));

        ArrayAdapter<Pet> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pets);
        petList.setAdapter(adapter);


    }
}